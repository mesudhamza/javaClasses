package com.class25;

public class Overload {

//	Write program to overload static method
//
//
//	Create the two static method with same name 
//	first method without parameter inside the method Print "method without parameter"
//	second method with an int parameter, inside the method print "method with int parameter"
//
//	call the method and check the output. 
//
//	output would 
//	 
//	method without parameter
//	method with int parameter
	
	public static void display() {
		System.out.println("method without parameter");
	}
	
	public static void display(int a) {
		System.out.println("method with int parameter");
	}
	
	public static void main(String[] args) {
		
		Overload.display();
		Overload.display(1);
		//other way:
//		display();
//		display(1);
	}

}
