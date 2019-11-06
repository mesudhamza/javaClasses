package com.class4;

import java.util.Scanner;

public class ScannerTaskTwo {

	public static void main(String[] args) {
		
		Scanner age= new Scanner(System.in);
		System.out.println("How old are you?");
		int num2=age.nextInt();
		
		if(num2>=18) {
			System.out.println("I will issue a drivers license to the customer");
		}else {
			System.out.println("please get a learner's permit!");
	}
}
}	
