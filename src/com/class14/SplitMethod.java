package com.class14;

public class SplitMethod {

	public static void main(String[] args) {
		
		//This method splits this string around matches of the given regular expression.
		//all the words are separated into an array of strings.
		//we put in a one-dimensional array.

		String str="Video provides a powerful way to help you prove your point.";
		
		String[] array=str.split(" ");
		
		for(int i=0; i<array.length; i++) {
			System.out.println(array[i]);
		}
		
		
		
		//How can we find how many sentences are in the following string;
		
		String str1="Today is Sunday. Its sunny day. and we are having java class";
		
		String[] array2=str1.split("\\.");//splits the sentences and removes the dot.
		System.out.println("The number of Sentences in the given String is:: "+array2.length);
		
//		for(String string : array2) {
//			System.out.println(string);
//		}
	
		
		
	}

}
