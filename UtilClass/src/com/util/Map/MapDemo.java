package com.util.Map;
import java.util.*;
public class MapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<Integer,String> hashMap = new LinkedHashMap<>();
		hashMap.put(1, "Zeena");
		hashMap.put(1, "Raju");
		hashMap.put(45, "Peter");
		hashMap.put(null, "Robin");
		hashMap.put(54, "null");
		hashMap.put(54, "Tommy");
		hashMap.put(91, "Ram");
		
		
		System.out.println(hashMap);
		System.out.println(hashMap.get(45));
		System.out.println(hashMap.containsKey(10));
		System.out.println(hashMap.containsKey(1));
		
		Set<Integer> keys = hashMap.keySet();
		Iterator<Integer> i = keys.iterator();
		while(i.hasNext()) {
			
			Integer key = i.next();
			System.out.println("Key" +key+" ");
			System.out.println("Value " +hashMap.get(key));
		}
		}

}
