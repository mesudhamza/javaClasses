package com.class35;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Task2 {

	public static void main(String[] args) {
		
		//Create a map of countries with its capital.
			//Print all keys and values from a country map using for each loop and iterator
		    //Print all values from a country map using for each loop and iterator.
		
		Map<String, String> countryMap = new HashMap<>();
		countryMap.put("Turkey", "Ankara");
		countryMap.put("USA", "Washington D.C");
		countryMap.put("Bulgaria", "Sofia");
		countryMap.put("Greece", "Athens");
		countryMap.put("Iran", "Tehran");
		countryMap.put("Russia", "Moscow");
		
		System.out.println(countryMap);
		Collection<String> values = countryMap.values();
		
		for(String val: values) {
			System.out.println(val);
		}
		System.out.println("-------------------");
		Iterator<String> valIte = values.iterator();
		while (valIte.hasNext()) {
			System.out.println(valIte.next());
			}
		
		System.out.println("----Printing all keys and values---");
		
		Set<String> keys=countryMap.keySet();
		
		for(String key:keys) {
			System.out.println(key+":"+countryMap.get(key));
		}
		System.out.println("----Printing all keys and values using Iterator---");
		Iterator<String> keysIterator=keys.iterator();
		while(keysIterator.hasNext()) {
			String abc=keysIterator.next();
			String def=countryMap.get(abc);
			System.out.println(abc+ ":"+def);
			
		}
		
		
		
		
		
		
		
		
	}
}