package com.piyush.SchoolParentComnApp.services.impl;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.google.common.base.Optional;
import com.piyush.SchoolParentComnApp.entities.cls.Parent;
import com.piyush.SchoolParentComnApp.entities.cls.Student;
import com.piyush.SchoolParentComnApp.repository.IStudentRepository;
import com.piyush.SchoolParentComnApp.services.IStudentExamAttemptService;
import com.piyush.SchoolParentComnApp.services.IStudentService;

@Service
public class StudentServiceImpl implements IStudentService {

	@Autowired
	IStudentRepository studentRepository;
	
	@Override
	public Student addStudent(Student student) {
		System.out.println("Successfully added");
		return studentRepository.save(student);
	}

	@Override
	public Student updateStudent(Student student) {
		long studentId = student.getUserId();
		java.util.Optional<Student> ExistingStudentContainer = studentRepository.findById(studentId);
		Student ExistingStudent = null;
		if(ExistingStudentContainer.isPresent()) {
			ExistingStudent = ExistingStudentContainer.get();
			ExistingStudent.setClassDiary(student.getClassDiary());
			ExistingStudent.setClassId(student.getClassId());
			ExistingStudent.setDateOfBirth(student.getDateOfBirth());
			ExistingStudent.setEmailId(student.getEmailId());
			ExistingStudent.setMobileNumber(student.getMobileNumber());
			ExistingStudent.setName(student.getName());
			ExistingStudent.setParent(student.getParent());
			ExistingStudent.setSubject(student.getSubject());
			ExistingStudent.setUserId(studentId);
			System.out.println("student updated successfully");
			
		}
		else {
			System.out.println("student added successfully");
			return studentRepository.save(student);
		}
		return studentRepository.save(ExistingStudent);
	}

	@Override
	public String deleteStudent(long id) {
		java.util.Optional<Student> existingStudentContainer = studentRepository.findById(id);
		Student existingStudent = null;
		if(existingStudentContainer.isPresent()) {
			existingStudent = existingStudentContainer.get();
		studentRepository.delete(existingStudent);
		return "Student successfully deleted";
		}
		
		return "Student Not present in list";
		
		
	}

	@Override
	public List<Student> retrieveAllStudents() {
		return studentRepository.findAll();
	}

	@Override
	public java.util.Optional<Student> retrieveStudentById(long id) {
		return studentRepository.findById(id);
	}

}
