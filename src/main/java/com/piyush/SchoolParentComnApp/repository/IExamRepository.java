package com.piyush.SchoolParentComnApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.piyush.SchoolParentComnApp.entities.exam.Exam;

public interface IExamRepository extends JpaRepository<Exam, Long> {

}
