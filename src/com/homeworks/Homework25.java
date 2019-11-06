package com.homeworks;

import java.util.Scanner;

public class Homework25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*For you to do:
		 * Create a Scanner class
		 * Create a program that will ask user to input boolean value "Input the boolean value"
		 * If the input is True or False, then the output should look like below: Output: "The value is __true/false____" */
		
		
		Scanner scan;
		Scanner input=new Scanner(System.in);
		System.out.println("Input the boolean value");
		boolean abc=input.nextBoolean();
		
		if(abc) {
			System.out.println("The value is " +abc);
		}else {
			System.out.println("The value is " +abc);
		}
		
		
		
		
		
		
		
	}

}
