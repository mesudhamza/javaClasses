package com.class11;

public class Task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Create a 2D array of integer type with 3 rows and 4 columns and print all values of the whole array.
//Create a 2D array or integer type where you will store odd and even numbers in 3 rows and 4 columns. 
		//Develop a program which will identify/print the even numbers only.
		//Create a 2D array or integer type and store numbers in 3 rows and 3 columns. Print the sum of all numbers.		
		
		
		int [] [] numbers = {
				{35,26,87,90},
				{99,34,12,65},
				{76,43,11,55}
		};
		
		for(int i []:numbers) {
			for(int y:i) {
				System.out.print(y+" ");	
			}
			System.out.println();
		}
	

	}
}
