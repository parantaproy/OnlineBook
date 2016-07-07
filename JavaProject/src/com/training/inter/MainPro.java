package com.training.inter;

import java.util.Scanner;

public class MainPro {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the type of operation A/S/M/D/SQ/C ");
		String choice = sc.next().toUpperCase();
		BasicCalculator bc = new BasicCalculator();
		Scientific st =new Scientific();
		
		switch(choice){
		case "A":
			int a= sc.nextInt();
			int b=sc.nextInt();
			bc.add(a, b);
			break;
		case "S":
			int a1= sc.nextInt();
			int b1=sc.nextInt();
			bc.substract(a1,b1);
			break;
		case "M":
			int a2= sc.nextInt();
			int b2=sc.nextInt();
			bc.multiply(a2, b2);
			break;
		case "D":
			int a3=sc.nextInt();
			int b3=sc.nextInt();
			bc.divide(a3,b3);
			break;
		case "SQ":
			int a4= sc.nextInt();
			int b4=sc.nextInt();
			st.square(a4);
			break;
					
		}
		
		
		
		
		

	}

}
