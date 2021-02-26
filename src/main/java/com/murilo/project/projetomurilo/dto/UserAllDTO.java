package com.murilo.project.projetomurilo.dto;

import java.util.List;

import com.murilo.project.projetomurilo.domain.Address;
import com.murilo.project.projetomurilo.domain.ShopOrder;
import com.murilo.project.projetomurilo.domain.UserRole;

public class UserAllDTO {

	private Long id;
	
	private List<Address> address;
	
	private List<ShopOrder> shopOrder;
	
	private String name;
	
	private String cpf;
	
	private Long age;
	
	private String phoneNumber;

	private String email;

	private UserRole userRole;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public List<Address> getAddress() {
		return address;
	}

	public void setAddress(List<Address> address) {
		this.address = address;
	}

	public List<ShopOrder> getShopOrder() {
		return shopOrder;
	}

	public void setShopOrder(List<ShopOrder> shopOrder) {
		this.shopOrder = shopOrder;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Long getAge() {
		return age;
	}

	public void setAge(Long age) {
		this.age = age;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public UserRole getUserRole() {
		return userRole;
	}

	public void setUserRole(UserRole userRole) {
		this.userRole = userRole;
	}
	
	
	
}
