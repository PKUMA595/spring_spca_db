package com.piyush.SchoolParentComnApp.services.impl;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.piyush.SchoolParentComnApp.entities.cls.Attendance;
import com.piyush.SchoolParentComnApp.entities.cls.Student;
import com.piyush.SchoolParentComnApp.repository.IAttendanceRepository;
import com.piyush.SchoolParentComnApp.services.IAttendanceService;

@Service
public class AttendanceServiceImpl implements IAttendanceService {
	
	@Autowired
	IAttendanceRepository repo;

	@Override
	public Attendance addAttendance(Attendance attendance) {

		attendance.setDateOfClass(new Date());
		System.out.println("Successfully saved");
		return repo.save(attendance);
		
	}

	@Override
	public Attendance updateAttendance(Attendance attendance) {
		long attendanceId = attendance.getAttendanceId();
		Optional<Attendance> existingAttendanceContainer = repo.findById(attendanceId);
		Attendance existingAttendance = null;
		if(existingAttendanceContainer.isPresent()) {
			existingAttendance = existingAttendanceContainer.get();
			//existingAttendance.setAttendanceId(attendance.getAttendanceId());
			existingAttendance.setDateOfClass(new Date());
			existingAttendance.setPresent(attendance.isPresent());
			existingAttendance.setStudent(attendance.getStudent());
			System.out.println("attendance updated successfully");
		}
		
		else {
			attendance.setDateOfClass(new Date());
			System.out.println("attendance added successfully");
			return repo.save(attendance);
		}
		repo.delete(attendance);
		return repo.save(attendance);
	}

	@Override
	public List<Attendance> listAttendanceByStudent() {
		return repo.findAll();
	}

}
