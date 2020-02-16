package com.sda.onlineshop;

import com.sda.onlineshop.products.Product;

import java.util.ArrayList;

public class Account<T extends Product>{

	private String userName;
	private String password;
	private String name;
	private String surname;
	private String mobNumber;
	private String email;
	private String city;
	private String street;
	private String postal;

	public Account(String userName, String password,
	               String name, String surname,
	               String mobNumber, String email,
	               String city, String street, String postal) {

		this.userName = userName;
		this.password = password;
		this.name = name;
		this.surname = surname;
		this.mobNumber = mobNumber;
		this.email = email;
		this.city = city;
		this.street = street;
		this.postal = postal;
	}

	private ArrayList<T> cart = new ArrayList<>();

	public void addProduct(T products) {
			cart.add(products);
	}

	public void removeProduct(T products) {
		cart.remove(products);
	}

	public void showCart() {

		int index = 1;
		double sum = 0;

		for (Product product : cart) {
			System.out.println("***********************************************************" + "\n" +
					"Nr " + index + "\n" +
					product.getSimpleSpecification());
			index ++;
			sum += product.getUnitPrice();

		}
		System.out.println("--------------------------");
		System.out.println("Total: " + sum);
	}

	public Product getProductByIndex(int index) {
		return cart.get(index);
	}

	public void clearProducts() {
		cart.clear();
	}

	public int getSizeOfCart() {
		return cart.size();
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getMobNumber() {
		return mobNumber;
	}

	public void setMobNumber(String mobNumber) {
		this.mobNumber = mobNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getPostal() {
		return postal;
	}

	public void setPostal(String postal) {
		this.postal = postal;
	}
}
