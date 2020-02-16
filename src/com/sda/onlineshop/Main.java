package com.sda.onlineshop;

import com.sda.onlineshop.products.*;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Store<Product> store = new Store<>();
		mainMenu(store, createAccount());
	}
	// Create user account with inputs from console
	private static Account createAccount() {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Type your username");
		while (scanner.nextLine().isEmpty()) {
			System.out.println("username cannot be empty!");
		}
		String userName = scanner.nextLine();

		System.out.println("Type your password");
		while (scanner.nextLine().isEmpty()) {
			System.out.println("password cannot be empty!");
		}
		String pass = scanner.nextLine();

		System.out.println("Type your Name");
		String name = scanner.nextLine();

		System.out.println("Type your Surname");
		String surname = scanner.nextLine();

		System.out.println("Type your Mobile Number");
		String mobNumber = scanner.nextLine();

		System.out.println("Type your E-mail");
		String email = scanner.nextLine();

		System.out.println("Type your City");
		String city = scanner.nextLine();

		System.out.println("Type your Street");
		String street = scanner.nextLine();

		System.out.println("Type your Postal Code");
		String postal = scanner.nextLine();

		return new Account<>(userName, pass, name, surname, mobNumber, email, city, street, postal);
	}
	// Main menu navigation options
	private static void mainMenu(Store<Product> store, Account<Product> account) {

		Scanner scanner = new Scanner(System.in);

		boolean active = true;

		while (active) {
			System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
			System.out.println("You are at home, type symbol for navigation" + "\n" +
					"S - shopping" + "\n" +
					"C - cart checkout" + "\n" +
					"Q - quit");
			String userNavigation = scanner.nextLine();
			switch (userNavigation) {
				case "C":
					checkOut(account);
					break;
				case "S":
					shopping(store, account);
					break;
				case "Q":
					System.out.println("Good Bye!");
					active = false;
					break;
				default:
					System.out.println("Incorrect symbol!");
			}
		} scanner.close();
	}
	// Shopping at the store
	private static void shopping(Store<Product> store, Account<Product> account) {

		boolean active = true;
		while (active) {

			System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
			System.out.println("There are cool products in our store: ");
			store.createArrayFromAll();
			store.showAllProducts();

			Scanner scanner = new Scanner(System.in);
			System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
			System.out.println("Type symbol to navigation" + "\n" +
					"M - go to main menu" + "\n" +
					"B - buy item" + "\n");

			String userNavigation = scanner.nextLine();
			switch (userNavigation) {
				// Go to main menu
				case "M":
					active = false;
					break;
				// Buy items
				case "B":
					int number;
					// Check if the cart is not empty
					if (store.getSizeOfCart() != 0) {
						do {
							System.out.println("Type item number to buy it");
							// Check if input is an integer number
							while (!scanner.hasNextInt()) {
								String input = scanner.next();
								System.out.printf("\"%s\" is not a valid number.\n", input);
							}
							number = scanner.nextInt();
							// Check if input is a number in appropriate range between 1 and ArrayList size
						} while (number < 1 || number > store.getSizeOfCart());

						account.addProduct(store.getProductByIndex(number - 1));
						store.getProductByIndex(number - 1).decreaseQuantity();
						System.out.println("Item is added to your cart");
					} else System.out.println("There is no more items in the store");
					break;
				default:
					System.out.println("Incorrect symbol!");
			}
			store.clearProducts();
		}
	}
	// User account cart options
	private static void checkOut(Account<Product> account) {
		boolean active = true;
		while (active) {

			Scanner scanner = new Scanner(System.in);
			System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
			System.out.println("You are at your cart. Here there are your chosen items: ");
			account.showCart();

			System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
			System.out.println("Type symbol to navigation" + "\n" +
					"M - go to main menu" + "\n" +
					"R - remove item" + "\n" +
					"P - pay");
			String userNavigation = scanner.nextLine();
			switch (userNavigation) {
				// Go to main menu
				case "M":
					active = false;
					break;
				// Remove item from cart
				case "R":
					int number;
					// Check if the cart is not empty
					if (account.getSizeOfCart() != 0) {
						do {
							System.out.println("Type item number to remove it");
							// Check if input is an integer number
							while (!scanner.hasNextInt()) {
								String input = scanner.next();
								System.out.printf("\"%s\" is not a valid number!\n", input);
							}
							number = scanner.nextInt();
						// Check if input is a number in appropriate range between 1 and ArrayList size
						} while (number < 1 || number > account.getSizeOfCart());

						account.getProductByIndex(number - 1).increaseQuantity();
						account.removeProduct(account.getProductByIndex(number - 1));

						System.out.println("Item is removed from your cart");
					} else System.out.println("Your cart is empty!");
					break;

				// Go to payment menu
				case "P":
					pay(account);
					active = false;
					break;
				default:
					System.out.println("Incorrect symbol!");
			}
		}
	}
	// User account cart payment menu options
	private static void pay(Account<Product> account) {
		boolean active = true;
		while (active) {

			Scanner scanner = new Scanner(System.in);
			System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
			System.out.println("You are at the payment area. Here there are your chosen items");
			account.showCart();

			System.out.println("Choose method of payment" + "\n" +
					"C - Credit card" + "\n" +
					"P - PayPal");

			String userNavigation = scanner.nextLine();
			switch (userNavigation) {

				// Pay with credit card
				case "C":
					System.out.println("Payment with Credit Card submitted successfully! Thank you!");
					account.clearProducts();
					active = false;
					break;
				// Pay with PayPal
				case "P":
					System.out.println("Payment with PayPal submitted successfully! Thank you!");
					account.clearProducts();
					active = false;
					break;
				default:
					System.out.println("Incorrect symbol!");
			}
		}
	}
}
