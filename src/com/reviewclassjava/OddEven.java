package com.reviewclassjava;

public class OddEven {

	public static void main(String[] args) {
//		// TODO Auto-generated method stub

		//Write a program to find if a number is even or odd 
	       //Print out  "My number must be even" or "My number must be odd" 
	        // Must use if else
		
		int x=6;
		
		if(x%2==0) {
			System.out.println("My number must be even");
		}else if(x%2!=0) {
			System.out.println("My number must be odd");
		}else {
			System.out.println("My number is invalid");
		}

		
		int a,b,c;
		
		a=1;
		b=2;
		c=3;
		
		if(a>b && a>c) {
			System.out.println("largest number is " +a);
		}else if(b>a && b>c) {
			System.out.println("largest number is " +b);	
		}else {
			System.out.println("largest number is " +c);
		}
		
	}
}
		
		



		

