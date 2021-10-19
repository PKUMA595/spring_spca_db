package com.piyush.SchoolParentComnApp.entities.cls;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Parent {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	long parentId;
	
	String mobileNumber;
	
	String emailId;
	
	
	public Parent() {
		super();
		// TODO Auto-generated constructor stub
	}
	public long getParentId() {
		return parentId;
	}
	public void setParentId(long parentId) {
		this.parentId = parentId;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	

}
