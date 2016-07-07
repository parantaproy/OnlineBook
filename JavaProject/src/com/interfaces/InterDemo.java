package com.interfaces;

public class InterDemo {

	

	public static void main(String[] args) {
		Bird bird = new Parrot("parrot","green","sharp","chilly");
		bird.getHabit();
		bird.getDetails();
		//interface methode
		Flyable bref = (Flyable)bird;
		bref.fly();
		
		Parrot parrot = (Parrot)bird;
		parrot.canTalk();
		
		System.out.println();
		
		Bird ducky = new Duck("ducky","white","blunt","worms");
		ducky.getHabit();
		ducky.getDetails();
		//interface methode
		bref = (Flyable)ducky;
		bref.fly();
		//interface methods
		Swimmable sobj = (Swimmable)ducky;
		sobj.swim();
		//own methode
		Duck newduck = (Duck)ducky;
		newduck.makesound();
		
		
		

	}

}
