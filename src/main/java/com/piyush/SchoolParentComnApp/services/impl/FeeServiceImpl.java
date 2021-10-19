package com.piyush.SchoolParentComnApp.services.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.piyush.SchoolParentComnApp.entities.cls.Student;
import com.piyush.SchoolParentComnApp.entities.fee.Fee;
import com.piyush.SchoolParentComnApp.repository.IFeeServiceRepository;
import com.piyush.SchoolParentComnApp.services.IFeeService;

@Service
public class FeeServiceImpl implements IFeeService {
	
	@Autowired
	IFeeServiceRepository feeServiceRepository;

	@Override
	public Fee addFee(Fee fee) {
		System.out.println("Fee Successfully added");
		return feeServiceRepository.save(fee);
	}

	@Override
	public String deleteFee(int id) {
		feeServiceRepository.deleteById((long) id);
		return "Fee Successfully deleted";
	}

	@Override
	public Fee updateFee(Fee fee) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Fee> retrieveFee(int id) {
		return feeServiceRepository.findById((long) id);
	}

	@Override
	public Fee retrieveFeeByStudent(int studentId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Fee> retrieveAllFeeByMonth(int month) {
		// TODO Auto-generated method stub
		return null;
	}

}
