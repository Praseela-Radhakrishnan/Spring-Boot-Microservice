package com.prasee.customerservice.feignClient;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String name;
	private String description;
	private int price;
	private int sellingPrice;
	private int quantityAvailable;

	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Product(int id, String name, String description, int price, int sellingPrice, int quantityAvailable) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.price = price;
		this.sellingPrice = sellingPrice;
		this.quantityAvailable = quantityAvailable;
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

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getSellingPrice() {
		return sellingPrice;
	}

	public void setSellingPrice(int sellingPrice) {
		this.sellingPrice = sellingPrice;
	}

	public int getQuantityAvailable() {
		return quantityAvailable;
	}

	public void setQuantityAvailable(int quantityAvailable) {
		this.quantityAvailable = quantityAvailable;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", description=" + description + ", price=" + price
				+ ", sellingPrice=" + sellingPrice + ", quantityAvailable=" + quantityAvailable + "]";
	}

}
