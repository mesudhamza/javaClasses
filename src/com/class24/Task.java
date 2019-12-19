package com.class24;

public class Task {

	String city, capital, country;
	int population;
	char capitalName;
	
//	static public Task() {//you cannot create static constructors
	//static belongs to the specific class not instance, for constructor it is related to that specific instance when
	//you are creating the object
	
	public Task() {
		System.out.println("I am public constructor");
		
	}
	
	protected Task(String myCity, int myPopulation) {
		System.out.println("I am a protected constructor");
	}
	
	Task(String capital, String country){
		System.out.println("This is my default constructor");
	}
	
	private Task(char capitalName) {
		System.out.println("This is my private constructor");
	}
	
	
	
	
	
	
	
	
	public static void main(String[] args) {

		Task object=new Task();
		Task object2=new Task("Izmir", 50000);
		Task object3=new Task("Ankara", "Turkey");
		Task object4=new Task('A');
		
		

	}

}
