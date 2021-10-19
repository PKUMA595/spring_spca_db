package com.piyush.SchoolParentComnApp.services;

import java.util.List;
import java.util.Optional;

import com.piyush.SchoolParentComnApp.entities.cls.ClassId;
import com.piyush.SchoolParentComnApp.entities.cls.Parent;
import com.piyush.SchoolParentComnApp.entities.cls.Student;

public interface IParentService {
	
	Parent  addParent(Parent parent);
	Parent  updateParent(Parent parent);
	List<Parent>  retrieveParentListByClass(int classId);
	Parent  retrieveParentByStudent(long sId);
	Optional<Parent>  retrieveParentById(long id);

}
