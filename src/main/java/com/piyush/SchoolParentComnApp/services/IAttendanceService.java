package com.piyush.SchoolParentComnApp.services;

import java.util.Date;
import java.util.List;

import com.piyush.SchoolParentComnApp.entities.cls.Attendance;
import com.piyush.SchoolParentComnApp.entities.cls.Student;

public interface IAttendanceService {
	
	Attendance  addAttendance(Attendance attendance);
	Attendance  updateAttendance(Attendance attendance);
	List<Attendance>  listAttendanceByStudent();
	

}
