package com.murilo.project.projetomurilo.domain;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@Entity
@NoArgsConstructor
@Table(name = "SHOPORDER")
public class ShopOrder {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "SEQ_SHOPORDER")
	@SequenceGenerator(initialValue = 1, allocationSize = 1, name = "SEQ_SHOPORDER")
	private Long id;
	
	@OneToMany(mappedBy = "shopOrder")
	private List<OrderProduct> orderProduct;
	
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
