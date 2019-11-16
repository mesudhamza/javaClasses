package com.class13;

import java.util.Scanner;

public class Homework99 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		For you to do:
//
//			If browser is ChRoME it should print the: 
//			"Proceed with Chrome browser"
//
//			If browser is FireFOX it should print the: 
//			"Proceed with Firefox browser"
//
//			If browser is IE it should print the:
//			"Proceed with IE browser"
//
//			If any other browser it should print the:  
//			"Invalid browser"
		
		Scanner sc = new Scanner(System.in); 
		  System.out.println("Enter the browser name to proceed further with execution");
		   String browser = sc.nextLine(); 
		
		switch (browser.toLowerCase()) {
		case "chrome":
			System.out.println("Proceed with Chrome browser");
			break;
		case "firefox":
			System.out.println("Proceed with Firefox browser");
			break;
		case "ie":
			System.out.println("Proceed with IE browser");
			break;
		default:
			System.out.println("Invalid browser");
		}
		   
		//another way:
		
		 if(browser.equalsIgnoreCase("ChroME")) //you can use ignore case only in if statements
	        {
	            System.out.println("Proceed with Chrome browser");
	        }
	        else if(browser.equalsIgnoreCase("FireFOx"))
	        {
	            System.out.println("Proceed with Firefox browser");
	        }
	          else if(browser.equalsIgnoreCase("Ie"))
	        {
	            System.out.println("Proceed with IE browser");
	        }
	        else
	        {
	            System.out.println("Invalid browser");
	        }
		
		
		
	}

}
