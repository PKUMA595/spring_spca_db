package com.piyush.SchoolParentComnApp.entities.exam;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import com.piyush.SchoolParentComnApp.entities.cls.Student;

@Entity
public class StudentExamAttempt {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int studentExamAttemptId;
	
	@Column(name = "exam_attempt")
	boolean attempted;
	int markesObtained;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "exam_id")
	private Exam exam;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "std_Id")
	private Student student;
	
	
	public StudentExamAttempt() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Exam getExam() {
		return exam;
	}
	public void setExam(Exam exam) {
		this.exam = exam;
	}
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	public int getStudentExamAttemptId() {
		return studentExamAttemptId;
	}
	public void setStudentExamAttemptId(int studentExamAttemptId) {
		this.studentExamAttemptId = studentExamAttemptId;
	}
	public boolean isAttempted() {
		return attempted;
	}
	public void setAttempted(boolean attempted) {
		this.attempted = attempted;
	}
	public int getMarkesObtained() {
		return markesObtained;
	}
	public void setMarkesObtained(int markesObtained) {
		this.markesObtained = markesObtained;
	}
	

}
