package com.class13;

import java.util.Scanner;

public class Homework104 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		For you to do:
//
//			Inputs:
//			String word;
//
//			Write a for loop that will print out every other letter in a String, starting with the first letter.  
		//These letters should be printed all on one line with no space in between.
//
//			Sample input/outputs
//			In: hello
//			hlo
//
//			In: SSyynnttaaxxTTeecchhnnoollooggiieess
//			SyntaxTechnologies
		
		Scanner inp = new Scanner(System.in);
	    System.out.print("In:");
	    String word = inp.nextLine();
	    //write your code below
	    
		for (int i = 0; i <= word.length() - 1; i++) {
			if (i % 2 == 0) {
				System.out.print(word.charAt(i));
			}

		}
		
	
		
		
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    }
		
		
	}

