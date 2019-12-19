package com.class23;
//inheritance
public class B extends A{

	B(){
		super.printF();
	}
	
	
	//you dont override it, java sees it as a different method, because you cannot override a static method
//	public static void printF() {
//		System.out.println("A");
//	}
	
	
	public static void main(String[] args) {
		B obj=new B();
		B.printF();//You access static method with class name
	}
	
}
