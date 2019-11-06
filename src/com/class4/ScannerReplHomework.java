package com.class4;

import java.util.Scanner;

public class ScannerReplHomework {

	public static void main(String[] args) {
		
		/*For you to do: 
        Write  a program that takes user's first name and surname.
        First input: "Please Enter First Name" should print first input.
        Second input:"Please Enter Surname" should print second input.
        Final Output: 
        Print both first name and surname on one line. 
        Make sure there is a space between First Name and Surname.*/
		
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Please Enter First Name");
		
		String firstName=scan.nextLine();
		
		System.out.println("Please Enter Surname");
		
		String Surname=scan.nextLine();
		
		System.out.println(firstName+ " "+Surname);
		
		Scanner in=new Scanner(System.in);
	    System.out.println("How old are you?");
	    int num1=in.nextInt();
	     
	    int addten=(num1+10);
	    System.out.println("Your age after 10 years is "+ addten);
		
		
		
		
		
		
	}
}
