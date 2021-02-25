package com.murilo.project.projetomurilo.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.murilo.project.projetomurilo.domain.OrderProduct;
import com.murilo.project.projetomurilo.repository.OrderProductRepository;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/orderproduct")
@AllArgsConstructor
public class OrderProductController {

	private OrderProductRepository orderProductRepository;

	@GetMapping
	public List<OrderProduct> getAllUsers() {
		return orderProductRepository.findAll();

	}

	@PostMapping
	@ResponseStatus(code = HttpStatus.CREATED)
	public OrderProduct registerUser(@RequestBody OrderProduct orderProduct) {
		return orderProductRepository.save(orderProduct);
	}

}
