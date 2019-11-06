package com.class10;

import java.util.Scanner;

public class Homework78 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//			For you to do:
//			Note: Create Scanner class
//
//			Write an array with size of 5. 
//			Use a loop to input values to the array (don't print any prompt message for Scanner).
//			Then print out all the elements you have created in the first loop in reverse order. 
//
//			Example: 
//			Input: 
//			1
//			2
//			3
//			4
//			5
//
//			Output:
//			5
//			4
//			3
//			2
//			1
		Scanner userInput = new Scanner(System.in);
		int[] array=new int[5];
		for(int i=0; i<array.length; i++) {
			array[i] = userInput.nextInt();
		}
		for(int i=4; i>=0; i--) {
			System.out.println(array[i]);
		}
		
		
		
	}

}
