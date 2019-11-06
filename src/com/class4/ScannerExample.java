package com.class4;

import java.util.Scanner;

public class ScannerExample {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter any number");
		/*nextInt(); --> for numbers
		 * nextLine();--> Strings
		 * nextDouble();--> double
		 */
		int number=scan.nextInt();
		System.out.println("Entered nunber is "+number);
		
		System.out.println("**********************************");
		
		Scanner input=new Scanner(System.in);
		System.out.println("Please enter your name");
		String name=input.nextLine(); /*this line is gonna go to your console and you put a name and then
										will print in the next line*/
		System.out.println("Good afternoon "+name);
		
	}
}
