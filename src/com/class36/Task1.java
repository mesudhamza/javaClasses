package com.class36;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.ArrayList;

//Create the collection that will store single uniques Objects of a String type in which order is preserved.
//Write a logic to concatenate all string from the collection.
//
//Create a collection of integers in which you can keep duplicates. 
//Write a logic to find sum of all integers
public class Task1 {

	public static void main(String[] args) {
		
		LinkedHashSet<String> str= new LinkedHashSet<>();
		str.add("Paris");
		str.add("London");
		str.add("New York");
		str.add("Chicago");
		str.add("Madrid");
		str.add("Prague");
		str.add("Vienna");
		
		
//		System.out.println(str);
		
//		for(String s:str) {
//			System.out.println(s);
//		}
		
		Iterator<String> it=str.iterator();
		while(it.hasNext()) {
			System.out.print(it.next());
			
		}
		
		System.out.println("------------");
		System.out.println();
		
		
		ArrayList<Integer> intcol=new ArrayList<>();
		intcol.add(2);
		intcol.add(3);
		intcol.add(4);
		intcol.add(5);
		intcol.add(2);
		intcol.add(3);
		
		System.out.println(intcol.get(0));
		int sum=0;
		for (int y = 0; y < intcol.size(); y++) {
			sum=sum+intcol.get(y);
		}
		System.out.println("sum of all integers is "+sum);
		
		

		
	}
	
}
