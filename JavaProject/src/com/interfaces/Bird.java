package com.interfaces;

public abstract class Bird {
	String name, color;
	String beakType;
	String food;

	public Bird(String name, String color, String beakType, String food) {
		super();
		this.name = name;
		this.color = color;
		this.beakType = beakType;
		this.food = food;
	}

	void getDetails() {
		System.out.println("name " + name);
		System.out.println("color " + color);
		System.out.println("beaktype");
		System.out.println("eats" + food);
	}

	abstract void getHabit();

}
