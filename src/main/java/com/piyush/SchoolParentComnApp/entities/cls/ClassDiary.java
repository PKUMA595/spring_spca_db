package com.piyush.SchoolParentComnApp.entities.cls;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ClassDiary {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	long classDiaryId;

	
	public ClassDiary() {
		super();
		// TODO Auto-generated constructor stub
	}

	public long getClassDiaryId() {
		return classDiaryId;
	}

	public void setClassDiaryId(long classDiaryId) {
		this.classDiaryId = classDiaryId;
	}

	public ClassDiary(int classDiaryId) {
		super();
		this.classDiaryId = classDiaryId;
	}
	

}
