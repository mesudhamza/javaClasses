package com.class14;

public class ToCharArrayMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//how to turn string into an array of characters
		//this method converts this string to a new character array.
		
		String str="Syntax";
		
		char[] array = str.toCharArray();
		
		for(char i:array) {
			System.out.println(i);
		}
		
		
		
		
	}

}
