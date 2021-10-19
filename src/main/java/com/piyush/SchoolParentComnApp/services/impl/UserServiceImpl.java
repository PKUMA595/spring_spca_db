package com.piyush.SchoolParentComnApp.services.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.piyush.SchoolParentComnApp.entities.User;
import com.piyush.SchoolParentComnApp.repository.IUserRepository;
import com.piyush.SchoolParentComnApp.services.IUserService;

@Service
public class UserServiceImpl implements IUserService {
	
	@Autowired
	IUserRepository userRepository;

	@Override
	public User addNewUser(User user) {
		System.out.println("User successfully added");
		return userRepository.save(user);
	}

	@Override
	public User updateUser(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<User> retrieveUserById(int userId) {
		return userRepository.findById((long) userId);
	}

}
