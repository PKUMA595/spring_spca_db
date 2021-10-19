package com.piyush.SchoolParentComnApp.ctrl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.piyush.SchoolParentComnApp.entities.User;
import com.piyush.SchoolParentComnApp.services.IUserService;

@RestController
@RequestMapping("/api")
public class UserController {
	
	@Autowired
	IUserService userService;
	
	@PostMapping("/add-user")
	public User addNewUser(@RequestBody User user)
	{
		return userService.addNewUser(user);
	}
	@PutMapping("/update-user")
	public User updateUser(User user)
	{
		return userService.updateUser(user);
	}
	@GetMapping("/user/{userId}")
	public Optional<User> retrieveUserById(int userid)
	{
		return userService.retrieveUserById(userid);
	}
}
