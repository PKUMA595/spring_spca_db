package com.piyush.SchoolParentComnApp.services.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.piyush.SchoolParentComnApp.entities.cls.Parent;
import com.piyush.SchoolParentComnApp.entities.concern.Concern;
import com.piyush.SchoolParentComnApp.repository.IConcernServiceRepository;
import com.piyush.SchoolParentComnApp.repository.IParentRepository;
import com.piyush.SchoolParentComnApp.services.IConcernService;

@Service
public class ConcernServiceImpl implements IConcernService {
	
	@Autowired
	IConcernServiceRepository repo;
	@Autowired
	IParentRepository parentRepo;

	@Override
	public Concern addConcern(Concern concern) {
		Parent parent = concern.getParent();
		if(parent != null)
		{
			long parentId = parent.getParentId();
			Optional<Parent> resParent = parentRepo.findById(parentId);
			if(resParent.isPresent()) {
				concern.setParent(resParent.get());
			}
		}
		System.out.println("Successfully added");
		return repo.save(concern) ;
	}


	@Override
	public Concern updateConcern(Concern concern) {
		long concernId = concern.getConcernId();
		Optional<Concern> existingConcernContainer = repo.findById(concernId);
		Concern existingConcern = null;
		if(existingConcernContainer.isPresent())
		{
			existingConcern = existingConcernContainer.get();
			existingConcern.setConcernDescription(concern.getConcernDescription());
			existingConcern.setConcernId(concern.getConcernId());
			existingConcern.setConcernParty(concern.getConcernParty());
			existingConcern.setConcernType(concern.getConcernType());
			existingConcern.setParent(concern.getParent());
			existingConcern.setResolved(concern.isResolved());
			System.out.println("concern updated");
			
		}
		else {
		return repo.save(concern);
		}
		return repo.save(existingConcern);
	}

	@Override
	public List<Concern> retrieveAllConcerns() {
		return repo.findAll();
	}

	@Override
	public List<Concern> retrieveAllConcernsByParent(int parentId) {
		return repo.findAllById(parentId);
	}

	@Override
	public List<Concern> retrieveAllUnResolvedConcerns() {
		// TODO Auto-generated method stub
		 return repo.retrieveAllUnResolvedConcerns();
	}

	
	@Override
	public List<Concern> retrieveAllUnResolvedConcernsByParent(int parentId) {
		// TODO Auto-generated method stub
		return repo.retrieveAllUnResolvedConcernsByParent(parentId);
		
	}

}
