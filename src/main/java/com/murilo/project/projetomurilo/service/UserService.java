package com.murilo.project.projetomurilo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.murilo.project.projetomurilo.domain.User;
import com.murilo.project.projetomurilo.domain.UserRole;
import com.murilo.project.projetomurilo.repository.UserRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class UserService {

	private UserRepository userRepository;
	
	public User registerUser(User user) {
		user.setUserRole(UserRole.CUSTOMER);
		userRepository.save(user);
		return user;
	}
	
	
	
	public List<User> findAllUsers(){
		return userRepository.findAll();
		
	}
	
	
}
