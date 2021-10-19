package com.piyush.SchoolParentComnApp.services;

import java.util.List;

import com.piyush.SchoolParentComnApp.entities.cls.Parent;
import com.piyush.SchoolParentComnApp.entities.concern.Concern;

public interface IConcernService {
	
	Concern  addConcern(Concern concern);
	Concern  updateConcern(Concern concern);
	List<Concern>  retrieveAllConcerns();
	List<Concern>  retrieveAllConcernsByParent(int parentId);
	List<Concern>  retrieveAllUnResolvedConcerns();
	List<Concern>  retrieveAllUnResolvedConcernsByParent(int parentId);

}
