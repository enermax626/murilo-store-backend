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

import com.murilo.project.projetomurilo.domain.Address;
import com.murilo.project.projetomurilo.dto.AddressAllDTO;
import com.murilo.project.projetomurilo.dto.AddressRegisterDTO;
import com.murilo.project.projetomurilo.mapper.AddressMapper;
import com.murilo.project.projetomurilo.repository.AddressRepository;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/address")
@AllArgsConstructor
public class AddressController {

	private AddressRepository addressRepository;
	private AddressMapper addressMapper;
	
	@GetMapping
	public List<AddressAllDTO> getAllAddress() {
		return addressRepository.findAll().stream().map(address -> addressMapper.toAddressAllDTO(address)).collect(Collectors.toList());
		
	}
	
	@PostMapping
	@ResponseStatus(code = HttpStatus.CREATED)
	public AddressRegisterDTO registerUser(@RequestBody Address address) {
		return addressMapper.toAddressRegisterDTO(addressRepository.save(address));
	}
	
}
