package com.util.Vector;
import java.util.*;
public class VectorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         
		Vector<String> vec = new Vector<>();
		vec.add("Mango");
		vec.addElement("Grapes");
		vec.addElement("Strawberry");
		vec.addElement("Apple");
		
		System.out.println(vec);
		
		Enumeration<String> en = vec.elements();
		
		while (en.hasMoreElements()){
			String fruit = en.nextElement();
			System.out.println(fruit);
			
		}
		System.out.println();
		Iterator<String> i = vec.iterator();
		
		while (i.hasNext()){
			String fruit = i.next();
			System.out.println(fruit);
		}
	}

}
