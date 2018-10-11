package company.management.app;

import java.util.Scanner;

public class Client {
	private String name;
	private int pagesOrdered;
	private double paymnet;
	private int costPerPage;

	public Client() {
		name = "";
		pagesOrdered = 0;
		costPerPage = 8;
		paymnet = 0;
	}

	// getters
	public String getName() {
		return this.name;
	}

	public int getPagesOrder() {
		return this.pagesOrdered;
	}

	public double getPayment() {
		return this.paymnet;
	}

	public void setName(Scanner input) {
		System.out.println("Hi, what's your name?");
		this.name = input.next();
	}

	public int costPerPage() {
		return costPerPage;
	}

	// asking the client to enter a number of pages he/she is willing to order
	public void askForPagesOrdered(Scanner input) {
		System.out.println("How many pages do you want to order?");
		this.pagesOrdered = input.nextInt();
	}

	// method for calculating the cost of an order
	public double calcPayment(Scanner input) {
		double costOfOrder = pagesOrdered * costPerPage;
		System.out.println("Do you want to proceed (y, n)?");
		String response = input.next().toLowerCase();
		switch (response) {
		case "y":
			this.paymnet += costOfOrder;
			break;
		case "n":
			System.out.println("Okay, see you next time!");
			break;
		default:
			System.out.println("You aren't clear");
			break;
		}
		return this.paymnet;
	}

	@Override
	public String toString() {
		return "Name: " + name + "; Pages ordered: " + pagesOrdered + "; TotalPay: " + paymnet;
	}

}
