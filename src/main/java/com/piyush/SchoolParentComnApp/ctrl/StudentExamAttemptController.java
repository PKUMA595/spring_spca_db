package com.piyush.SchoolParentComnApp.ctrl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.piyush.SchoolParentComnApp.entities.cls.Student;
import com.piyush.SchoolParentComnApp.entities.exam.StudentExamAttempt;
import com.piyush.SchoolParentComnApp.services.IStudentExamAttemptService;

@RestController
@RequestMapping("/api")
public class StudentExamAttemptController {
	
	@Autowired
	IStudentExamAttemptService service;
	
	@PostMapping("/studentexamattempt")
	public StudentExamAttempt addStudentExamAttempt(@RequestBody StudentExamAttempt studentExamAttempt)
	{
		return service.addStudentExamAttempt(studentExamAttempt);
	}
	@PutMapping("/update-studentexamattempt")
	public StudentExamAttempt updateStudentExamAttempt(@RequestBody StudentExamAttempt studentExamAttempt)
	{
		return service.updateStudentExamAttempt(studentExamAttempt);
	}
	@DeleteMapping("/delete-studentexamattempt/{id}")
	public StudentExamAttempt deleteStudentExamAttempt(@PathVariable int studentExamAttemptId)
	{
		return service.deleteStudentExamAttempt(studentExamAttemptId);
	}
	@GetMapping("/studentexamattempt/{studentId}")
	public List<StudentExamAttempt> retrieveAllStudentExamAttemptByStudent(@PathVariable int studentId)
	{
		return service.retrieveAllStudentExamAttemptByStudent(studentId);
	}

	// http://localhost:8080/api/studentexamattempt/get-studentexamattempt-byid/2
	@GetMapping("/get-studentexamattempt-byid/{id}")
	public StudentExamAttempt retrieveStudentExamAttemptById(@PathVariable int id)
	{
		return service.retrieveStudentExamAttemptById(id);
	}
}
