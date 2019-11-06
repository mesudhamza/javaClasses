package com.class2;

public class ArithmeticClass {

	public static void main(String[] args) {
		
		double num1=35.66;
		double num2=22.35;
		
		double sum=num1+num2;
		double sub=num1-num2;
		double mult=num1*num2;
		double div=num1/num2;
		
		System.out.println(sum);
		System.out.println(sub);
		System.out.println(mult);
		System.out.println(div);
		
		System.out.println("the addition of 2 numbers "+ num1+" and " + num2+ " is equal to " +sum);
	    System.out.println("the subtraction of 2 numbers "+ num1+" and "+num2+ " is equal to " + sub);
	    System.out.println("the multiplication of 2 numbers "+ num1+" and "+num2+ " is equal to " + mult);
	    System.out.println("the division of of 2 numbers "+ num1+" and "+num2+ " is equal to " + div);
		
		//the operation below is wrong change it later
	    
		int num3=3;
		int squarenum3=9;
		
		//task question 3
		
		int width=5;
		int height=8;
		
		int area=width*height;
		
		int perimeter=2*(width+height);
		
		//The perimeter of a rectangle with width ____
		//and height ____ is equal to ____ and the area is ___"
		
		System.out.println("The perimeter of rectangle with width "+width+ " and height "+height+ " is equal to "
				+perimeter+" and the area is "+area);
		
		String message="The perimeter of rectangle with width "+width+ " and height "+height+ " is equal to "
				+perimeter+" and the area is "+area;
		
		System.out.println(message);
		
		
		
		
	}
}
