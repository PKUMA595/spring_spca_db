package com.piyush.SchoolParentComnApp.services;


import java.util.Optional;

import com.piyush.SchoolParentComnApp.entities.cls.ClassDiary;


public interface IClassDairyService {
	
	ClassDiary  addClassDairy(ClassDiary classDiary);

	Optional<ClassDiary> retrieveClassDairyById(long id);

}
