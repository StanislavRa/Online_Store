package com.sda.onlineshop.products;

public class TvSet extends Appliances  {

	private String resolution;

	public TvSet(String name, double unitPrice, int quantity, double powerSupply, String resolution) {
		super(name, unitPrice, quantity, powerSupply);
		this.resolution = resolution;
		setCategory("TV Set");
	}

	@Override
	public String getFullSpecification() {
		return super.getFullSpecification() +
				"resolution: " + getResolution();
	}
	public String getResolution() {
		return resolution;
	}

	public void setResolution(String resolution) {
		this.resolution = resolution;
	}
}
