package com.vehicle;

public class Bike extends Vehicle implements safety {

	public Bike(String name, String brand, int price) {
		super(name, brand, price);
	}

	@Override
	public void getAccessoreis() {
		System.out.println("led lights");
	}

	@Override
	public void getInsurance() {
		System.out.println("insured");
	}

	@Override
	public void getSafety() {
		System.out.println("low safety");

	}

	@Override
	public void getMilage() {
		System.out.println("v.good");
	}

	void ignitionType() {
		System.out.println("self start");

	}

}
