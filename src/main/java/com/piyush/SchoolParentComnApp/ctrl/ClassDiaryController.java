package com.piyush.SchoolParentComnApp.ctrl;


import java.util.Date;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.piyush.SchoolParentComnApp.entities.cls.ClassDiary;
import com.piyush.SchoolParentComnApp.services.IClassDairyService;

@RestController
@RequestMapping("/api")
public class ClassDiaryController {
	
	@Autowired
	IClassDairyService classDairyService;
	
	@PostMapping("/classdiary")
	public ClassDiary addClassDiary(@RequestBody  ClassDiary classDiary)
	{
		return classDairyService.addClassDairy(classDiary);
	}

	@GetMapping("/classdiaryById/{id}")
	public Optional<ClassDiary> retrieveClassDairyById(@PathVariable long id)
	{
		return classDairyService.retrieveClassDairyById(id);
	}
}
