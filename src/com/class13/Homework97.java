package com.class13;

import java.util.Scanner;

public class Homework97 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		For you to do:
//
//		Using Scanner class input string value. 
//		Print out the following: "The first 3 letters of ___ is ___"
//
//		For example, if the input is "banana", your output should be: "The first 3 letters of banana is ban".
		
		Scanner input=new Scanner(System.in);
		
		String letters=input.nextLine();
		System.out.println("The first 3 letters of " + letters+" is "+ letters.charAt(0)+letters.charAt(1)+letters.charAt(2));
		
		
//		For you to do:
//
//			You have Scanner class to input string value. 
//
//			If language is Java it should print the: 
//			"Java is a programming language".
//
//			If language is C it should print the:
//			"C is a procedural programming language"
//
//			If language is C++ it should print the:
//			"C++ is a middle-level programming language"
//
//			If any other should print:
//			"Doesn't match any programming language"
		
		
	
		
		
	}

}
