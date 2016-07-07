package com.training.calculator;

public class Processor {

	int findTotal( Calculator ref, int x, int y){
		
		System.out.println("Processing");
		return ref.calculate(x,y);
	}
}
