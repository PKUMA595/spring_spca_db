package com.piyush.SchoolParentComnApp.ctrl;

import java.time.LocalDate;
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

import com.piyush.SchoolParentComnApp.entities.cls.ClassId;
import com.piyush.SchoolParentComnApp.entities.cls.Student;
import com.piyush.SchoolParentComnApp.entities.exam.Exam;
import com.piyush.SchoolParentComnApp.services.IExamService;

@RestController
@RequestMapping("api/exam")
public class ExamController {
	
	@Autowired
	IExamService examService;
	
	@PostMapping("/exam")
	public Exam addExam(@RequestBody Exam exam)
	{
		return examService.addExam(exam);
	}
	@DeleteMapping("/exam")
	public String deleteExam(@RequestBody Exam exam)
	{
		return examService.deleteExam(exam);
	}
	@PutMapping("/exam")
	public Exam updateExam(@RequestBody Exam exam)
	{
		return examService.updateExam(exam);
	}
	
	@GetMapping("/exams")
	public List<Exam> listAllExamsByDate(@RequestBody LocalDate date)
	{
		return examService.listAllExamsByDate(date);
	}
	
	@GetMapping("/exams/{classId}")
	public List<Exam> listAllExamsByClass(@PathVariable int cId)
	{
		return examService.listAllExamsByClass(cId);
	}

	@GetMapping("/examsbystudent")
	public List<Exam> listAllExamsByStudent(@RequestBody Student student)
	{
		return examService.listAllExamsByStudent(student);
	}
	
	// http://localhost:8080/api/exam/exambyid/2
	@GetMapping("/exambyid/{id}")
	public Exam listExamById(@PathVariable int id)
	{
		return examService.listExamById(id);
	}
}
