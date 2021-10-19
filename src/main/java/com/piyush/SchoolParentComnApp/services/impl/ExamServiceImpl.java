package com.piyush.SchoolParentComnApp.services.impl;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.piyush.SchoolParentComnApp.entities.cls.ClassId;
import com.piyush.SchoolParentComnApp.entities.cls.Student;
import com.piyush.SchoolParentComnApp.entities.exam.Exam;
import com.piyush.SchoolParentComnApp.repository.IExamRepository;
import com.piyush.SchoolParentComnApp.services.IExamService;

@Service
public class ExamServiceImpl implements IExamService {
	
	@Autowired
	IExamRepository examRepository;

	@Override
	public Exam addExam(Exam exam) {
		System.out.println("Exam successfully added");
		return examRepository.save(exam);
	}

	@Override
	public String deleteExam(Exam exam) {
		
		examRepository.delete(exam);
		return "Exam successfully deleted";
	}

	@Override
	public Exam updateExam(Exam exam) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Exam> listAllExamsByDate(LocalDate date) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Exam> listAllExamsByClass(int classId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Exam> listAllExamsByStudent(Student student) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Exam listExamById(int id) {
		return examRepository.getById((long) id);
	}

}
