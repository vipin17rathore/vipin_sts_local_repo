package com.organization.demo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


public class Address {
	
	@Id
	@GeneratedValue
	@Column(name="common_FK")
	private int id;
	private String street;
	private String city;
	private int pinCode;
	
	private Student student;
	
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getPinCode() {
		return pinCode;
	}
	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}
	@Override
	public String toString() {
		return "Address [street=" + street + ", city=" + city + ", pinCode=" + pinCode + "]";
	}

	
	

}
