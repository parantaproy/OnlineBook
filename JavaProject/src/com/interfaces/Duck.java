package com.interfaces;

public class Duck extends Bird implements Flyable, Swimmable {

	public Duck(String name, String color, String beakType, String food) {
		super(name, color, beakType, food);
	}

	@Override
	public void swim() {
		System.out.println("swims and dives");
	}

	@Override
	public void fly() {
		System.out.println("flys very low");
	}

	@Override
	void getHabit() {
		System.out.println("lives as a group");
	}

	public void makesound() {
		System.out.println("quack quack");
	}
}
