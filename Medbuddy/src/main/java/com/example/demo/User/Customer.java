package com.example.demo.User;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
@Entity
public class Customer {
	@Id
	
	private int M_Id;
	private String Medicine_name;
	private int Quantity;
	private int Price ;
	private String Date_of_Expiry;
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Customer(int m_Id, String medicine_name, int quantity, int price, String date_of_Expiry) {
		super();
		M_Id = m_Id;
		Medicine_name = medicine_name;
		Quantity = quantity;
		Price = price;
		Date_of_Expiry = date_of_Expiry;
	}

	public int getM_Id() {
		return M_Id;
	}
	public void setM_Id(int m_Id) {
		M_Id = m_Id;
	}
	public String getMedicine_name() {
		return Medicine_name;
	}
	public void setMedicine_name(String medicine_name) {
		Medicine_name = medicine_name;
	}
	public int getQuantity() {
		return Quantity;
	}
	public void setQuantity(int quantity) {
		Quantity = quantity;
	}
	public int getPrice() {
		return Price;
	}
	public void setPrice(int price) {
		Price = price;
	}
	public String getDate_of_Expiry() {
		return Date_of_Expiry;
	}
	public void setDate_of_Expiry(String date_of_Expiry) {
		Date_of_Expiry = date_of_Expiry;
	}

}
