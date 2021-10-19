package com.piyush.SchoolParentComnApp.services;

import java.util.List;
import java.util.Optional;

import com.piyush.SchoolParentComnApp.entities.cls.Student;
import com.piyush.SchoolParentComnApp.entities.fee.Fee;
import com.piyush.SchoolParentComnApp.entities.fee.FeeInstallment;

public interface IFeeInstallmentService {
	
	FeeInstallment  makePayment(FeeInstallment feeInstallment);
	List<FeeInstallment>  pendingInstallments(int studentId);
	Optional<FeeInstallment> retrieveFeeInstallmentById(int id);
	List<FeeInstallment>  retrieveAllFeeInstallmentsByFee(Fee fee);
	

}
