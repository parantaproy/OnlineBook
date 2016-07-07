package com.vehicle;

public abstract class Vehicle implements Insurance {

	String name, brand;
	int price;

	public Vehicle(String name, String brand, int price) {
		super();
		this.name = name;
		this.brand = brand;
		this.price = price;
	}

	public abstract void getMilage();

	void getDetails() {
		System.out.println("name :" + name);
		System.out.println("brand :" + brand);
		System.out.println("price :" + price);
	}

}
