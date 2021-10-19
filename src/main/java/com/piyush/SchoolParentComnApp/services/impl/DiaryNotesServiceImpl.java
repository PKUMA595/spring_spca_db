package com.piyush.SchoolParentComnApp.services.impl;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.piyush.SchoolParentComnApp.entities.cls.DiaryNotes;
import com.piyush.SchoolParentComnApp.entities.cls.Parent;
import com.piyush.SchoolParentComnApp.entities.cls.Subject;
import com.piyush.SchoolParentComnApp.entities.concern.Concern;
import com.piyush.SchoolParentComnApp.repository.IDiaryNotesRepository;
import com.piyush.SchoolParentComnApp.services.IDairyNotesService;

@Service
public class DiaryNotesServiceImpl implements IDairyNotesService {
	
	@Autowired
	IDiaryNotesRepository diaryNotesRepository;

	@Override
	public DiaryNotes addDiaryNotes(DiaryNotes diaryNotes) {
		if(diaryNotes != null)
		System.out.println("DiaryNotes successfully added");
		return diaryNotesRepository.save(diaryNotes);
	}

	@Override
	public DiaryNotes updateDiaryNotes(DiaryNotes diaryNotes) {
		// TODO Auto-generated method stub
		long diaryNotesId = diaryNotes.getDiaryNotesId();
		Optional<DiaryNotes> existingDiaryNotesContainer = diaryNotesRepository.findById(diaryNotesId);
				DiaryNotes existingDiaryNotes = null;
				if(existingDiaryNotesContainer.isPresent())
		{
					existingDiaryNotes = existingDiaryNotesContainer.get();
					existingDiaryNotes.setClassDiary(diaryNotes.getClassDiary());
					existingDiaryNotes.setDiaryNotesId(diaryNotes.getDiaryNotesId());
					existingDiaryNotes.setNotes(diaryNotes.getNotes());
					existingDiaryNotes.setSubject(diaryNotes.getSubject());
					System.out.println("diaryNotes updated");
		}else {
			return diaryNotesRepository.save(diaryNotes);
			}
			return diaryNotesRepository.save(existingDiaryNotes);
	}

	@Override
	public String deleteDiaryNotes(DiaryNotes diaryNotes) {
		diaryNotesRepository.delete(diaryNotes);
		return "DiaryNotes successfully deleted";
	}

	@Override
	public List<DiaryNotes> retrieveAllDiaryNotes() {
		return diaryNotesRepository.findAll();
	}

	@Override
	public List<DiaryNotes> retrieveAllDirayNotesBySubjectId(int subjectId) {
		// TODO Auto-generated method stub
		return diaryNotesRepository.retrieveAllDirayNotesBySubjectId(subjectId);
	}

}
