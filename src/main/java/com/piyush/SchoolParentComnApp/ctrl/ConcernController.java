package com.piyush.SchoolParentComnApp.ctrl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.piyush.SchoolParentComnApp.entities.cls.Parent;
import com.piyush.SchoolParentComnApp.entities.concern.Concern;
import com.piyush.SchoolParentComnApp.services.IConcernService;

@RestController
@RequestMapping("/api")
public class ConcernController {
	
	@Autowired
	IConcernService concernService;
	
	@PostMapping("/concern")
	public Concern addConcern(@RequestBody  Concern concern)
	{
		return concernService.addConcern(concern);
	}

	@PutMapping("/concern")
	public Concern updateConcern(@RequestBody  Concern concern)
	{
		return concernService.updateConcern(concern);
	}
	
	@GetMapping("/concerns")
	public List<Concern> retrieveAllConcerns()
	{
		return concernService.retrieveAllConcerns();
	}
	@GetMapping("/concerns/{parentId}")
	public List<Concern> retrieveAllConcernsByParent(@PathVariable int parentId)
	{
		return concernService.retrieveAllConcernsByParent(parentId);
	}
	
	@GetMapping("/allunresolvedconcerns")
	public List<Concern> retrieveAllUnResolvedConcerns()
	{
		return concernService.retrieveAllUnResolvedConcerns();
	}

	
	@GetMapping("/unresolvedconcerns/{parentId}")
	public List<Concern> retrieveAllUnResolvedConcernsByParent(@PathVariable int parentId)
	{
		return concernService.retrieveAllUnResolvedConcernsByParent(parentId);
	}
}
