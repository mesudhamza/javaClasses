package com.homeworks;

import java.util.Scanner;

public class Homework39 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		For you to do: 
//
//		By using the switch statement concept please validate what is the responsibility each instructor in the syntax solution.
//
//		First Output: "Enter name of the instructor"
//
//		case 1: if User provided the name as Shiva as input it should show  "Will take care of Java Assignment"
//		case 2: if User provided the name as Sandish as input it should show  "Will take care of SDLC Assignment"
//		case 3: if User provided the name as Weqas as input it should show  "Will take care of Selenium Assignment"
//		case 4: if User provided the name as Asel as input it should show  "Will take care of every Assignment"
//
//		Other than these four names if user provide the name try to give like (James or John ) " Invalid instructor selected"
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter name of the instructor");
		String name = input.nextLine();
		String solution;

		switch (name) {

		case ("Shiva"):
			solution = "Will take care of SDLC Assignment";
			break;
		case ("Sandish"):
			solution = "Will take care of SDLC Assignment";
			break;
		case ("Weqas"):
			solution = "Will take care of Selenium Assignment";
			break;
		case ("Asel"):
			solution = "Will take care of every Assignment";
			break;
		default:
			solution = "Invalid instructor selected";
		}
		System.out.println(solution);

	}

}
