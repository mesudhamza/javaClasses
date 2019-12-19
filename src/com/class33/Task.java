package com.class33;

import java.util.ArrayList;
public class Task {

	public static void main(String[] args) {
		
		//create an array list of cars and retrieve all the values using 3 different ways
		
		
		ArrayList<String> car = new ArrayList<>();
		car.add("Mazda");
		car.add("Toyota");
		car.add("Chevrolet");
		car.add("Mitsubishi");
		car.add("Ferrari");
		
		//first way
		for(String cars: car) {
			System.out.println(cars);
		}
		//second way
		for(int i=0; i<car.size(); i++) {
			System.out.println(car.get(i));
		}
		//third way
		
//		Iterator<String> it=car.iterator();
// 		while(it.)
		
				
		
	}
	
	
}
