package com.bezkoder.spring.datajpa.model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="Patient")
public class Patient {
	
	private int id;
	private String name;
	private int age;
	private int billingAmount;
	
	
	
	public Patient(int id, String name, int age, int billingAmount) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.billingAmount = billingAmount;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getBillingAmount() {
		return billingAmount;
	}
	public void setBillingAmount(int billingAmount) {
		this.billingAmount = billingAmount;
	}

	@Override
	public String toString() {
		return "Patient [id=" + id + ", name=" + name + ", age=" + age + ", billingAmount=" + billingAmount + "]";
	}
	
	

}
