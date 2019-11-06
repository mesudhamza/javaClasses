package com.homeworks;

import java.util.Scanner;

public class Homework {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*Write a program to take user name, age and mobile number in single line.
		 * First Output: "Enter your name"
		 *Second Output: "Enter your mobile number" Third Output: "Enter your age"
		 *Final Output: "Your name is ___ , your age is ___ and your mobile number is (___)-___-____"
		 */
		

		Scanner scan=new Scanner(System.in);
		System.out.println("Enter your name");
		String userName=scan.nextLine();
		System.out.println("Enter your mobile number");
		String mobileNumber=scan.nextLine();
		System.out.println("Enter your age");
		int age=scan.nextInt();
		System.out.println("Your name is "+userName+ ", your age is "+ age+ " and your mobile number is "+mobileNumber);
		
		/*ask why console gave an error when I declared mobileNumber as int 
		 * when I did the same for age on line 23 no error was given?
		 */
		
		
		
		
		
	}

}
