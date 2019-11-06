package com.class7;

public class DoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num=10;
		while(num<=7) {
			System.out.println("Hello");
			num++;
		}
		
		int num1=10;
		do {
			System.out.println("Bye");
			num1++;
		}while(num1<=7);
		
		System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
		
		//print even numbers from 20 to 50 using do while
		
		int num2=20;
		do {
			System.out.println(num2);
			num2+=2;
		}while(num2<=50);
		
		//second way
		//use if and mod
		
		int num3=20;
		do {
			if(num3%2==0) {
				System.out.println(num3);
			}num3++;
				
		}while(num3!=52);
		
			
	
		
		
		
		
		
		
	}

}
