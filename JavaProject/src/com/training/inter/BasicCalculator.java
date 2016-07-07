package com.training.inter;

public class BasicCalculator implements Calculator {

	@Override
	public void add(int a, int b) {
		System.out.println("sum :"+(a+b));
	}

	@Override
	public void substract(int a, int b) {
		System.out.println("diff :"+(a-b));
	}

	@Override
	public void multiply(int a, int b) {
		System.out.println("mul :"+(a*b));
	}

	@Override
	public void divide(int a, int b) {
		System.out.println("div :"+(a/b));
	}

}
