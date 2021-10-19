package com.piyush.SchoolParentComnApp.ctrl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.piyush.SchoolParentComnApp.entities.cls.DiaryNotes;
import com.piyush.SchoolParentComnApp.entities.cls.Subject;
import com.piyush.SchoolParentComnApp.services.IDairyNotesService;

@RestController
@RequestMapping("/api")
public class DiaryNotesController {
	
	@Autowired
	IDairyNotesService dairyNotesService;
	
	@PostMapping("/diarynotes")
	public DiaryNotes addDiaryNotes(@RequestBody  DiaryNotes diaryNotes)
	{
		return dairyNotesService.addDiaryNotes(diaryNotes);
	}
	
	@PutMapping("/diarynotes")
	public DiaryNotes updateDiaryNotes(@RequestBody  DiaryNotes diaryNotes)
	{
		return dairyNotesService.updateDiaryNotes(diaryNotes);
	}
	@DeleteMapping("/diarynotes")
	public String deleteDiaryNotes(@RequestBody  DiaryNotes diaryNotes)
	{
		return dairyNotesService.deleteDiaryNotes(diaryNotes);
	}

	@GetMapping("/diarynotes")
	public List<DiaryNotes> retrieveAllDiaryNotes()
	{
		return dairyNotesService.retrieveAllDiaryNotes();
	}

	@GetMapping("/diarynotess/{subjectId}")
	public List<DiaryNotes> retrieveAllDirayNotesBySubjectId(@PathVariable int subjectId)
	{
		return dairyNotesService.retrieveAllDirayNotesBySubjectId(subjectId);
	}
}
