package com.piyush.SchoolParentComnApp.entities.fee;

import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.piyush.SchoolParentComnApp.entities.cls.Student;

@Entity
@Table(name = "Student_fee")
public class Fee {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int feeId;
	double totalFeesDue;
	double totalFeesReceived;
	LocalDate startMonthYear;
	LocalDate endMonthYear;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "std_id")
	private Student student;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "feeInstl_Id")
	private FeeInstallment feeInstallment;
	
	
	public Fee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	public FeeInstallment getFeeInstallment() {
		return feeInstallment;
	}
	public void setFeeInstallment(FeeInstallment feeInstallment) {
		this.feeInstallment = feeInstallment;
	}
	public int getFeeId() {
		return feeId;
	}
	public void setFeeId(int feeId) {
		this.feeId = feeId;
	}
	public double getTotalFeesDue() {
		return totalFeesDue;
	}
	public void setTotalFeesDue(double totalFeesDue) {
		this.totalFeesDue = totalFeesDue;
	}
	public double getTotalFeesReceived() {
		return totalFeesReceived;
	}
	public void setTotalFeesReceived(double totalFeesReceived) {
		this.totalFeesReceived = totalFeesReceived;
	}
	public LocalDate getStartMonthYear() {
		return startMonthYear;
	}
	public void setStartMonthYear(LocalDate startMonthYear) {
		this.startMonthYear = startMonthYear;
	}
	public LocalDate getEndMonthYear() {
		return endMonthYear;
	}
	public void setEndMonthYear(LocalDate endMonthYear) {
		this.endMonthYear = endMonthYear;
	}
	
	
}
