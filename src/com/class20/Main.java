package com.class20;

//For you to do
//
//Declare a private,default,protected,public methods and 
//have them each return the name of the what access modifier they are using in order as below. 
//make the return values add to each other.
//
//Output:
//private, default, protected, public

public class Main {
	
	
	private String m1() {
		return "private";
	}
	String m2() {
		return "default";
	}
	protected String m3() {
		return "protected";
	}
	public String m4() {
		return "public";
	}
	  
	  public static void main(String[] args) {
	    Main obj=new Main();
		System.out.println(obj.m1()+", "+obj.m2()+", "+obj.m3()+", "+obj.m4());
		  
		  
	  }
}
