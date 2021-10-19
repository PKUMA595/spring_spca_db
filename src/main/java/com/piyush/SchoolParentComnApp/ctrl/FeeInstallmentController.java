package com.piyush.SchoolParentComnApp.ctrl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.piyush.SchoolParentComnApp.entities.cls.Student;
import com.piyush.SchoolParentComnApp.entities.fee.Fee;
import com.piyush.SchoolParentComnApp.entities.fee.FeeInstallment;
import com.piyush.SchoolParentComnApp.services.IFeeInstallmentService;

@RestController
@RequestMapping("/api")
public class FeeInstallmentController {
	
	@Autowired
	IFeeInstallmentService feeInstallmentService;
	
	@PostMapping("/makepayment")
	public FeeInstallment makePayment(@RequestBody FeeInstallment feeInstallment)
	{
		return feeInstallmentService.makePayment(feeInstallment);
	}

	@GetMapping("/pendinginstallment/{studentId}")
	public List<FeeInstallment> pendingInstallments(@PathVariable int   studentId)
	{
		return feeInstallmentService.pendingInstallments(studentId);
	}
	
	// http://localhost:8080/api/feeinstallment/get-feeinstallmentbyid/2
	@GetMapping("/get-feeinstallmentbyid/{id}")
	public Optional<FeeInstallment> retrieveFeeInstallmentById(@PathVariable int id)
	{
		return feeInstallmentService.retrieveFeeInstallmentById(id);
	}
	@GetMapping("/get-feeinstallmentbyfee")
	public List<FeeInstallment> retrieveAllFeeInstallmentsByFee(@RequestBody Fee fee)
	{
		return feeInstallmentService.retrieveAllFeeInstallmentsByFee(fee);
	}
}
