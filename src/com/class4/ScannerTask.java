package com.class4;

import java.util.Scanner;

public class ScannerTask {

	public static void main(String[] args) {
		
		Scanner loan= new Scanner(System.in);
		System.out.println("What is the amount of loan?");
		int num1=loan.nextInt();
		
		if(num1<200000) {
			System.out.println("I will lend the money");
		}else {
			System.out.println("I will reject the client");
		}
		
		
		}
	}
