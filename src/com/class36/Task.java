package com.class36;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import java.util.TreeMap;

//Create a Map from array of cities that will sort keys in alphabetical order. 
//As a key store the name of the city and as a value store the length of the city (Example: Paris=5, Moscow =6, Washington DC=13 etc..). 
//If any city name is more than 7 characters remove that city ( use Iterator ). 
//Create a Map that will store Employee name and salary. Write a logic to retrieve an employee who gets the highest salary. 
//Output should be in the below format
//John Smith=$100000
public class Task {

	public static void main(String[] args) {
		
		Map<String, Integer> cityLength=new TreeMap<>();
		cityLength.put("Paris", 5);
		cityLength.put("Ankara", 6);
		cityLength.put("London", 6);
		cityLength.put("Dushanbe", 8);
		cityLength.put("New York", 8);
		cityLength.put("Manchester", 10);
		
		System.out.println(cityLength);
		
		Set<String> keySet=cityLength.keySet();
		
		Iterator<String> it=keySet.iterator();
		while(it.hasNext()) {
			if(it.next().length()>7) {
				it.remove();
			}
		}
		
		System.out.println(cityLength);
		
		
		Map<String, Integer> empInfo=new HashMap<>();
		empInfo.put("John Doe", 100000);
		empInfo.put("Mesud Hasgur", 200000);
		empInfo.put("Jack Smith", 300000);
		empInfo.put("Richard Brown", 350000);
		empInfo.put("Mary Roberts", 400000);
		
		System.out.println(empInfo);
		
		System.out.println(empInfo.get("John Doe"));
		
		int max=empInfo.get("John Doe");
		
		
		Collection<Integer> coll=empInfo.values();
		for(int i=0; i<coll.size(); i++) {
			System.out.println(coll);
			}
			
		}
	
		
		
//		Integer i=ent.getKey();
//		Car c=ent.getValue();
//		System.out.println("Key "+i +" is associated with value of "+c.make);
		
//		int max = b[0][0];
//
//		for (int i = 0; i < b.length; i++) {
//			for (int k = 0; k < b[i].length; k++) {
//				if (b[i][k] > max) {
//					max = b[i][k];
////					System.out.println(max);
//				}
//			}
//		}
//		System.out.println("maximum is " + max);
     
	}

