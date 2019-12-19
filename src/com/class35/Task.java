package com.class35;

import java.util.HashMap;


//create a map of buildings with duplicate values.
//learn how many entries in the map
//print the map
//change the value at key 4 with "syntax"
//remove 6th entry

public class Task {

	
	public static void main(String[] args) {
		HashMap<Integer, String> company=new HashMap<>();
		company.put(1, "Amazon");
		company.put(2, "Macys");
		company.put(3, "Macys");
		company.put(4, "Amazon");
		company.put(5, "Netflix");
		company.put(6, "Kohls");
		
		int a=company.size();
		System.out.println(a);
		System.out.println(company);
		
		company.replace(4, "syntax");
		System.out.println(company);
		
		company.remove(6);
		System.out.println(company);
		
		
		
		
		
	}
	
	
	
	
	
}
