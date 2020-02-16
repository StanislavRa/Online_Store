package com.sda.onlineshop.products;

public class FormalShoes extends Shoes  {

	private boolean naturalLeather;

	public FormalShoes(String name, double unitPrice, int quantity, double size, String color, boolean naturalLeather) {
		super(name, unitPrice, quantity, size, color);
		this.naturalLeather = naturalLeather;
		setCategory("Formal Shoes");
	}

	@Override
	public String getFullSpecification() {
		return super.getFullSpecification() +
				"natural leather: " + (isNaturalLeather() ? "yes": "no");
	}
	public boolean isNaturalLeather() {
		return naturalLeather;
	}

	public void setNaturalLeather(boolean naturalLeather) {
		this.naturalLeather = naturalLeather;
	}
}
