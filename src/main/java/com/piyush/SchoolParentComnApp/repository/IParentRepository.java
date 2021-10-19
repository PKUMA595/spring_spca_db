package com.piyush.SchoolParentComnApp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.piyush.SchoolParentComnApp.entities.cls.Parent;

public interface IParentRepository extends JpaRepository<Parent, Long> {

	@Query(value = "SELECT * FROM parent where parent_id =(SELECT parent_id From student_details WHERE class_id_grade = ?1)", nativeQuery = true)
	List<Parent> findByClass(int class_id_grade);

	
	@Query (value = "select * from parent where parent_id = (select parent_id from student_details where std_id = ?1)", nativeQuery = true)
	Parent findByStudentId(long std_Id);
}
