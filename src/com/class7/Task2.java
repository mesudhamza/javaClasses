package com.class7;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		String creditcard;
		Scanner scan=new Scanner(System.in);
			
		for(int i=1; i<=10; i++) {
			System.out.println("Please apply for a credit card");
			creditcard=scan.nextLine();
			if(creditcard.equalsIgnoreCase("yes")) {
				break;
			}
		 
		}		
		

		
	}

}
