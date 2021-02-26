package com.murilo.project.projetomurilo.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.murilo.project.projetomurilo.dto.UserAllDTO;
import com.murilo.project.projetomurilo.dto.UserRegisterDTO;
import com.murilo.project.projetomurilo.mapper.UserMapper;
import com.murilo.project.projetomurilo.service.UserService;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/user")
@AllArgsConstructor
public class UserController {

	private UserService userService;
	private UserMapper userMapper;
	
	@GetMapping
	public List<UserAllDTO> getAllUsers() {
		return userService.findAllUsers()
				.stream()
				.map(user -> userMapper.toUserAllDTO(user))
				.collect(Collectors.toList());

	}

	@PostMapping
	@ResponseStatus(code = HttpStatus.CREATED)
	public UserRegisterDTO registerUser(@RequestBody UserRegisterDTO userDTO) {
		return userMapper.toUserRegisterDTO(userService.registerUser(userMapper.toUser(userDTO))) ;
		//return userService.registerUser(UserMapper.INSTANCE.toUser(userDTO));
	}

}
