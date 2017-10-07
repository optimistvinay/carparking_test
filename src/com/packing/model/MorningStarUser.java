package com.packing.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="USER")
public class MorningStarUser {
	
//	@Id
//	//@GeneratedValue(strategy = GenerationType.IDENTITY)
//	@GeneratedValue(generator = "assigned")
//	private int id;
//	
	
//	private String location;
	@Column(name = "FIRSTNAME", nullable = false)
	private String firstName;
	
	@Column(name = "LASTNAME", nullable = false)
	private String lastName;
	
	@Id
//	@GeneratedValue(generator = "assigned")
	@Column(name = "EMAIL", nullable = false)
	private String email;
	
	
	//TODO enum for department
	@Column(name = "DEPARTMENT", nullable = false)
	private String dept;
	
	@Column(name = "CARNUMBER", nullable = false)
	private String carNumber;
	
	@Column(name = "PWORD", nullable = false)
	private String password;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public String getCarNumber() {
		return carNumber;
	}

	public void setCarNumber(String carNumber) {
		this.carNumber = carNumber;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	

}
