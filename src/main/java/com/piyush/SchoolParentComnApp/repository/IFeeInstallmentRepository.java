package com.piyush.SchoolParentComnApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.piyush.SchoolParentComnApp.entities.fee.FeeInstallment;

public interface IFeeInstallmentRepository extends JpaRepository<FeeInstallment, Long> {

}
