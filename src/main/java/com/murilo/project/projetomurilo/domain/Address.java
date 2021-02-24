package com.murilo.project.projetomurilo.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;

import lombok.Data;

@Data
@Entity
public class Address {

	@Id
	@Column(name = "ID")
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "SEQ_ADDRESS")
	@SequenceGenerator(initialValue = 1, allocationSize = 1, name = "SEQ_ADDRESS")
	private Long id;
	
	@ManyToOne
	@JoinColumn( name = "userid", referencedColumnName = "id", foreignKey=@ForeignKey(name = "FK_USER"))
	private User user;
	
	@Column(nullable = false, length = 100 )
	private String street;
	
	@Column
	private Long num;
	
	@Column(nullable = false, length = 8)
	private String cep;
	
	@Column(nullable = false, length = 80 )
	private String city;
	
	@Column(nullable = false, length = 80 )
	private String state;
	
	@Column(nullable = false, length = 80 )
	private String country;
	
	@Column(length = 200 )
	private String additional;
	
	
}
