package com.murilo.project.projetomurilo.domain;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;

@Entity
public class User {

	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "SEQ_USER")
	@SequenceGenerator(initialValue = 1, allocationSize = 1, name = "SEQ_USER")
	private Long id;
	
	@OneToMany(mappedBy = "user")
	private List<Address> address;
	
	@OneToMany(mappedBy = "user")
	private List<ShopOrder> shopOrder;
	
	@Column(nullable = false, length = 80 )
	private String name;
	
	@Column(unique = true, nullable = false, length = 11)
	private String cpf;
	
	@Column(nullable = false)
	private Long age;
	
	@Column(length = 11, name = "PHONENUMBER")
	private String phoneNumber;
	
	@Column(length = 100, nullable = false, unique = true )
	private String email;
	
	@Column(length = 30, nullable = false )
	private String password;
	
	@Column(name = "USERROLE", nullable = false)
	@Enumerated(EnumType.STRING)
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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public UserRole getUserRole() {
		return userRole;
	}

	public void setUserRole(UserRole userRole) {
		this.userRole = userRole;
	}

	public User(Long id, List<Address> address, List<ShopOrder> shopOrder, String name, String cpf, Long age,
			String phoneNumber, String email, String password, UserRole userRole) {
		super();
		this.id = id;
		this.address = address;
		this.shopOrder = shopOrder;
		this.name = name;
		this.cpf = cpf;
		this.age = age;
		this.phoneNumber = phoneNumber;
		this.email = email;
		this.password = password;
		this.userRole = userRole;
	}

	public User() {
	}
	
	
	
}
