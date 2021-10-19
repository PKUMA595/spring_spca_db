package com.piyush.SchoolParentComnApp.entities.cls;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Subject_details")
public class Subject {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int subjectId;
	
	@Column(name = "subject_title")
	String title;
	
	
	public Subject() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getSubjectId() {
		return subjectId;
	}
	public void setSubjectId(int subjectId) {
		this.subjectId = subjectId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	

}
