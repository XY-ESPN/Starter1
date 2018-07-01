
package com.it.sportsplus.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.it.sportsplus.models.User;
import com.it.sportsplus.repo.UserRepository;


@RestController
@RequestMapping("/user")
public class UserController{
	@Autowired
	private UserRepository userRepository; // declaring the interface
	
	@PostMapping("/add")
	public User addUser(@RequestBody User user) {
		User persistedUser=userRepository.save(user);
		return persistedUser;
	}
	@GetMapping("/getAll")
	public List<User> getAll()
	{
		List<User> users=userRepository.findAll();
		return users;
	}
	@PostMapping("/login")
	public User login(@RequestBody User user)
	{
		User persistedUser=userRepository.findByUsernameAndPassword(user.getUsername(), user.getPassword());
		return persistedUser;
		
	}
}


	