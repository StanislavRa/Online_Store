package com.sda.onlineshop.products;

public abstract class Shoes extends Product {

	private double size;

	public Shoes(String name, double unitPrice, int quantity, double size, String color) {
		super(name, unitPrice, quantity);
		this.size = size;
	}

	@Override
	public String getFullSpecification() {
		return super.getFullSpecification() +
				"size: " + getSize() + ", ";
	}

	public double getSize() {
		return size;
	}

	public void setSize(double size) {
		this.size = size;
	}
}
