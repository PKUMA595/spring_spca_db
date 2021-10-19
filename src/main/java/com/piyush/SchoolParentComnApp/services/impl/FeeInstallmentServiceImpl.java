package com.piyush.SchoolParentComnApp.services.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.piyush.SchoolParentComnApp.entities.cls.Student;
import com.piyush.SchoolParentComnApp.entities.fee.Fee;
import com.piyush.SchoolParentComnApp.entities.fee.FeeInstallment;
import com.piyush.SchoolParentComnApp.repository.IFeeInstallmentRepository;
import com.piyush.SchoolParentComnApp.services.IFeeInstallmentService;

@Service
public class FeeInstallmentServiceImpl implements IFeeInstallmentService {
	
	@Autowired
	IFeeInstallmentRepository feeInstallmentRepository;

	@Override
	public FeeInstallment makePayment(FeeInstallment feeInstallment) {
		System.out.println("FeeInstallment successfully added");
		return feeInstallmentRepository.save(feeInstallment);
	}

	@Override
	public List<FeeInstallment> pendingInstallments(int studentId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<FeeInstallment> retrieveFeeInstallmentById(int id) {
		return feeInstallmentRepository.findById((long) id);
	}

	@Override
	public List<FeeInstallment> retrieveAllFeeInstallmentsByFee(Fee fee) {
		return feeInstallmentRepository.findAll();
	}

}
