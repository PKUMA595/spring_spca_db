package com.piyush.SchoolParentComnApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.piyush.SchoolParentComnApp.entities.fee.Fee;

public interface IFeeServiceRepository extends JpaRepository<Fee, Long> {

}
