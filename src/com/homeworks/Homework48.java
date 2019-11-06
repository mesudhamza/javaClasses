package com.homeworks;

import java.util.Scanner;

public class Homework48 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//			For you to do: 
//			Prompt user to input either "M" or "F" as a String "gender" and input any value as int "age". 
//
//			You have 2 conditions:
//			If age is above 25, your inner condition, depending on your gender value, should get either "Woman" or "Man" as an output. 
//			If age is below 25, your inner condition, depending on your gender value, should get either "Girl" or "Boy" as an output. 
//
//			Instruction: after you run your code, start inputing your values without Prompt question to appear. 
//
//			Hint: your age should not be equal to 25. 
		
		Scanner input = new Scanner(System.in);
		String gender = input.nextLine();

		if (gender.contentEquals("M")) {
			int age = input.nextInt();
			if (age > 25) {
				System.out.println("Man");
			} else {
				System.out.println("Boy");
			}
		} else if (gender.contentEquals("F")) {
			int age = input.nextInt();
			if (age > 25) {
				System.out.println("Woman");
			} else {
				System.out.println("Girl");
			}
		} else {
			System.out.println("Invalid");
		}

	}

}
