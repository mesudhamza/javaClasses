package com.homeworks;

import java.util.Scanner;

public class Homework40 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//			For you to do:
//			Write a program using the switch statement  
//			Let us consider the scenario regarding the born baby age 
//
//			First Output: "enter the age of the Child"
//
//			case 1: if age is 1 print as "You can Crawl"
//
//			case 2 : if age is 2 print as  "You can Talk"
//
//			case 3: If age is 3 print as "You can Dance"
//
//			case 4: if age is 4 print as "You can get  Trouble"
//
//			Other than this age (1-4) it should print "I don't know how old you are" 
		
		Scanner input=new Scanner(System.in);
		System.out.println("enter the age of the Child");
		int age=input.nextInt();
		
		switch (age) {
		case 1:
			System.out.println("You can Crawl");
			break;
		case 2:
			System.out.println("You can Talk");
			break;
		case 3:
			System.out.println("You can Dance");
			break;
		case 4:
			System.out.println("You can get  Trouble");
			break;
		default:
			System.out.println("I don't know how old you are");
		}
		
		
	}

}
