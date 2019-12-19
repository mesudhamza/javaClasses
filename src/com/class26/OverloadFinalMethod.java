package com.class26;

public class OverloadFinalMethod {

//	Create the two final method with same name
//	First method with boolean parameter
//	Second method with String parameter
//
//	code to print below sentences. 
//
//	call them in main method
//
//	output would 
//
//	Final method with boolean parameter
//	Final method with String parameter
	
	public final void myMethod(boolean a) {//you can overload a final method, but you cannot override it because its final.
		System.out.println("Final method with boolean parameter");
	}
	
	public final void myMethod(String a) {
		System.out.println("Final method with String parameter");
	}
	
	public static void main(String[] args) {
		OverloadFinalMethod obj=new OverloadFinalMethod();
		obj.myMethod(false);
		obj.myMethod(null);
	}

}
