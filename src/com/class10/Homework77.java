package com.class10;

import java.util.Scanner;

public class Homework77 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//			For you to do:
//			Write a program that creates an array of strings with the size being 7. 
//			Ask the user to input Days of a week beginning with Sunday using Scanner class.
//			Add these inputs to your array and then print all values from that array
//
//			Example:
//			Please enter day 1 of the week
//			Sunday
//			Please enter day 2 of the week
//			Monday
//			Please enter day 3 of the week
//			Tuesday
//			Please enter day 4 of the week
//			Wednesday
//			Please enter day 5 of the week
//			Thursday
//			Please enter day 6 of the week
//			Friday
//			Please enter day 7 of the week
//			Saturday
//
//			Hint: you will need 2 for loops but it is not nested loops. 

		
		String[] days=new String[7];
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter day 1 of the week");
		days[0]=scan.nextLine();
		System.out.println("Please enter day 2 of the week");
		days[1]=scan.nextLine();
		System.out.println("Please enter day 3 of the week");
		days[2]=scan.nextLine();
		System.out.println("Please enter day 4 of the week");
		days[3]=scan.nextLine();
		System.out.println("Please enter day 5 of the week");
		days[4]=scan.nextLine();
		System.out.println("Please enter day 6 of the week");
		days[5]=scan.nextLine();
		System.out.println("Please enter day 7 of the week");
		days[6]=scan.nextLine();
		
		for(int i=0; i<days.length; i++) {
			System.out.print(days[i]+ " ");
		}
		
		//Another way
		
		Scanner userInput = new Scanner(System.in);

		String[] arr = new String[7];

		for (int i = 0; i <arr.length; i++) {

			System.out.println("Please enter day " + (i+1) + " of the week");
			arr[i] = userInput.next();
		}
		
		
		for(int i=0; i<=arr.length-1; i++){
			System.out.println(arr[i]);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
