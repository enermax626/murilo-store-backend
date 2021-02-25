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
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
public class Stock {

	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "SEQ_STOCK")
	@SequenceGenerator(initialValue = 1, allocationSize = 1, name = "SEQ_STOCK")
	private Long id;
	
	@ManyToOne
	@JoinColumn( name = "productid", referencedColumnName = "id", foreignKey=@ForeignKey(name = "FK_STOCK_PRODUCT"))
	private Product product;
	
	@Column(nullable = false)
	private Double quantity;
	
	
	
}
