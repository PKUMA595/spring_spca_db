package com.piyush.SchoolParentComnApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.piyush.SchoolParentComnApp.entities.cls.ClassDiary;

public interface IClassDiaryRepository extends JpaRepository<ClassDiary, Long> {

}
