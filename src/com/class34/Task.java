package com.class34;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

//1.Create a Set collection in which you need to add  names  of  the  countries.  
//In  this  set  we want all objects to be sorted in alphabetical order. 
//Using  2  different  ways  retrieve  all elements from set.

//2.Create  a  Set  of  cities  in  which  you  want  to make sure that insertion order is maintained. 
//Using Iterator remove any city that starts with “A”;
public class Task {

	public static void main(String[] args) {
		Set<String> countryName = new TreeSet<>();
		countryName.add("Turkey");
		countryName.add("Pakistan");
		countryName.add("USA");
		countryName.add("Albania");
		countryName.add("Denmark");
		countryName.add("Croatia");
		countryName.add("France");
		
		Iterator<String> it=countryName.iterator();
		while(it.hasNext()) {
			String element=it.next();
			System.out.println(element);
		}
		System.out.println("-----------------");
		//enhanced for loop
		for(String el:countryName) {
			System.out.println(el);
		}
		
		Set<String> cityName = new LinkedHashSet<>();
		cityName.add("Izmir");
		cityName.add("Ankara");
		cityName.add("Istanbul");
		cityName.add("Paris");
		cityName.add("San Antonio");
		cityName.add("Trabzon");
		
		Iterator<String> ite=cityName.iterator();
		while(ite.hasNext()) {
			if(ite.next().startsWith("A")){
				ite.remove();
			}
		}
		System.out.println(cityName);
		
		
		
		
		
		
		
	}
	
	
	
}
