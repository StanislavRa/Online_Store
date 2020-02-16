package com.sda.onlineshop.products;

public class SportsShoes extends Shoes {

	private String sportsActivity;

	public SportsShoes(String name, double unitPrice, int quantity, double size, String color, String sportsActivity) {
		super(name, unitPrice, quantity, size, color);
		this.sportsActivity = sportsActivity;
		setCategory("Sports Shoes");
	}

	@Override
	public String getFullSpecification() {
		return super.getFullSpecification() +
				"activity: " + getSportsActivity();
	}
	public String getSportsActivity() {
		return sportsActivity;
	}

	public void setSportsActivity(String sportsActivity) {
		this.sportsActivity = sportsActivity;
	}
}
