package com.murilo.project.projetomurilo.controller;

import java.util.List;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.murilo.project.projetomurilo.domain.User;
import com.murilo.project.projetomurilo.repository.UserRepository;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/user")
@AllArgsConstructor
public class UserController {

	private UserRepository userRepository;

	
	@GetMapping
	public List<User> getAllUsers() {
		return userRepository.findAll();
		
	}
	
	@PostMapping
	@ResponseStatus(code = HttpStatus.CREATED)
	public User registerUser(@RequestBody User user) {
		return userRepository.save(user);
	}
	
	
}
