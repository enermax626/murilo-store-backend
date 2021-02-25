package com.murilo.project.projetomurilo.domain;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "SEQ_PRODUCT")
	@SequenceGenerator(initialValue = 1, allocationSize = 1, name = "SEQ_PRODUCT")
	private Long id;
	
	@OneToMany(mappedBy = "product")
	private List<Stock> stock;
	
	@ManyToMany(mappedBy = "product")
	private List<OrderProduct> orderProduct;
	
	@Column(nullable = false, length = 80, unique = true )
	private String name;
	
	@Column(nullable = false)
	private Double price;
	
	@Column(length = 430)
	private String description;
	
}
