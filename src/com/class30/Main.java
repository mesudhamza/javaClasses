package com.class30;

import java.util.Scanner;

//Create a final method. the final method should have no return type. 
//What i want for you to do is in the final method create logic to reverse 2 numbers. 
//for instance a=12 and b =10. i want b to have the value of 12 and a to have the value of 10. 
//DO NOT REASSIGN the values, you must create logic where they both swap numbers
//THIS IS A SCANNER INPUT.
//
//
//Input: 
//12
//10
//
//Output:
//a is now assigned value of 10
//b is now assigned value of 12
public class Main {
//	if(a==a && b==b) {
//		a=b;b=a;
//	}
	
	
	
	public final void myMethod(int a, int b) {
		
	System.out.println("a is now assigned value of "+a);
	System.out.println("b is now assigned value of "+b);
		
	}
	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int a=scan.nextInt();
		int b=scan.nextInt();
		Main obj=new Main();
		obj.myMethod(b, a);
	}
	
}
