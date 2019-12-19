package com.class25;

public class OverloadingTask {
//	3)Create 1 class with a private method that has 3 overloaded forms. 
//	Then call each overloaded method with specific arguments and observe result.
	
	private void display() {
		System.out.println("I am a private method");
	}
	
	private void display(int a, int b, int c) {
		System.out.println(a+b+c);
	}
	
	private void display(int a, int b) {
		int c=a+b;
		System.out.println(c);
	}
	
	private void display(int a) {
		System.out.println(a);
	}
	
	public static void main(String[] args) {
		
		OverloadingTask abc=new OverloadingTask();
		abc.display();
		abc.display(3, 2, 1);
		abc.display(20, 30);
		abc.display(200);
		
	}
	
	
}
