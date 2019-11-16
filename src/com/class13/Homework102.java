package com.class13;

import java.util.Scanner;

public class Homework102 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		For you to do: 
//		The code provided in your main method will take in five Strings and save them into an array called arr.  
//		Print out the first three letters of each element of array, one per line.  
//
//		Note: every element of array is at least 3 letters long. 
		
		
		Scanner input = new Scanner(System.in);
		String[] arr = new String[5];
		for (int i=0;i<5;i++)
		{
			arr[i] = input.nextLine();
			
		}
		
//		for(int i=0; i<5; i++) {
//			System.out.println(arr[i].charAt(0));
//			System.out.println(arr[i].charAt(1));
//			System.out.println(arr[i].charAt(2));
//		}
		
		for(int i=0; i<5; i++) {
			System.out.println(arr[i].substring(0, 3));
			
		}
		//another way
		for(int j=0;j<arr.length;j++){
			   if(arr[j].length()>=3)
			   System.out.println(arr[j].charAt(0)+""+arr[j].charAt(1)+""+arr[j].charAt(2));
			}
		
	}

}
