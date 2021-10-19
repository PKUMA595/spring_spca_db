package com.piyush.SchoolParentComnApp.services;

import java.util.List;
import java.util.Optional;

import com.piyush.SchoolParentComnApp.entities.cls.Student;
import com.piyush.SchoolParentComnApp.entities.fee.Fee;

public interface IFeeService {
	
	Fee  addFee(Fee fee);
	String  deleteFee(int id);
	Fee  updateFee(Fee fee);
	Optional<Fee>  retrieveFee(int id);
	Fee  retrieveFeeByStudent(int studentId);
	List<Fee>  retrieveAllFeeByMonth(int month); // List<Fee>

}
