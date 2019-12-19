package com.class25;

public class X {

//	2)Create 1 class with a static method that has 3 overloaded forms. 
//	Then call each overloaded method with specific arguments and observe result.

	
	public static void display() {
		System.out.println("I am a static method with no parameters");
	}
	
	public static void display(String a, String b, String c) {
		System.out.println(a+" "+b+" "+c);
	}
	
	public static int display(String a, String b) {//since you changed the return type here java did not execute
		int z=2;
		return z;
	}
	
	public static void display(int x, int y, int z) {
		int a=x+y+z;
		System.out.println(a);
	}
	
	public static void display(String a, String b, String c, String d) {
		System.out.println(a+" "+b+" "+c+" "+d);
	}
	
	public static void main(String[] args) {
		
		X obj=new X();
		obj.display();
		obj.display("abc", "hello");//overloading did not work because you changed the return type.
		obj.display("Mesud", "Hamza", "Hasgur");
		obj.display(3, 5, 7);
		obj.display("Hello", "from", "the", "otherside");
		
	}
	
	
	
	
	
	
	
	//this is not overloading: you cannot change the return type.
//	public static int display(int x, int y, int z) {
//		int a=x+y+z;
//		return a;
//	}
	
	
	

}
