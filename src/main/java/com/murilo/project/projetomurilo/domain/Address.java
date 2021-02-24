package com.murilo.project.projetomurilo.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Address {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@ManyToOne
	@Column(name = "customerId")
	private Long customer;
	
	
	
	
	
	//////////////////////////
	@Column(unique = true, nullable = false, length = 11 )
	private String cpf;
	
	@Column(nullable = false)
	private Long age;
	
	@Column(length = 11)
	private String phoneNumber;
	
	@Column(length = 100, nullable = false, unique = true )
	private String email;
	
	@Column(length = 30, nullable = false )
	private String password;
	
	
	
	
}
