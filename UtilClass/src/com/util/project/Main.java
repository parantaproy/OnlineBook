package com.util.project;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter total number of customers :");
		int num=sc.nextInt();
		
		ArrayList<Customer>list = new ArrayList<>();
		
		for (int i = 0; i < num; i++) {
		System.out.println("Enter name");
		String name= sc.next();
		System.out.println("Enter city");
		String city = sc.next();
		System.out.println("Enter mobile");
		long mobile = sc.nextLong();
		
		Customer customer = new Customer(name, city, mobile);
		//customer.setName(name);
		//customer.setCity(city);
		//customer.setMobile(mobile);
		
		list.add(customer);
		}
		
		System.out.println("List of Customers");
		Collections.sort(list);
		for(Customer customer : list)
		{
			System.out.println(customer);
		}
		
		System.out.println("List of customers by city");
		String city = sc.next();
		ArrayList<Customer> newCusList = new ArrayList<>();
		Iterator<Customer> i = list.iterator();
		
		while(i.hasNext()){
			Customer customer = i.next();
			if(customer.getCity().equalsIgnoreCase(city)){
				newCusList.add(customer);
			}
		}
		
		sc.close();
		}

}
