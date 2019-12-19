package com.class26;

public class RunTimePolymorphism {

	//Type casting for primitive types
	public static void main(String[] args) {
		//widening 
		double d=90;
		//narrowing
		int i=(int)1.99;
		
		//non primitive typecasting
		//widening --> creating an object of the class and giving reference to the parent class
		
		Animal obj=new Cat();
		//narrowing
		//Cat obj2=new Animal();--> compiler will give error: Cannot convert from animal to Cat
		obj.eat();
		obj.sleep();
	}

}
