package com.homeworks;

import java.util.Scanner;

public class Homework37 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		    For you to do:
//			Take 2 boolean inputs from a user:
//			 
//			"Are you thirsty?"
//			"Are you sleepy?"
//
//			If user is thirsty and not sleepy--> drink=Water
//			If user is thirsty and sleepy--> drink=Coffee
//			If user is not thirsty and sleepy --> drink=Tea
//			Otherwise drink="Nothing"
//
//			Output:
//			"Looks like you need ___ "
	
		Scanner input=new Scanner(System.in);
		System.out.println("Are you thirsty?");
		boolean thirsty=input.nextBoolean();
		System.out.println("Are you sleepy?");
		boolean sleepy=input.nextBoolean();
		if(thirsty && !sleepy) {
			System.out.println("Looks like you need Water");
		}else if(thirsty && sleepy) {
			System.out.println("Looks like you need Coffee");
		}else if(!thirsty && sleepy) {
			System.out.println("Looks like you need Tea");
		}else {
			System.out.println("Looks like you need Nothing");
		}
		
	}

}
