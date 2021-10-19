package com.piyush.SchoolParentComnApp.services.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.piyush.SchoolParentComnApp.entities.cls.ClassId;
import com.piyush.SchoolParentComnApp.entities.cls.Parent;
import com.piyush.SchoolParentComnApp.entities.cls.Student;
import com.piyush.SchoolParentComnApp.repository.IParentRepository;
import com.piyush.SchoolParentComnApp.services.IParentService;

@Service
public class ParentServiceImpl implements IParentService {
	
	@Autowired
	IParentRepository parentRepository;

	@Override
	public Parent addParent(Parent parent) {
		System.out.println("Successfully added");
		return parentRepository.save(parent);
		
	}

	@Override
	public Parent updateParent(Parent parent) {
		
		long parentId = parent.getParentId();
		Optional<Parent> existingUserContainer = parentRepository.findById(parentId);
		Parent existingUser = null;
		if(existingUserContainer.isPresent()){
		existingUser = existingUserContainer.get();
		existingUser.setEmailId(parent.getEmailId());
		existingUser.setMobileNumber(parent.getMobileNumber());
		System.out.println("parent updated");
		System.out.println();
		}
		else {
			return parentRepository.save(parent);
		}
		return parentRepository.save(existingUser);
	}

	@Override
	public List<Parent> retrieveParentListByClass(int classId) {
		// TODO Auto-generated method stub
		int class_id_grade = classId;
		List<Parent> existingParent = parentRepository.findByClass(classId);
		return existingParent;
	}

	@Override
	public Parent retrieveParentByStudent(long sId) {
		// TODO Auto-generated method stub
		long std_Id = sId;
		Parent existingParent = null;
		existingParent = parentRepository.findByStudentId(std_Id);
		return existingParent;
	}
	@Override
	public Optional<Parent> retrieveParentById(long id) {
		return parentRepository.findById( id);
	}

}
