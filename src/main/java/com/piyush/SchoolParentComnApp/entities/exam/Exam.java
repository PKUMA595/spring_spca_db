package com.piyush.SchoolParentComnApp.entities.exam;

import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.piyush.SchoolParentComnApp.entities.cls.ClassId;
import com.piyush.SchoolParentComnApp.entities.cls.Subject;

@Entity
@Table(name = "Exams_table")
public class Exam {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int examId;
	LocalDate dateTimeOfExam;
	int maxMarks;
	
	@OneToOne(cascade = CascadeType.ALL)
	private ClassId classId;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "subject_Id")
	private Subject subject;
	
	@Enumerated(value = EnumType.STRING)
	@Column(name = "exam_Type")
	private ExamType examType;
	
	
	public Exam() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ClassId getClassId() {
		return classId;
	}
	public void setClassId(ClassId classId) {
		this.classId = classId;
	}
	public Subject getSubject() {
		return subject;
	}
	public void setSubject(Subject subject) {
		this.subject = subject;
	}
	public ExamType getExamType() {
		return examType;
	}
	public void setExamType(ExamType examType) {
		this.examType = examType;
	}
	public int getExamId() {
		return examId;
	}
	public void setExamId(int examId) {
		this.examId = examId;
	}
	public LocalDate getDateTimeOfExam() {
		return dateTimeOfExam;
	}
	public void setDateTimeOfExam(LocalDate dateTimeOfExam) {
		this.dateTimeOfExam = dateTimeOfExam;
	}
	public int getMaxMarks() {
		return maxMarks;
	}
	public void setMaxMarks(int maxMarks) {
		this.maxMarks = maxMarks;
	}
	
	
}
