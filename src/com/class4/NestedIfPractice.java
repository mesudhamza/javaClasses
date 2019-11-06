package com.class4;

public class NestedIfPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean isFriday=true; //if you change it to false than else statement will be printed
		int day=131;
		
		//if today is friday only then I want to check if the day is 13
		
		
		if (isFriday) {
			System.out.println("Today is Friday");
			
			if(day==13) {
				System.out.println("I will watch scary movie");
			}else {
				System.out.println("I will watch comedy");
			}
		}else {
			System.out.println("Today is not Friday");	
		}
	}

}
