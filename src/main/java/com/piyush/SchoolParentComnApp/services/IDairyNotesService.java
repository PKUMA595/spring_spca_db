package com.piyush.SchoolParentComnApp.services;


import java.util.List;

import com.piyush.SchoolParentComnApp.entities.cls.DiaryNotes;
import com.piyush.SchoolParentComnApp.entities.cls.Subject;

public interface IDairyNotesService {
	
	DiaryNotes  addDiaryNotes(DiaryNotes diaryNotes);
	DiaryNotes  updateDiaryNotes(DiaryNotes diaryNotes);
	String  deleteDiaryNotes(DiaryNotes diaryNotes);
	List<DiaryNotes>  retrieveAllDiaryNotes();
	List<DiaryNotes>  retrieveAllDirayNotesBySubjectId(int subjectId);

}
