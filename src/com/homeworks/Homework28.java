package com.homeworks;

import java.util.Scanner;

public class Homework28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner inp = new Scanner(System.in);
	  	System.out.print("In:");
	  	int num = inp.nextInt();
	  	//DO NOT CHANGE ABOVE CODE!  Write your code below
	  	
	  	/*The variable "num" holds an integer user input
	  	 * Write a conditional statement starting on line 9 that does the following:
	  	 *If num is positive, print "__ is positive"
	  	 *If num is negative, print "__ is negative"
	  	 *If num is equals to 0, then print "Entered number is equals to 0"*/
	  	
	  	
	  	
	  	if(num>0) {
	  		System.out.println(num+" is positive");
	  	}else if(num<0) {
	  		System.out.println(num+" is negative");
	  	}else if(num == 0) {
	  		System.out.println("Entered number is equals to 0");
	  	}else {
	  		System.out.println("Entered number is unknown");
	  	}	
		
	}

}
