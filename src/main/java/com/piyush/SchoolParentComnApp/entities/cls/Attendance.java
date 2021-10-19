package com.piyush.SchoolParentComnApp.entities.cls;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity(name = "Std_Attendance")
public class Attendance {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	long attendanceId;
	
	@Temporal(value = TemporalType.DATE)
	@Column(name = "class_Date")
	Date dateOfClass;
	
	boolean present;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "student_Id")
	private Student student;
	
	
	public Attendance() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	public long getAttendanceId() {
		return attendanceId;
	}
	public void setAttendanceId(long attendanceId) {
		this.attendanceId = attendanceId;
	}
	public Date getDateOfClass() {
		return dateOfClass;
	}
	public void setDateOfClass(Date dateOfClass) {
		this.dateOfClass = dateOfClass;
	}
	public boolean isPresent() {
		return present;
	}
	public void setPresent(boolean present) {
		this.present = present;
	}
	public Attendance(long attendanceId, Date dateOfClass, boolean present, Student student) {
		super();
		this.attendanceId = attendanceId;
		this.dateOfClass = dateOfClass;
		this.present = present;
		this.student = student;
	}
	

}
