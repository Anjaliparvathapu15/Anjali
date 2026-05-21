package com.langfundamental.constructors;

public class OnlineFoodOrdering {
	int orderId;
	String customerName;
	String foodItem;
	int quantity;
	double price;

	OnlineFoodOrdering() {
		this(101, "Anjali");

	}

	OnlineFoodOrdering(int orderId, String customerName) {
		this(102, "Teja", "Biryani");

	}

	OnlineFoodOrdering(int orderId, String customerName, String foodItem) {
		this(103, "Vinay", "Pulav", 2, 300.0);

	}

	OnlineFoodOrdering(int orderId, String customerName, String foodItem, int quantity, double price) {
		this.orderId=orderId;
		this.customerName=customerName;
		this.foodItem=foodItem;
		this.quantity=quantity;
		this.price=price;
	}

	public static void main(String[] args) {
		OnlineFoodOrdering f1 = new OnlineFoodOrdering();
		double total=f1.calculateBill(f1.price);
		System.out.println("Total Bill :"+total);

	}
	double calculateBill(double price) {
		double total=quantity*price;
		return total;
		
	}
	

}
