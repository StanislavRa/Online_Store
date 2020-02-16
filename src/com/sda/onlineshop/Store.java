package com.sda.onlineshop;

import com.sda.onlineshop.products.*;

import java.util.ArrayList;

public class Store <T extends Product> {

	private Product product1 = new SportsShoes("Nike Lunar Force", 80,0 ,41, "Blue", "Jogging");
	private Product product2 = new SportsShoes("Adidas AlphaEdge 4D Shoe", 40, 3,39, "Golden", "Free Time");
	private Product product3 = new FormalShoes("Hugo Boss", 300,4, 43, "Black", true);
	private Product product4 = new TvSet("LG C9 55", 3000, 5,120, "4K UHD");
	private Product product5 = new TvSet("Samsung Q70R", 3000, 1,120, "8K UHD");
	private Product product6 = new Radio("Roadstar HRA-1245", 3000, 9,120, 30);
	private Product product7 = new Magazine("National Geographic", 17,6, "National Geographic Society", true);
	private Product product8 = new Book("The Lord of the Rings", 25, 3,"John Ronald Reuel Tolkien", true);

	private ArrayList<Product> allProducts = new ArrayList<>();

	// Creating an array from items/products
	 public void createArrayFromAll() {
		 addProductWithPositiveQuantity(product1);
		 addProductWithPositiveQuantity(product2);
		 addProductWithPositiveQuantity(product3);
		 addProductWithPositiveQuantity(product4);
		 addProductWithPositiveQuantity(product5);
		 addProductWithPositiveQuantity(product6);
		 addProductWithPositiveQuantity(product7);
		 addProductWithPositiveQuantity(product8);
	 }

	private void addProductWithPositiveQuantity(Product product) {
		if (product.getQuantity() > 0) allProducts.add(product);
	}

	// Show items/products specifications
	public void showAllProducts() {

		int index = 1;

		for (Product product : allProducts) {
			System.out.println("-----------------------------------------------------------------------" +
					"--------------------------------------------------------------------------------" + "\n" +
					"Nr " + index + "\n" +
					product.getFullSpecification());
			index++;
		}
	}

	public Product getProductByIndex(int index) {
		return allProducts.get(index);
	}

	public void clearProducts() {
		allProducts.clear();
	}

	public int getSizeOfCart() {
		return allProducts.size();
	}
}
