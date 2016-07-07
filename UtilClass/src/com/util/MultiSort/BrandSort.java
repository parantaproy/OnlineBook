package com.util.MultiSort;

import java.util.Comparator;

public class BrandSort implements Comparator<Vehicle> {

	@Override
	public int compare(Vehicle o1, Vehicle o2) {
		// TODO Auto-generated method stub
		return o2.getBrand().compareTo(o1.getBrand());
	}
	
	

}
