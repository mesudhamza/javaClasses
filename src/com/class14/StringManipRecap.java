package com.class14;

public class StringManipRecap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String str=new String("Hello");//"Hello" is an object
		String str3=new String("Hello");
		//if you do str==str3; (if you delete the statement above since you did not use new keyword.  then it will return true.)
		System.out.println(str==str3);
		
		System.out.println("*************************");
		
		
		String s1="Hello";
		String s2="Hello";
		System.out.println(s1==s2);
		
		System.out.println(str);
		String str2=str.replaceAll("Hello", "Bye");
		System.out.println(str2);
		
		
		
		
	}

}
