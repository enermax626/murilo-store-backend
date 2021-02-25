package com.murilo.project.projetomurilo.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.murilo.project.projetomurilo.domain.ShopOrder;
import com.murilo.project.projetomurilo.repository.ShopOrderRepository;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/shoporder")
@AllArgsConstructor
public class ShopOrderController {

	private ShopOrderRepository shopOrderRepository;

	
	@GetMapping
	public List<ShopOrder> getAllUsers() {
		return shopOrderRepository.findAll();
		
	}
	
	@PostMapping
	@ResponseStatus(code = HttpStatus.CREATED)
	public ShopOrder registerUser(@RequestBody ShopOrder shopOrder) {
		return shopOrderRepository.save(shopOrder);
	}
	
	
}
