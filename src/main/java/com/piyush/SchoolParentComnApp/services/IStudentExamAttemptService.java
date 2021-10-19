package com.piyush.SchoolParentComnApp.services;

import java.util.List;

import com.piyush.SchoolParentComnApp.entities.cls.Student;
import com.piyush.SchoolParentComnApp.entities.exam.StudentExamAttempt;

public interface IStudentExamAttemptService {
	
	StudentExamAttempt  addStudentExamAttempt(StudentExamAttempt studentExamAttempt);
	StudentExamAttempt  updateStudentExamAttempt(StudentExamAttempt studentExamAttempt);
	StudentExamAttempt  deleteStudentExamAttempt(int studentExamAttemptId);
	List<StudentExamAttempt>  retrieveAllStudentExamAttemptByStudent(int studentId);
	StudentExamAttempt  retrieveStudentExamAttemptById(int id);

}
