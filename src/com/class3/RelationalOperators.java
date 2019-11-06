package com.class3;

public class RelationalOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1=20;
		int num2=19;
		
		System.out.println(num1>num2);
		System.out.println(num1<num2);
		System.out.println("###################");
		
		double d=1.99;
		double d1=2.99;
		
		boolean b5=d>d1;
		System.out.println(b5);//false
		
		boolean b1=d<d1;
		boolean b2=d==d1;
		boolean b3=d!=d1;
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
		
		int a=20;
		int b=30;
		
		//if number a is bigger than number b
		//I want to print a is larger than b
		
		if (a>b) {
			System.out.println("a is larger than b");
		}else {
			System.out.println("a is smaller than b");
		}
	
		int expectedHours=15;
		int actualHours=20;
		//if expected hours are less than actual hours -> you will succeed
		//otherwise, please study more
		
		if(expectedHours<actualHours) {
			System.out.println("you will succeed");
		}else {
			System.out.println("please study more");
		}
		
			double teaPrice=4.99;
			double allowedPrice=5.99;
			//teaPrice-=2;//2,99=4.99-2
			
			//if the price is more than I can afford I will not buy it
			//if the price is less or mathces what I can afford then I will buy tea
			if(allowedPrice>=teaPrice) {
				System.out.println("I will buy tea");
				System.out.println("And I will enjoy my tea");
			}else {
				System.out.println("I cannot afford, I need to study more");
				System.out.println("I will go back to study more");
			}
			
			System.out.println("I keep writing some code");
			System.out.println("I keep writing more code");
			
			boolean isRain=false;
			//if it is raining I will take umbrella, otherwise I go for a walk
			
			if(isRain) {//isRain==true
				System.out.println("I will take umbrella");
			}else {
				System.out.println("I go for a walk");
			}
			
		}
		
	}
	
