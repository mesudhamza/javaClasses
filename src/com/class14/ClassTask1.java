package com.class14;

public class ClassTask1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		//Create a String that will hold a sentence. Write a program to get a new String without any spaces.
//		​//Create a String that should be combination of letters, numbers and special characters. 
//		//Find out how many alpha characters are there in the String.
//		​//You have a String a=”Is it saturday? Is it raining? Do we have a Java Class today?” 
//		//How would you find out how many sentences are in that String?
		
		
		//1
		String str="Create a String that will hold a sentence";
		System.out.println(str.replaceAll(" ", ""));
		//2
		
		String str1="abcd587986@#$%&";
		String str2=str1.replaceAll("[^A-z]", "");
		System.out.println(str2);
		System.out.println(str2.length());
		
		//3
		
		String a="Is it saturday? Is it raining? Do we have a Java Class today?";
		String[] array=a.split("\\?", 3);
		System.out.println(array.length);
		
		for(int i=0; i<array.length; i++) {
			System.out.println(array[i].trim());
		}
		
		
		
	}

}
