package com.murilo.project.projetomurilo.domain;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Address {

	@Id
	@Column(name = "ID")
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "SEQ_ADDRESS")
	@SequenceGenerator(initialValue = 1, allocationSize = 1, name = "SEQ_ADDRESS")
	private Long id;
	
	@JsonIgnore
	@ManyToOne
	@JoinColumn( name = "userid", referencedColumnName = "id", foreignKey=@ForeignKey(name = "FK_ADDRESS_USER"))
	private User user;
	
	
	@OneToMany(mappedBy = "address")
	private List<ShopOrder> shopOrder;
	
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

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public List<ShopOrder> getShopOrder() {
		return shopOrder;
	}

	public void setShopOrder(List<ShopOrder> shopOrder) {
		this.shopOrder = shopOrder;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public Long getNum() {
		return num;
	}

	public void setNum(Long num) {
		this.num = num;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getAdditional() {
		return additional;
	}

	public void setAdditional(String additional) {
		this.additional = additional;
	}
	
	
	
}
