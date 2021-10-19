package com.piyush.SchoolParentComnApp.entities.cls;

import java.util.Map;

import javax.persistence.CascadeType;
import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapKeyColumn;
import javax.persistence.OneToOne;

@Entity
public class DiaryNotes {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	long diaryNotesId;
	
	//@ElementCollection
	//@CollectionTable(name = "subject_notes_mapping", joinColumns = {@JoinColumn(name = "notes_Id", referencedColumnName = "diaryNotesId")})
	//@MapKeyColumn(name = "sub_Notes")
	@Column(name = "notes")
	//private Map<Subject, String> notes;
	private String notes;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "clsDiary_Id")
	private ClassDiary classDiary;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "subject_id")
	private Subject subject;
	public Subject getSubject() {
		return subject;
	}
	public void setSubject(Subject subject) {
		this.subject = subject;
	}
	public DiaryNotes() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ClassDiary getClassDiary() {
		return classDiary;
	}
	public void setClassDiary(ClassDiary classDiary) {
		this.classDiary = classDiary;
	}
	public long getDiaryNotesId() {
		return diaryNotesId;
	}
	public void setDiaryNotesId(long diaryNotesId) {
		this.diaryNotesId = diaryNotesId;
	}
	public String getNotes() {
		return notes;
	}
	public void setNotes(String notes) {
		this.notes = notes;
	}
	
	}
	
	


