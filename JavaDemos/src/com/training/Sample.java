package com.training;

public class Sample {
double salary;
	Demo d=new Demo() {
	
	public void greet(){
		
		System.out.println("Welcome");
		
		mymethod();
	}
	
	public void mymethod(){
		
		System.out.println("Bye");
	
	
	}

};
void getMessage(){
	
	System.out.println("This is a trial");
	d.greet();
}
}