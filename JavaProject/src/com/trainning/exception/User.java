package com.trainning.exception;

import java.util.Scanner;

public class User {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter user name");
		String Username = sc.next();
		Validator v = new Validator();
		try{
			v.checkName(Username);
			System.out.println("enter pass : ");
			String pass = sc.next();
			try {
				v.checkPassword(pass);
				System.out.println("welcome"+Username); 
			}catch(Tooshort|Toolong e){
				System.out.println(e.getMessage());
			}
		}catch (NNFException e){
			System.out.println(e.getMessage());
		}
		sc.close();
	}
}
