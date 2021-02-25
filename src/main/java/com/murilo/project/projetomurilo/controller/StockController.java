package com.murilo.project.projetomurilo.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.murilo.project.projetomurilo.domain.Stock;
import com.murilo.project.projetomurilo.repository.StockRepository;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/stock")
@AllArgsConstructor
public class StockController {

	private StockRepository stockRepository;

	
	@GetMapping
	public List<Stock> getAllUsers() {
		return stockRepository.findAll();
		
	}
	
	@PostMapping
	@ResponseStatus(code = HttpStatus.CREATED)
	public Stock registerUser(@RequestBody Stock stock) {
		return stockRepository.save(stock);
	}
	
	
}
