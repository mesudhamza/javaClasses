package com.class10;

import java.util.Scanner;

public class Homework80 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Note: Create a Scanner Class
//
//		Create an int array with the size of 5 and input values with Scanner. 
//		Create a loop and enter values into one loop (don't print prompt question for Scanner). 
//		Create the second loop to print the values and it must be multiplied by 10.
//		Print out each element of the array multiplied by ten, one element per line.
//
//		Example:
//		Input:
//		1
//		2
//		3
//		4
//		5
//
//		Output:
//		10
//		20
//		30
//		40
//		50
		
		int[] nums= new int[5];
		Scanner userInput=new Scanner(System.in);
		for(int i=0; i<nums.length; i++) {
			nums[i]=userInput.nextInt();
		}
		
		for(int i=0; i<=nums.length-1; i++) {
			System.out.println(nums[i]*10);
		}
		
	}

}
