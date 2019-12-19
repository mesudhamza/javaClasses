package com.class30;

public class DrivableTest {

	public static void main(String[] args) {//since you cannot create the object of an undefined class, you cannot create the object of 
		//undefined interface.you have to create the object of the concrete class and assign it to interface.
		Drivable obj= new Toyota();
		obj.drive();
		//Drivable.DRIVE_FAST=false; CE: final value cannot be reassigned
		Toyota toyota= new Toyota();
		toyota.drive();
		toyota.stop();
	}
	
}
