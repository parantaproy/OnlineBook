package com.training.calculator;

public class CalculatorMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Processor p=new Processor();
		
		System.out.println("Sum:" +p.findTotal(new Calculator() {
			
			@Override
			public int calculate(int x, int y) {
				// TODO Auto-generated method stub
				return x+y;
			}
		}, 5, 9));
			
			
		System.out.println("Difference:"+p.findTotal(new Calculator() {
			
			@Override
			public int calculate(int x, int y) {
				// TODO Auto-generated method stub
				return x-y;
			}
		}, 5, 9));
	
		System.out.println("Product:" +p.findTotal(new Calculator() {
			
			@Override
			public int calculate(int x, int y) {
				// TODO Auto-generated method stub
				return x*y;
			}
		}, 5, 9));
	}
}
