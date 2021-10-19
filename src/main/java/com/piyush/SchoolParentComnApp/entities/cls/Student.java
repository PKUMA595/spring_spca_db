package com.piyush.SchoolParentComnApp.entities.cls;

import java.time.LocalDate;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity(name="Student_details")
public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "std_Id")
	long userId;
	
	@Temporal(value = TemporalType.DATE)
	@Column(name ="dob")
	private Date dateOfBirth;
	
	@Column(name="std_name")
	String name;
	
	@Column(name = "std_emailId")
	String emailId;
	
	@Column(name = "std_contact")
	String mobileNumber;
	
	@OneToOne(cascade = CascadeType.ALL)
	private Subject subject;
	
	@ManyToOne(cascade = CascadeType.ALL)
	private ClassId classId;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "parentId")
	private Parent parent;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "clsDiary_Id")
	private ClassDiary classDiary;
	
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Parent getParent() {
		return parent;
	}
	public void setParent(Parent parent) {
		this.parent = parent;
	}
	public ClassDiary getClassDiary() {
		return classDiary;
	}
	public void setClassDiary(ClassDiary classDiary) {
		this.classDiary = classDiary;
	}
	public Subject getSubject() {
		return subject;
	}
	public void setSubject(Subject subject) {
		this.subject = subject;
	}
	public ClassId getClassId() {
		return classId;
	}
	public void setClassId(ClassId classId) {
		this.classId = classId;
	}
	public long getUserId() {
		return userId;
	}
	public void setUserId(long userId) {
		this.userId = userId;
	}
	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}


}
