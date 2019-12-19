package com.class24;

public class Employee {

//	1. Complete the Employee.java class:
//
//		Include the following class variables:
//		* name(String)
//		* lastName(String)
//		* employeeId(int)
//		* startDate(String)
//		* salary(int)
//
//
//		Write two constructors:
//
//		* non-argument constructor
//		* parameterized constructor
//
//		Create two different objects of the Employee class using both constructors and print the values of the properties 
//		inline using a print method.
//
//
//		Output:
//		 
//		null null 0 null 0
//		Joe Smith 12345 01/01/1970 35000
	
	String name;
	String lastName;
	int employeeId;
	String startDate;
	int salary;
	
	
	
	Employee(){
	}
	Employee(String name1, String lastName1, int employeeId1, String startDate1, int salary1){
		name=name1;
		lastName=lastName1;
		employeeId=employeeId1;
		startDate=startDate1;
		salary=salary1;
	}
	
}
