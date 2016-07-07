package com.util.project;

public class Customer implements Comparable<Customer>{

	String name, city;
	long mobile;
	public Customer(String name, String city, long mobile) {
		super();
		this.name = name;
		this.city = city;
		this.mobile = mobile;
	}
	
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public long getMobile() {
		return mobile;
	}
	public void setMobile(long mobile) {
		this.mobile = mobile;
	}
	@Override
	public String toString() {
		return "Customer [name=" + name + ", city=" + city + ", mobile=" + mobile + "]";
	}

	@Override
	public int compareTo(Customer o) {
		// TODO Auto-generated method stub
		return 0;
	}
	

}
