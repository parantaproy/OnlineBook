package com.training.inter;

public class Scientific extends BasicCalculator implements AdvCalculator {

	@Override
	public void square(int a) {
		System.out.println("square :"+(a*a));
	}

	@Override
	public void cube(int a) {
		System.out.println("cube :"+(a*a*a));
	}

}
