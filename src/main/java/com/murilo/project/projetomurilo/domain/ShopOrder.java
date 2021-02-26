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

import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
@Table(name = "SHOPORDER")
public class ShopOrder {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "SEQ_SHOPORDER")
	@SequenceGenerator(initialValue = 1, allocationSize = 1, name = "SEQ_SHOPORDER")
	private Long id;
	
	@OneToMany(mappedBy = "shopOrder")
	private List<OrderProduct> orderProduct;
	
	@JsonIgnore
	@ManyToOne
	@JoinColumn( name = "userid", referencedColumnName = "id", foreignKey=@ForeignKey(name = "FK_SHOPORDER_USER"))
	private User user;
	
	@ManyToOne
	@JoinColumn( name = "addressId", referencedColumnName = "id", foreignKey=@ForeignKey(name = "FK_SHOPORDER_ADDRESS"))
	private Address address;
	
	private Double totalValue;
	
	private LocalDateTime orderDate;
	
	private OrderStatus orderStatus;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public List<OrderProduct> getOrderProduct() {
		return orderProduct;
	}

	public void setOrderProduct(List<OrderProduct> orderProduct) {
		this.orderProduct = orderProduct;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Double getTotalValue() {
		return totalValue;
	}

	public void setTotalValue(Double totalValue) {
		this.totalValue = totalValue;
	}

	public LocalDateTime getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(LocalDateTime orderDate) {
		this.orderDate = orderDate;
	}

	public OrderStatus getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(OrderStatus orderStatus) {
		this.orderStatus = orderStatus;
	}
	
	
	
}
