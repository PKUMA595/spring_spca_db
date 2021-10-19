package com.piyush.SchoolParentComnApp.ctrl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.piyush.SchoolParentComnApp.entities.cls.Attendance;
import com.piyush.SchoolParentComnApp.entities.cls.Student;
import com.piyush.SchoolParentComnApp.services.IAttendanceService;

@RestController
@RequestMapping("/api")
public class AttendanceController {
	
	@Autowired
	IAttendanceService attendanceService;
	
	@PostMapping("/attendance")
	public Attendance addAttendance(@RequestBody Attendance attendance)
	{
		return attendanceService.addAttendance(attendance);
	}
	
	@PutMapping("/attendance")
	public Attendance updateAttendance(@RequestBody Attendance attendance)
	{
		return attendanceService.updateAttendance(attendance);
	}

	@GetMapping("/attendance")
	public List<Attendance> listAttendanceByStudent()
	{
		return attendanceService.listAttendanceByStudent();
	}
}
