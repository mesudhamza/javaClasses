package com.homeworks;

import java.util.Scanner;

public class Homework46 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//			For you to do:
//			Initialize an object for Scanner class, condition is if object is greater than 400 
//			create a nested if condition to see if object is less than or equal to 600. 
//			If object is less than or equal to 600 have output say "don't calculate commission", 
//			if object is greater than or equal to 600 then have output say "Value is too large". 
//			For anything less than the value of 400 in the first condition please print "calculate commission".
//
//			Output:
//
//			If i enter 200 output should read "Calculate commission"
//
//			If i enter 400 output should read "Don't calculate commission"
//
//			If i enter 800 output should read "Value is too large"

		Scanner input = new Scanner(System.in);
		System.out.println("Please enter an object");
		int object = input.nextInt();

		if (object >= 400) {
			if (object <= 600) {
				System.out.println("don't calculate commission");
			} else if (object >= 600) {
				System.out.println("Value is too large");
			}
		} else {
			System.out.println("calculate commission");
		}

	}

}
