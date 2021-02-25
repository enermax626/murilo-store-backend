package com.murilo.project.projetomurilo.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.murilo.project.projetomurilo.domain.Product;
import com.murilo.project.projetomurilo.repository.ProductRepository;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/product")
@AllArgsConstructor
public class ProductController {

	private ProductRepository productRepository;

	
	@GetMapping
	public List<Product> getAllUsers() {
		return productRepository.findAll();
		
	}
	
	@PostMapping
	@ResponseStatus(code = HttpStatus.CREATED)
	public Product registerUser(@RequestBody Product product) {
		return productRepository.save(product);
	}
	
	
}
