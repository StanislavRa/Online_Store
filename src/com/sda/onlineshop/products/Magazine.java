package com.sda.onlineshop.products;

public class Magazine extends Readings {

	private boolean onlineVersion;

	public Magazine(String name, double unitPrice, int quantity, String author, boolean hasOnlineVersion) {
		super(name, unitPrice, quantity, author);
		this.onlineVersion = hasOnlineVersion;
		setCategory("Magazine");
	}

	@Override
	public String getFullSpecification() {
		return super.getFullSpecification() +
				"online version: " + (isOnlineVersion() ? "yes": "no");
	}
	public void setHasOnlineVersion(boolean hasOnlineVersion) {
		this.onlineVersion = hasOnlineVersion;
	}

	public boolean isOnlineVersion() {
		return onlineVersion;
	}
}
