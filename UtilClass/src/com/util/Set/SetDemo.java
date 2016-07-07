package com.util.Set;
import java.util.*;
import java.util.HashSet;

public class SetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Set<String> hs = new HashSet<String>(); //unordered collection
		System.out.println(hs.size());
		hs.add("Priya");
		hs.add("roy");
		hs.add("jay");
		hs.add("sai");
		hs.add("kiran");
		
	hs.add(null);
	hs.add("Ram"); //duplicates not allowed
	System.out.println(hs);
	
	
	Iterator<String> i=hs.iterator();
	while (i.hasNext()) {
		String name=i.next();
		System.out.println(name);
	}
			
	
	}

}
