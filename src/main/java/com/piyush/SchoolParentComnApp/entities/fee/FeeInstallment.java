package com.piyush.SchoolParentComnApp.entities.fee;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class FeeInstallment {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int feeInstallmentId;
	double feeInstallment;
	LocalDate dueDate;
	LocalDate feePaymentDate;
	
	
	public FeeInstallment() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getFeeInstallmentId() {
		return feeInstallmentId;
	}
	public void setFeeInstallmentId(int feeInstallmentId) {
		this.feeInstallmentId = feeInstallmentId;
	}
	public double getFeeInstallment() {
		return feeInstallment;
	}
	public void setFeeInstallment(double feeInstallment) {
		this.feeInstallment = feeInstallment;
	}
	public LocalDate getDueDate() {
		return dueDate;
	}
	public void setDueDate(LocalDate dueDate) {
		this.dueDate = dueDate;
	}
	public LocalDate getFeePaymentDate() {
		return feePaymentDate;
	}
	public void setFeePaymentDate(LocalDate feePaymentDate) {
		this.feePaymentDate = feePaymentDate;
	}
	
	
}
