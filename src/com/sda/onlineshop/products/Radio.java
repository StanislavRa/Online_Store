package com.sda.onlineshop.products;

public class Radio extends Appliances {

	private double soundPower;

	public Radio(String name, double unitPrice, int quantity, double powerSupply, double soundPower) {
		super(name, unitPrice, quantity, powerSupply);
		this.soundPower = soundPower;
		setCategory("Radio");
	}

	@Override
	public String getFullSpecification() {
		return super.getFullSpecification() +
				"sound power: " + getSoundPower() + " W";
	}

	public double getSoundPower() {
		return soundPower;
	}

	public void setSoundPower(double soundPower) {
		this.soundPower = soundPower;
	}
}
