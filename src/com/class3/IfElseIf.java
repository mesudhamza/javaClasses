package com.class3;

public class IfElseIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1=100;
		int num2=100;
		//you can add different options like num1=110 and num2=100 and num1=100 and num2=1000
		if(num1>num2) {
			System.out.println("Num1 is larger than num2");
		}else if(num1==num2) {
			System.out.println("Num1 is equal num2");
			
		}else {
			System.out.println("Num1 is smaller than num2");
		}
		int day=6;
		if(day==1) {
			System.out.println("Today is Monday, I have to go to work");
		}else if (day==2) {
			System.out.println("Today is Tuesday, I have SDLC class");
		}else if(day==3) {
			System.out.println("Today is Wednesday, I have Java Review class");
		}else if(day==4) {
			System.out.println("Today is Thursday, I have SDLC Review class");	
		}else if(day==5) {
			System.out.println("Today is Friday, weekend is here");
		}else if(day==6) {
			System.out.println("Today is Saturday, My favorite coding day");
		}else if(day==7) {
			System.out.println("I love spending sundays at Syntax");
		}else {
			System.out.println("I do not know this day");
		}
		//you can put day==o than it will print else part the final statement
		//if you delete the final else statement and none of the conditions are true then it will print nothing
		//command+shift+f: will reformat your code if it is messy
		
		}
		
	}
	

