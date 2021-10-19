package com.piyush.SchoolParentComnApp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.piyush.SchoolParentComnApp.entities.concern.Concern;

public interface IConcernServiceRepository extends JpaRepository<Concern, Long> {

	@Query(value="select * from concern_table where resolved = false and parent_id =?1", nativeQuery = true)
	List<Concern> retrieveAllUnResolvedConcernsByParent(int parentId);
	
@Query(value="select * from  concern_table where parent_id =?1", nativeQuery = true)
	List<Concern> findAllById(int parentId);

@Query(value="select * from concern_table where resolved = false", nativeQuery = true)
List<Concern> retrieveAllUnResolvedConcerns();

}
