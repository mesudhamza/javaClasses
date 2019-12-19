package com.class33;
import java.util.ArrayList;
import java.util.List;

public class HW3 {

	public static void main(String[] args) {
		/*
		 * create an arrayList of drinks.
		 * If any drink has letter "a" or "e" replace it with water.
		 */
		
		
		ArrayList<String>drinks = new ArrayList<>();
		drinks.add("cola");
		drinks.add("milk");
		drinks.add("juice");
		drinks.add("coffee");
		drinks.add("tea");
		
		System.out.println(drinks.get(0));
	
		drinks.set(0,"water");
		System.out.println(drinks);
		
		for(int i=0; i<drinks.size(); i++) {
			
		}
		
	}
	
	
}
