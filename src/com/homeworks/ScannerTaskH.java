package com.homeworks;

import java.util.Scanner;

public class ScannerTaskH {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*Write a program to ask user to enter numbers of worked years and annual salary. 
		 * If userworked for more or equals to 5 years than useris eligible for the bonus, otherwise he is not.
		 * Once user is eligible and salary is larger than 50000 than bonus = 5000, otherwisebonus=3000.
		 */
		
		
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter the number of worked years");
		int workedyears = xyz.nextInt();

		if (workedyears >= 5) {
			System.out.println("You are eligible for the bonus");
			System.out.println("Enter your annual salary");
			int salary = xyz.nextInt();
			if (salary > 50000) {
				System.out.println("Your bonus is 5000");
			} else {
				System.out.println("Your bonus is 3000");
			}

		} else {
			System.out.println("You are not eligible for the bonus");
		}
	}

}
