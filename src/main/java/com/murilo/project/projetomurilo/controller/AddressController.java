package com.murilo.project.projetomurilo.controller;

import java.util.List;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.murilo.project.projetomurilo.domain.Address;

import com.murilo.project.projetomurilo.repository.AddressRepository;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/address")
@AllArgsConstructor
public class AddressController {

	private AddressRepository addressRepository;

	
	@GetMapping
	public List<Address> getAllAddress() {
		return addressRepository.findAll();
		
	}
	
	@PostMapping
	@ResponseStatus(code = HttpStatus.CREATED)
	public Address registerUser(@RequestBody Address address) {
		return addressRepository.save(address);
	}
	
}
