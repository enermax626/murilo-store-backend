package com.murilo.project.projetomurilo.domain;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;

import lombok.Data;

@Data
@Entity
public class User {

	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "SEQ_USER")
	@SequenceGenerator(initialValue = 1, allocationSize = 1, name = "SEQ_USER")
	private Long id;
	
	@OneToMany(mappedBy = "user")
	private List<Address> address;
	
	@Column(nullable = false, length = 80 )
	private String name;
	
	@Column(unique = true, nullable = false, length = 11)
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
