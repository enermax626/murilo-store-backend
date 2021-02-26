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
import javax.persistence.SequenceGenerator;


@Entity
public class OrderProduct {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_ORDERPRODUCT")
	@SequenceGenerator(initialValue = 1, allocationSize = 1, name = "SEQ_ORDERPRODUCT")
	private Long id;

	@ManyToMany()
	@JoinTable(name = "PRODUCT_ORDERPRODUCT", joinColumns = @JoinColumn(name = "ORDERPRODUCTID"), inverseJoinColumns = @JoinColumn(name = "PRODUCTID"), foreignKey = @ForeignKey(name = "FK_ORDERPRODUCT_PRODUCT"), inverseForeignKey = @ForeignKey(name = "FK_PRODUCT_ORDERPRODUCT"))
	private List<Product> product;

	@ManyToOne
	@JoinColumn( name = "shopOrderId", referencedColumnName = "id", foreignKey=@ForeignKey(name = "FK_ORDERPRODUCT_SHOPORDER"))
	private ShopOrder shopOrder;
	
	@Column(nullable = false, length = 80, unique = true)
	private String name;

	@Column(nullable = false)
	private Double price;

	@Column(length = 430)
	private String description;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public List<Product> getProduct() {
		return product;
	}

	public void setProduct(List<Product> product) {
		this.product = product;
	}

	public ShopOrder getShopOrder() {
		return shopOrder;
	}

	public void setShopOrder(ShopOrder shopOrder) {
		this.shopOrder = shopOrder;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	
}
