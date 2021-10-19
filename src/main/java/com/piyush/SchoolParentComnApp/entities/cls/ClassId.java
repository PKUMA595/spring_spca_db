package com.piyush.SchoolParentComnApp.entities.cls;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Std_class")
public class ClassId {
	
	
	String classTeacher;
	@Id
	int grade;
	char division;
	
	public ClassId() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getClassTeacher() {
		return classTeacher;
	}
	public void setClassTeacher(String classTeacher) {
		this.classTeacher = classTeacher;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public char getDivision() {
		return division;
	}
	public void setDivision(char division) {
		this.division = division;
	}
	@Override
	public String toString() {
		return "ClassId [classTeacher=" + classTeacher + ", grade=" + grade + ", division=" + division + "]";
	}
	public ClassId(String classTeacher, int grade, char division) {
		super();
		this.classTeacher = classTeacher;
		this.grade = grade;
		this.division = division;
	}
	
	
	

}
