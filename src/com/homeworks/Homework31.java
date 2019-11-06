package com.homeworks;

import java.util.Scanner;

public class Homework31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		Scanner inp = new Scanner(System.in);
		System.out.println("Please enter the length");
		int length = inp.nextInt();
		System.out.println("Please enter the width");
		int width = inp.nextInt();
		if (length > width) {
			System.out.println("The shape of your object is rectangle");
		} else if (length == width) {
			System.out.println("The shape of your object is square");
		}
		
	}

}
