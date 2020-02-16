package com.sda.onlineshop.products;

public abstract class Appliances extends Product {

	private double powerSupply;

	public Appliances(String name, double unitPrice, int quantity, double powerSupply) {
		super(name, unitPrice, quantity);
		this.powerSupply = powerSupply;
	}

	@Override
	public String getFullSpecification() {
		return super.getFullSpecification() +
				"power supply: " + getPowerSupply() + " V" + ", ";
	}

	public double getPowerSupply() {
		return powerSupply;
	}

	public void setPowerSupply(double powerSupply) {
		this.powerSupply = powerSupply;
	}
}
