package com.piyush.SchoolParentComnApp.entities.cls;

import javax.persistence.CascadeType;
import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.MapKeyColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "teacher_details")
public class Teacher {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int teacherId;
	
	@Column(name = "teachres_name")
	String name;

	@OneToOne(cascade = CascadeType.ALL)
	private ClassId classId;
	
	
	public Teacher() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ClassId getClassId() {
		return classId;
	}
	public void setClassId(ClassId classId) {
		this.classId = classId;
	}
	public int getTeacherId() {
		return teacherId;
	}
	public void setTeacherId(int teacherId) {
		this.teacherId = teacherId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}


	
}
