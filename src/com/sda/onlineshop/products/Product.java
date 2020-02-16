package com.sda.onlineshop.products;

public abstract class Product {

	private String name;
	private double unitPrice;
	private String category;
	private int quantity;

	public Product(String name, double unitPrice, int quantity) {
		this.name = name;
		this.unitPrice = unitPrice;
		this.quantity = quantity;
	}

	public void increaseQuantity() {
		quantity ++;
	}
	public void decreaseQuantity() {
		if (quantity < 0) System.out.println("Cannot decrease quantity");
		 else quantity --;
	}

	public String getFullSpecification() {
		return "Category: " + getCategory() + ", " +
				"name: " + getName() + ", " +
				"price: " + getUnitPrice() + " euros" + ", " +
				"in stock: " + getQuantity() + " pcs" + ", ";
	}
	public String getSimpleSpecification() {
		return "Category: " + getCategory() + ", " +
				"name: " + getName() + ", " +
				"price: " + getUnitPrice() + " euros";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {

		this.quantity = quantity;
	}
}
