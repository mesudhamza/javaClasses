package com.class30;

public interface Drivable {


// it is also a collection of public static final variables (constant variables)
	//naming convention: variable name must be all capital.Java will ask you to initialize the variable.You have to initialize
	//when you declare
	
	//compiler will add for you: public static final
	boolean DRIVE_FAST=true;
	
	//by default compiler will add public abstract. It is a collection of public abstract methods
	void drive();
	
}
class Cars{
	
	public void stop() {
		System.out.println("Car stops by pressing breaks");
	}
	
	
}




//from class to class-->extends
//from class to interface-->use implements
class Toyota extends Cars implements Drivable{

	@Override
	public void drive() {
		System.out.println("Toyota can drive");
	}
	
}
