package com.util.LinkedList;
import java.util.*;
public class LinkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		LinkedList<String> list = new LinkedList<String>();
		list.add("Apple");
		list.addFirst("Mango"); //methods of Linked list
		list.add(2, "Litchi");
		System.out.println(list);
		System.out.println(list.size());
		list.addLast("Peach");
		list.addFirst("Orange");
		System.out.println(list);
		
		Iterator<String> it = list.iterator();
		while (it.hasNext()) {
			String fruit = it.next();
			System.out.println(fruit);
			
		}
		
		System.out.println();
		
		System.out.println("returns head" +list.element());
		System.out.println(list);
		System.out.println("returns and removes head" +list.poll());
		System.out.println(list);
		System.out.println("returns head" +list.peek());
		System.out.println(list);
		
		System.out.println(list.poll());
		System.out.println("list" +list);
		System.out.println(list.poll());
		System.out.println("list" +list);
		System.out.println(list.poll());
		System.out.println("list" +list);
		System.out.println(list.poll());
		System.out.println("list after" +list);
		//System.out.println(list.add("new"));
		//System.out.println(list.remove()+"hello");
		System.out.println("last" +list.peek());
		System.out.println();
		System.out.println("called after removing" +list.poll());
		
	}

}
