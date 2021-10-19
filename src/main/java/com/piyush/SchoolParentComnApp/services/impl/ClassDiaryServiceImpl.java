package com.piyush.SchoolParentComnApp.services.impl;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.piyush.SchoolParentComnApp.entities.cls.ClassDiary;
import com.piyush.SchoolParentComnApp.repository.IClassDiaryRepository;
import com.piyush.SchoolParentComnApp.services.IClassDairyService;

@Service
public class ClassDiaryServiceImpl implements IClassDairyService {

	@Autowired
	IClassDiaryRepository repo;
	
	@Override
	public ClassDiary addClassDairy(ClassDiary classDiary) {
		System.out.println("Successfully saved");
		return repo.save(classDiary);
	}

	@Override
	public Optional<ClassDiary> retrieveClassDairyById(long id) {
		return repo.findById(id);
	}

}
