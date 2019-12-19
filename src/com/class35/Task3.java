package com.class35;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Map.Entry;

//Create a map of Best Buy store. Place
//item id and item name into it. Example (7664847 = Printer, 7879885= TV etc )
//Retrieve all keys and values from a Best Buy map using EntrySet.
public class Task3 {

	public static void main(String[] args) {
		
		Map<Integer, String> bestBuy=new TreeMap<>();
		bestBuy.put(3456, "Printer");
		bestBuy.put(12345, "Laptop");
		bestBuy.put(67890, "TV");
		bestBuy.put(67701, "Keyboard");
		bestBuy.put(12345, "PC");
		
		System.out.println(bestBuy);
		
		System.out.println("-------------------------");
		
		Set<Entry<Integer, String>> entrySet=bestBuy.entrySet();
		
		for(Entry<Integer, String> entry:entrySet) {
			System.out.println(entry.getKey()+":"+entry.getValue());
		}
		
	
		
		Iterator<Entry<Integer, String>> entryIterator=entrySet.iterator();
		while(entryIterator.hasNext()) {
			Entry<Integer, String> ent=entryIterator.next();
			String entry=ent.getKey()+"-----"+ent.getValue();
			System.out.println(entry);
		}

	}

}
