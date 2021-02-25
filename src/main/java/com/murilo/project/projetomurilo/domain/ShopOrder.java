package com.murilo.project.projetomurilo.domain;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.Data;


@Data
@Entity
@Table(name = "SHOPORDER")
public class ShopOrder {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "SEQ_SHOPORDER")
	@SequenceGenerator(initialValue = 1, allocationSize = 1, name = "SEQ_SHOPORDER")
	private Long id;
	
	
	@ManyToOne
	@JoinColumn( name = "userid", referencedColumnName = "id", foreignKey=@ForeignKey(name = "FK_SHOPORDER_USER"))
	private User user;
	
	@ManyToOne
	@JoinColumn( name = "addressId", referencedColumnName = "id", foreignKey=@ForeignKey(name = "FK_SHOPORDER_ADDRESS"))
	private Address address;
	
	private Double totalValue;
	
	private LocalDateTime orderDate;
	
	private OrderStatus orderStatus;
	
	
	
}
