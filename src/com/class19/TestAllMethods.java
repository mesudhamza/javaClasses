package com.class19;

public class TestAllMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//find the largest from 300 and 500
				//then identify is the largest number is odd
				
				AllMethods obj=new AllMethods();
				int large=obj.findLargest(300, 500);
				System.out.println(large);
				boolean odd=obj.isOdd(large);
				System.out.println(odd);
				
				//call method weekdayname
				// if(tuesday, wednesday, thursday, saturday
				//sunday) -->I am learning java
				
				
				String day=obj.weekDayName(1);
				if(day.equals("Tuesday") || day.equals("Wednesday")|| day.equals("Thursday") || day.equals("Sunday") || day.equals("Saturday")) {
	                System.out.println("I am learning Java");
	            
	            }else {
	                System.out.println("Holiday");
	            }
				
			}
		}
