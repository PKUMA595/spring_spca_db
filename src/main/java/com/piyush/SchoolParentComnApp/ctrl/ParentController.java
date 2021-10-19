package com.piyush.SchoolParentComnApp.ctrl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.piyush.SchoolParentComnApp.entities.cls.ClassId;
import com.piyush.SchoolParentComnApp.entities.cls.Parent;
import com.piyush.SchoolParentComnApp.entities.cls.Student;
import com.piyush.SchoolParentComnApp.services.IParentService;

@RestController
@RequestMapping("/api")
public class ParentController {
	
	@Autowired
	IParentService parentService;
	
	@PostMapping("/parent")
	public Parent addParent(@RequestBody Parent parent)
	{
		return parentService.addParent(parent);
	}
	@PutMapping("/parent")
	public Parent updateParen(@RequestBody Parent parent)
	{
		return parentService.updateParent(parent);
	}

	@GetMapping("/parentbyclass/{classId}")
	public List<Parent> retrieveParentListByClass(@PathVariable int classId)
	{
		return parentService.retrieveParentListByClass(classId);
	}
	@GetMapping("/parentbystudent/{sId}")
	public Parent retrieveParentByStudent(@PathVariable long sId)
	{
		return parentService.retrieveParentByStudent(sId);
	}
	// http://localhost:8080/api/parent/get-parentbyid/2
	@GetMapping("/parentbyid/{id}")
	public Optional<Parent> retrieveParentById(@PathVariable long id)
	{
		return parentService.retrieveParentById(id);
	}
}
