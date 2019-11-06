package com.class3;

public class EvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=6;
		int b=2;
		int remainder=a%b;
		
		if(remainder>0) {
			System.out.println("it is odd");
		
		}else if(remainder==0) {
			System.out.println("it is even");
		}
		//even or odd(7,8)
		int i=137;
		
		if(i%2==0) {
			System.out.println(i+ " is an even number");
		}else {
			System.out.println(i+ " is an odd number");
		}
		//2
		
		if (i%2!=0) {
			System.out.println(i+ " is an odd number");
		
		}else {
			System.out.println(i+ " is an even number");
		}
	}

}
