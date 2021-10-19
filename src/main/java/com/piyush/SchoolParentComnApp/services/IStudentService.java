package com.piyush.SchoolParentComnApp.services;

import java.util.List;
import java.util.Optional;

import com.piyush.SchoolParentComnApp.entities.cls.Student;

public interface IStudentService {
	
	Student  addStudent(Student student);
	Student  updateStudent(Student student);
	String  deleteStudent(long id);
	List<Student>  retrieveAllStudents();
	Optional<Student>  retrieveStudentById(long id);

}
