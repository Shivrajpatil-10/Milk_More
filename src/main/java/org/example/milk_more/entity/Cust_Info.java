package org.example.milk_more.entity;

import jakarta.persistence.*;

import java.time.LocalDate;



@Entity
@Table
public class Cust_Info {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private Long phone;
	private String type;
	private double quantity;
	private LocalDate date; 
	
	public Cust_Info() {
		
	}
	
	
	public Cust_Info(Long id, String name, Long phone, String type, double quantity,LocalDate date) {
		
		this.id = id;
		this.name = name;
		this.phone = phone;
		this.type = type;
		this.quantity = quantity;
		this.date = date.now();
	}
	


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Long getPhone() {
		return phone;
	}


	public void setPhone(Long phone) {
		this.phone = phone;
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	public double getQuantity() {
		return quantity;
	}


	public void setQuantity(double quantity) {
		this.quantity = quantity;
	}


	public LocalDate getDate() {
		return date;
	}


	public void setDate(LocalDate date) {
		this.date = date;
	}
	
	
}
