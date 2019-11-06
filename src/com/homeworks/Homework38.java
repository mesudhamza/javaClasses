package com.homeworks;

import java.util.Scanner;

public class Homework38 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//			For you to do:
//			Prompt user with a question: "Is it weekend?"
//			If it is not a weekend --> subject="Manual testing"
//			Otherwise --> subject="Java"
//
//			Output: 
//			"Today you will be learning ____"
		
		Scanner input=new Scanner(System.in);
		System.out.println("Is it weekend?");
		boolean weekEnd=input.nextBoolean();
		String subject;
		if(!weekEnd) {
			subject="Manual Testing";
		}else {
			subject="Java";
		}
		System.out.println("Today you will be learning " + subject);
		
	}

}
