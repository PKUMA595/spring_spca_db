package com.piyush.SchoolParentComnApp.services;

import java.time.LocalDate;
import java.util.List;

import com.piyush.SchoolParentComnApp.entities.cls.ClassId;
import com.piyush.SchoolParentComnApp.entities.cls.Student;
import com.piyush.SchoolParentComnApp.entities.exam.Exam;

public interface IExamService {
	
	Exam  addExam(Exam exam);
	String deleteExam(Exam exam);
	Exam  updateExam(Exam exam);
	List<Exam>  listAllExamsByDate(LocalDate date); // List<Exam>
	List<Exam>  listAllExamsByClass(int classId);
	List<Exam>  listAllExamsByStudent(Student student);
	Exam  listExamById(int id);

}
