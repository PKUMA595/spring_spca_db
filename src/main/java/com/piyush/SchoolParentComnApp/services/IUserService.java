package com.piyush.SchoolParentComnApp.services;

import java.util.List;
import java.util.Optional;

import com.piyush.SchoolParentComnApp.entities.User;


public interface IUserService {
	
	User  addNewUser(User user);
	User updateUser(User user);
	Optional<User> retrieveUserById(int userId);

}
