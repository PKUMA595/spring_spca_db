package com.piyush.SchoolParentComnApp.ctrl;

import java.util.List;
import java.util.Optional;

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
import com.piyush.SchoolParentComnApp.services.IStudentService;

@RestController
@RequestMapping("/api")
public class StudentController {
	
	@Autowired
	IStudentService studentService;
	
	@PostMapping("/add-student")
	public Student addStudent(@RequestBody Student student)
	{
		return studentService.addStudent(student);
	}
	@PutMapping("/update-student")
	public Student updateStudent(@RequestBody  Student student)
	{
		return studentService.updateStudent(student);
	}

	@DeleteMapping("/delete-studentbyid/{id}")
	public String deleteStudent(@PathVariable long id)
	{
		return studentService.deleteStudent(id);
	}
	
	@GetMapping("/allstudents")
	public List<Student> retrieveAllStudents()
	{
		return studentService.retrieveAllStudents();
	}
	
	// http://localhost:8080/api/student/get-studentsbyid/2
	@GetMapping("/studentsbyid/{id}")
	public Optional<Student> retrieveStudentById(@PathVariable long id)
	{
		return studentService.retrieveStudentById(id);
	}
}
