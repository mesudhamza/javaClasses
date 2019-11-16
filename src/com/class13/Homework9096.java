package com.class13;

public class Homework9096 {

	public static void main(String[] args) {
		

//		For you to do:
//		Create a String named "name" and assign the value "Timmy" to it. 
//		Find out how many characters are there in the given String. 
		
		String name= "Timmy";
		
		System.out.println(name.length());
		
		//other way:
		int length=name.length();
	    System.out.print(length);
	    
//	    For you to do:
//	    Create a String named s1 = "hello"  check weather string is empty or not
//	    Create a String named s2 = ""  check weather string is empty or not
	    System.out.println("-----------------");
	    
//	    String s1="hello";
//	    System.out.println(s1.isEmpty());
//	    String s2="";
//	    System.out.println(s2.isEmpty());
	    
	    System.out.println("-----------------");
//	    Create first String named str1= syntaxsolutions and convert into SYNTAXSOLUTIONS 
//	    Create first String named str2=  SYNTAXSOLUTIONS and convert into syntaxsolutions
	    
		String str1= "syntaxsolutions";
		System.out.println(str1.toUpperCase());
		
		String str2= "SYNTAXSOLUTIONS";
		System.out.println(str2.toLowerCase());
		
//		Validate if the string ends with "u" prints the Boolean value accordingly.
//		Validate if the string ends with "world" prints the Boolean value accordingly.
//		Validate if the string ends with "are" prints the Boolean value accordingly.
//		Validate if the string ends with "you" prints the Boolean value accordingly.
		
		System.out.println("-----------------");
		
		String s1="hello how are you"; 
		String k="u";
		System.out.println(s1.endsWith(k));
		//other way
//		boolean result= s1.endsWith("u");
//		System.out.println(result);
		
		boolean result1=s1.endsWith("world");
		System.out.println(result1);
		
		boolean result2=s1.endsWith("are");
		System.out.println(result2);
		
		boolean result3=s1.endsWith("you");
		System.out.println(result3);
		
		System.out.println("-----------------");
		
		//or you can do all of them like this:
		  System.out.println(s1.endsWith("u"));       
		  System.out.println(s1.endsWith("world"));     
		  System.out.println(s1.endsWith("are")); 
		  System.out.println(s1.endsWith("you"));
		  
//		  For you to do:
//
//		  Print out the position of the first occurrence of "c".
//		  Print out the position of the first occurrence of " ".
//		  Print out the position of the first occurrence of the variable target1.
//		  Print out the position of the first occurrence of the variable target2.
//
//		  Note: the output should be one per line. 
		  
//		  System.out.println("-----------------");
//		  String str = "abracadabra alakazam";
//		  String target1 = "dab";
//		  String target2 = "ABRA";
//
//		  System.out.println(str.indexOf("c"));
//		  System.out.println(str.indexOf(" "));
//		  System.out.println(str.indexOf(target1));
//		  
//		  String abc=target2.toLowerCase();
//		  System.out.println(abc);
//		  
//		  System.out.println(str.indexOf(abc));
		  
		  
		  System.out.println("-----------------");
		  
//		  For you to do:
//
//			  Output 1: print str starting at index 5 and going till the end.
//			  Output 2:  print str starting at index 7 and ending at index 10.
//			  Output 3: print "harambe". This must not be a new string, must be from str.
//			  Output 4: print "t f". This must not be a new string, must be from str. 
//
//			  Note: all outputs should be one per line
		  
//		  String str = "laptops out for harambe";
//		  System.out.println(str.substring(5));
//		  System.out.println(str.substring(7, 10));
//		  System.out.println(str.substring(16));
//		  System.out.println(str.substring(10, 13));
		  
		  
		  System.out.println("-----------------");
		  
		  
//		  For you to do
//			  			  Print out the character in the 5th index of the String str.
//			  			  Print out the character in the 8th index of the String str.
//			  			  Print out the character in the 1st index of the String str.
//			  			  Print out the character in the 10th index of the String str.
			  //
//			  			  Note: all print statements should be on one line.
		  
		String str = "boopity bop";
		  
		 
		String newStr= "" + str.charAt(5) + str.charAt(8) + str.charAt(1) + str.charAt(10);
		System.out.println(newStr);
		
//		 String newStr = "" + str.charAt(0) + str.charAt(2) + str.charAt(4);
//	        System.out.println(newStr);
		  
		System.out.println("-----------------");
		

		  
		 
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
	    
	}

}
