package com.interfaces;

public class Parrot extends Bird implements Flyable {

	public Parrot(String name, String color, String beakType, String food) {
		super(name, color, beakType, food);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void fly() {
		System.out.println("fly up");
	}

	@Override
	void getHabit() {
		System.out.println("lives in trees");
	}

	public void canTalk() {
		System.out.println("chit chats");
	}

}
