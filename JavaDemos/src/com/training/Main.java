package com.training;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Sample sample=new Sample();
		sample.getMessage();
		System.out.println(sample.salary);
		sample.d.greet();
		
		Thread t=new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				
			}
		} , "demo");
	}

}
