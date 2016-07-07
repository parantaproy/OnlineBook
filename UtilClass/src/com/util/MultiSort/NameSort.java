package com.util.MultiSort;

import java.util.Comparator;

public class NameSort implements Comparator<Vehicle> {

	@Override
	public int compare(Vehicle o1, Vehicle o2) {
		// TODO Auto-generated method stub
		return o1.getName().compareTo(o2.getName());
	}

	
}
