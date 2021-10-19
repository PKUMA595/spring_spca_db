package com.piyush.SchoolParentComnApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.piyush.SchoolParentComnApp.entities.cls.Attendance;

public interface IAttendanceRepository extends JpaRepository<Attendance, Long> {

}
