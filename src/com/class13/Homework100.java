package com.class13;

public class Homework100 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//
//		For you to do:
//			Create a String named "Welcome To Syntax Solutions".
//			Convert the String into array and using toCharArray method print all values. 
//			Output should be like :

		String str1="Welcome To Syntax Solutions" ;
		
		char[] array = str1.toCharArray();
//		System.out.println(array.length);
//		System.out.println(array[0]);
		
		for(char i:array) {
			System.out.println(i);
		}
		
		
//		for(int i=0; i<array.length; i++) {
//			System.out.println(array[i]);
//		}
		
	}

}
