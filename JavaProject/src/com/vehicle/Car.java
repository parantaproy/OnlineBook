package com.vehicle;

public class Car extends Vehicle implements Insurance, safety, luxuries {

	public Car(String name, String brand, int price) {
		super(name, brand, price);
	}

	@Override
	public void getAccessoreis() {
		System.out.println("has some");
	}

	@Override
	public void getLuxiries() {
		System.out.println("leather seats");
	}

	@Override
	public void getSafety() {
		System.out.println("air bags");
	}

	@Override
	public void getInsurance() {
		System.out.println("insured");
	}

	@Override
	public void getMilage() {
		System.out.println("good");
	}

	void carType() {
		System.out.println("sedan");
	}

}
