package com.class23;

public class ConstructorDemo {
	//if you don't create your own constructor java creates a default one for you(which has no argument but you will see it in your source code.
	//the compiler goes first here, as soon as you created your object and executes the block of code under constructor and
	//only then any line of code will get executed
	ConstructorDemo(){
		System.out.println("I am your constructor");
	}
	
	ConstructorDemo(String str){
		System.out.println("I am constructor with 1 parameter "+str);
	}
	ConstructorDemo(int num) {
		System.out.println("I am constructor with 1 int parameter " + num);
	}

	ConstructorDemo(int num, String str) {
		System.out.println("I am constructor with 2 int parameter " + num);
	}
	public static void main(String[] args) {
		
		ConstructorDemo obj=new ConstructorDemo();
		System.out.println("Code after creating an Object");
		obj.hello();
		
		ConstructorDemo obj2=new ConstructorDemo(123, "My Parameter");
		
	}
	
	public void hello() {
		System.out.println("Hello Class");
		System.out.println("Hello Instructors");
		
	}

}
