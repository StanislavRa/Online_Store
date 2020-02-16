package com.sda.onlineshop.products;

public abstract class Readings extends Product {

	private String author;

	public Readings(String name, double unitPrice, int quantity, String author) {
		super(name, unitPrice, quantity);
		this.author = author;
	}

	@Override
	public String getFullSpecification() {
		return super.getFullSpecification() +
				"author: " + getAuthor() + ", ";
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
}
