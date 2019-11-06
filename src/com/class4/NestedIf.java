package com.class4;

public class NestedIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean b=true;
		boolean classToday = true; //if you change the value to false the output will be line 12 and line 19
		
		//you change the top and bottom boolean values and try different combinations
		
		if (b) {
			System.out.println("Hello");
			
			if (classToday) {
				System.out.println("Hello my friends");
			}else {
				System.out.println("Bye");
			}
			System.out.println("I will continue coding");  //this is independent from the above statements
															//it will be printed anyways
		}
	}

}
