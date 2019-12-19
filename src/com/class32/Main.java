package com.class32;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
//Set
//
//Create a hashset.
//Add the values as
//first
//second
//third
//fourth 
//fifth 
// 
//
//then create a logic to print the values of hashset one by one .
//
//Output:
//
//third
//fifth
//fourth
//first
//second

public class Main {

	public static void main(String[] args) {
		
		Set<String> hset=new HashSet<>();
		hset.add("first");
		hset.add("second");
		hset.add("third");
		hset.add("fourth");
		hset.add("fifth");
		
		Iterator<String> it= hset.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		
		
	}
	
	
	
	
	
}
