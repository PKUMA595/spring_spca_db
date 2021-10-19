package com.piyush.SchoolParentComnApp.entities.concern;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.piyush.SchoolParentComnApp.entities.cls.Parent;

@Entity
@Table(name = "Concern_Table")
public class Concern {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	long concernId;
	String concernDescription;
	boolean resolved;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "parent_Id")
	private Parent parent;
	
	@Enumerated(value = EnumType.STRING)
	private ConcernType concernType;
	
	@Enumerated(value = EnumType.STRING)
	private ConcernParty concernParty;
	
	
	public Concern() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Parent getParent() {
		return parent;
	}
	public void setParent(Parent parent) {
		this.parent = parent;
	}
	public ConcernType getConcernType() {
		return concernType;
	}
	public void setConcernType(ConcernType concernType) {
		this.concernType = concernType;
	}
	public ConcernParty getConcernParty() {
		return concernParty;
	}
	public void setConcernParty(ConcernParty concernParty) {
		this.concernParty = concernParty;
	}
	public long getConcernId() {
		return concernId;
	}
	public void setConcernId(long concernId) {
		this.concernId = concernId;
	}
	public String getConcernDescription() {
		return concernDescription;
	}
	public void setConcernDescription(String concernDescription) {
		this.concernDescription = concernDescription;
	}
	public boolean isResolved() {
		return resolved;
	}
	public void setResolved(boolean resolved) {
		this.resolved = resolved;
	}
	
}
