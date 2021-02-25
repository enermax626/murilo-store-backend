package com.murilo.project.projetomurilo.domain;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;

import lombok.Data;

@Data
@Entity
public class OrderProduct {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "SEQ_ORDERPRODUCT")
	@SequenceGenerator(initialValue = 1, allocationSize = 1, name = "SEQ_ORDERPRODUCT")
	private Long id;
	
	@ManyToMany()
	@JoinTable(
			name = "PRODUCT_ORDERPRODUCT", 
			joinColumns = @JoinColumn(name="ORDERPRODUCTID"),
			inverseJoinColumns = @JoinColumn(name="PRODUCTID"),
			foreignKey = @ForeignKey(name="FK_ORDERPRODUCT_PRODUCT"),
			inverseForeignKey = @ForeignKey(name= "FK_PRODUCT_ORDERPRODUCT")
			)
	private List<Product> product;
	
	
	
//	@ManyToOne
//	@JoinColumn( name = "orderid", referencedColumnName = "id", foreignKey=@ForeignKey(name = "FK_ORDERPRODUCT_ORDER"))
//	private Order order;
//	
	@Column(nullable = false, length = 80, unique = true )
	private String name;
	
	@Column(nullable = false)
	private Double price;
	
	@Column(length = 430)
	private String description;
	
	
}
