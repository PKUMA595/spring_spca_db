package com.piyush.SchoolParentComnApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.piyush.SchoolParentComnApp.entities.exam.StudentExamAttempt;

public interface IStudentExamAttemptRepository extends JpaRepository<StudentExamAttempt, Long> {

}
