package com.class5;

public class LogicalNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean b1=!true;
		boolean b2=!false;
		
		System.out.println(b1);
		System.out.println(b2);
		
		boolean traffic=true;
		
		if(!traffic) {//using ! we are reverting condition
			System.out.println("Hello");
		}else {
			System.out.println("Bye");
		}
		
		boolean isRain=false;
		
		if(!isRain) {
			System.out.println("Take an umbrella");
		}else {
			System.out.println("Do not take umbrella");
		}
		
		//let's compare 2 numbers using NOT operator
		
		
		int num1=10;
		int num2=11;
		
		if (num1==num2) {
			System.out.println("Numbers are equal");
		}else {
			System.out.println("Numbers are not equal");
		}
		
		//now we will do the same operation above using NOT
		
		if(!(num1==num2)) {
			System.out.println("Numbers are not equal");
		}else {
			System.out.println("Numbers are equal");
		}
		
		
		//if name is not Mary or Anna then you are not my sister
		String name="Mary";
		String name2="July";
		//true OR false-->true add NOT --> false
		if(!(name.equals("Mary")|| name.equals("Anna"))) {
			System.out.println("You are not my sister");
		}else {
			System.out.println("You are my sister");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
