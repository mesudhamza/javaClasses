package com.class13;

import java.util.Scanner;

public class Homework98 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in); 
		  System.out.println("Enter any programming language");
		   String language = sc.nextLine(); 
		    if(language.equals("Java")) {
		    	System.out.println("Java is a programming language");
		    }else if(language.equals("C")) {
		    	System.out.println("C is a procedural programming language");
		    }else if(language.equals("C++")) {
		    	System.out.println("C++ is a middle-level programming language");
		    }else {
		    	System.out.println("Doesn't match any programming language");
		    }
		
	}

}
