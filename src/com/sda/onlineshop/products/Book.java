package com.sda.onlineshop.products;

public class Book extends Readings {

	private boolean hardcover;

	public Book(String name, double unitPrice, int quantity,String author, boolean hardcover) {
		super(name, unitPrice, quantity, author);
		this.hardcover = hardcover;
		setCategory("Book");
	}

	@Override
	public String getFullSpecification() {
		return super.getFullSpecification() +
				"hard cover: " + (isHardcover() ? "yes": "no");
	}
	public boolean isHardcover() {
		return hardcover;
	}

	public void setHardcover(boolean hardcover) {
		this.hardcover = hardcover;
	}
}
