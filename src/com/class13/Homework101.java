package com.class13;

public class Homework101 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		For you to do:
//
//			Create a String with value "hello how are you". 
//			Step 1: Replace the  "h" with "t".
//			Step 2: Replace "you" with "hi".
//			Step 3: Replace  "hello how are you"  with  "i am fine".
//
//			Print out all three output.
		
		
		String s1="hello how are you";
		String s2=s1.replace("h", "t");
		System.out.println(s2);
		String s3=s1.replaceAll("you", "hi");
		System.out.println(s3);
		String s4=s1.replaceAll("hello how are you", "i am fine");
		System.out.println(s4);
		
		//or shorter way just to print without having to use replaceAll method
		
		System.out.println(s1.replace('h','t'));
	    System.out.println(s1.replace("you","hi"));
	    System.out.println(s1.replace("hello how are you","i am fine"));
	    
	    
	}

}
