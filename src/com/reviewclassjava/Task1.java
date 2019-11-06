package com.reviewclassjava;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		////Write a program with one int value for salary and four String values for different cars
        //If you make over 50000 a year, you may buy a brand new car otherwise you should buy a used car. 
		//For those you can afford a new car there are different price ranges
        //I want anything under 70k to be Audi A5
        //I want anything under 80k to be Mercedes-Benz
        //I want anything under 90k to be Jaguar
        //I want anything under 100k to be Tesla
        // And if you make less than 60k output to read "Save up money and wait until next year"
		
	
		String A="AudiA5";
		String M="Mercedes-Benz";
		String J="Jaguar";
		String T="Tesla";
		
		Scanner input=new Scanner(System.in);
		System.out.println("What is your annual salary?");
		int salary=input.nextInt();
		if(salary>50000) {
			System.out.println("You may buy a brand new car");
			if(salary>=50000 && salary<60000) {
				System.out.println("Save up money and wait until next year");
			}else if(salary>=60000 && salary<70000) {
				System.out.println("You may buy " + A);
			}else if(salary>=70000 && salary<80000) {
				System.out.println("You may buy " + M);
			}else if(salary>=80000 && salary<90000) {
				System.out.println("You may buy " + J);
			}else if(salary>=90000 && salary<100000) {
				System.out.println("You may buy " + T);
			}
		}else {
			System.out.println("You should buy a used car");
		}
		
		
	}

}
