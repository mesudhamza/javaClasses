package com.class13;

import java.util.Scanner;

public class Homework103 {

	public static void main(String[] args) {
		//Write a for loop that will loop through every character of a word and print out each character, each on a separate line
		
		Scanner inp = new Scanner(System.in);
	    System.out.print("In:");
	    String word = inp.nextLine();
	    //write your code below
	  
//		char [] array=word.toCharArray();
//		
//		for(int i=0; i<array.length; i++) {
//			System.out.println(array[i]);
//		}
		
		//another way:
		
		for(int i=0;i<=word.length()-1;i++){
		      System.out.println(word.charAt(i));
		    }
		
	}

}
