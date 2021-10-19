package com.piyush.SchoolParentComnApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.piyush.SchoolParentComnApp.entities.cls.Student;

public interface IStudentRepository extends JpaRepository<Student, Long> {

}
