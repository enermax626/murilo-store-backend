package com.murilo.project.projetomurilo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.murilo.project.projetomurilo.domain.Customer;
import com.murilo.project.projetomurilo.repository.CustomerRepository;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/clientes")
@AllArgsConstructor
public class CustomerController {

	private CustomerRepository customerRepository;
	
	@GetMapping
	public List<Customer> hello() {
		return customerRepository.findAll();
		
	}
	
	@PostMapping
	@ResponseStatus(code = HttpStatus.CREATED)
	public Customer registerCustomer(@RequestBody Customer customer) {
		return customerRepository.save(customer);
	}
	
	
	
}
