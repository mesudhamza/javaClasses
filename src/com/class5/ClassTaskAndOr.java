package com.class5;

import java.util.Scanner;

public class ClassTaskAndOr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num=9;
		
		if(num>=1 && num<=5) {
			System.out.println("It is a weekday");
		}else if(num>=6 && num<=7) {
			System.out.println("It is a weekend");
		}else {
			System.out.println("Invalid day");
		}
		
		Scanner input=new Scanner(System.in);
		System.out.println("What is your height?");
		int height=input.nextInt();
		
		if(height<5) {
			System.out.println("You are short");
		}else if(height>=5 && height<=6) {
			System.out.println("You are medium");
		}else if(height>=6) {
			System.out.println("You are tall");
		}else {
			System.out.println("invalid height");
		}
		
		
		
	}

}
