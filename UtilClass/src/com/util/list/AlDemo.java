package com.util.list;

import java.util.*;
public class AlDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		List<String> list =new ArrayList<>();
		System.out.println("size" +list.size());
		list.add("Ram");
		list.add("tom");
		list.add("John");	
		
		//list.add(100);
		list.add("Roy");
		System.out.println("List" +list);
		System.out.println("size" +list.size());
		
		System.out.println(list.get(1));
		list.set(1,"Hanna");
		System.out.println("List" +list);
		list.add(1,"Joseph");
		System.out.println("List" +list);
		System.out.println();
		Iterator<String> i=list.iterator();
		while(i.hasNext()){
			String name = i.next();
			System.out.println("Welcome" +name);
			
		}
		
		System.out.println();
		ListIterator<String> li = list.listIterator(3);
		while(li.hasPrevious()){
			String name=li.previous();
			System.out.println("Welcome" +name);
			
		}
		System.out.println();
		//Collections.sort(list);
		for(String name : list){
			
			System.out.println("hi" +name);
			
		}
		
		System.out.println(li instanceof List);
		System.out.println(li instanceof Iterator);
		System.out.println(li instanceof ListIterator);
		
		System.out.println(li instanceof Object);
	}

}
