package com.class28;

import java.util.Scanner;

//For you to do
//
//Create a final method and name it reverseString with a return type of String. 
//when you call the method and enter the string parameter, the method should return my string. 
//implement a scanner class to reverse the string.
//
//Input:
//hello
//
//Output:
//olleh
public class Main {
	
	
	String word;
	String reversed;
	
	
	
	public final String reverseString(String word, String reversed) {
		
		for (int i = word.length() - 1; i >= 0; i--) {
			reversed = reversed + word.charAt(i);
		}
		return reversed;
	}
	
	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String word=scan.nextLine();
		Main obj=new Main();
		String abc=obj.reverseString(word, "");
		System.out.println(abc);
		
		
	}
	
	
	
	
}
