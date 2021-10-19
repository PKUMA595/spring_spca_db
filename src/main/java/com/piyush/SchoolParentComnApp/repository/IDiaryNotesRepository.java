package com.piyush.SchoolParentComnApp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.piyush.SchoolParentComnApp.entities.cls.DiaryNotes;

public interface IDiaryNotesRepository extends JpaRepository<DiaryNotes, Long> {
	@Query(value="select * from diary_notes where subject_id =?1", nativeQuery = true)
	List<DiaryNotes> retrieveAllDirayNotesBySubjectId(int subjectId);

}
