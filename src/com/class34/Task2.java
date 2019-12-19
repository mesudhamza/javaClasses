package com.class34;
//How  can  you  remove  all  duplicates  from ArrayList?

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Task2 {

	public static void main(String[] args) {
		List<String> aList=new ArrayList<>();
		aList.add("John");
		aList.add("Jane");
		aList.add("James");
		aList.add("Jasmine");
		aList.add("Jane");
		aList.add("James");
		
		
		Set<String> hset=new HashSet<>();
		hset.addAll(aList);
		System.out.println(hset);
		
		aList.clear();
		System.out.println(aList);
		aList.addAll(hset);
		System.out.println(aList);
		
		//second way, my solution:
		
//		for(int i=2; i<aList.size(); i++) {
//			String x=aList.get(1);
//			String y=aList.get(2);
//			
//			if(aList.get(i)==x || aList.get(i)==y) {
//				aList.remove(i);
//			}
//		}
//		
//		System.out.println(aList);
		
	
		
		
	}
	
	
	
	
	
	
	

	
	
	
}
