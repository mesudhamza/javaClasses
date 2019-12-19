package com.class31;

public class Child extends Parent{

	Child(){
		System.out.println("Child Constructor without argument");
	}
	
	Child(int number){
		super(number);
	}
	
}
