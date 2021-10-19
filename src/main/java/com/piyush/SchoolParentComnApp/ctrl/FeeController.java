package com.piyush.SchoolParentComnApp.ctrl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.piyush.SchoolParentComnApp.entities.cls.Student;
import com.piyush.SchoolParentComnApp.entities.fee.Fee;
import com.piyush.SchoolParentComnApp.services.IFeeService;

@RestController
@RequestMapping("/api")
public class FeeController {
	
	@Autowired
	IFeeService feeService;
	
	@PostMapping("/add-fee")
	public Fee addFee(@RequestBody Fee fee)
	{
		return feeService.addFee(fee);
	}
	
	// http://localhost:8080/api/fee/delete-fee/2
	@PostMapping("/delete-fee/{id}")
	public String deleteFee(@PathVariable int id)
	{
		return feeService.deleteFee(id);
	}

	@PutMapping("/update-fee")
	public Fee updateFee(@RequestBody Fee fee)
	{
		return feeService.updateFee(fee);
	}
	
	// http://localhost:8080/api/fee/get-feebyid/2
	@GetMapping("/get-feebyid/{id}")
	public Optional<Fee> retrieveFee(@PathVariable int id)
	{
		return feeService.retrieveFee(id);
	}
	@GetMapping("/feebystudent/{sId}")
	public Fee retrieveFeeByStudent(@PathVariable int sId)
	{
		return feeService.retrieveFeeByStudent(sId);
	}
	@GetMapping("/get-feebymonth")
	public List<Fee> retrieveAllFeeByMonth(@RequestBody int month)
	{
		return feeService.retrieveAllFeeByMonth(month);
	}
}
