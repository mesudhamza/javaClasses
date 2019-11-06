package com.homeworks;

public class Homework34 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

////		Declare 4 int variables a, b, c and d. 
////		Your variable c is the result of addition of a & b. 
////		Variables a & b should be more than d, and c should be more than d. 
////
////		Output: 
////		true
////		true
//		
		int a,b,c,d;
		a=5;
		b=6;
		c=11;
		d=4;
		
		c=a+b;
		
		if((c==a+b && c>d)) {
			System.out.println("true");
			if(a>d && b>d) {
				System.out.println("true");
			}
		}

		
		
		
		
		
		
	}

}
