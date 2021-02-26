package com.murilo.project.projetomurilo.dto;

import java.util.List;

import com.murilo.project.projetomurilo.domain.ShopOrder;
import com.murilo.project.projetomurilo.domain.User;

public class AddressAllDTO {

	private Long id;
	
	private User user;
	
	private List<ShopOrder> shopOrder;

	private String street;
	
	private Long num;
	
	private String cep;
	
	private String city;
	
	private String state;
	
	private String country;
	
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
