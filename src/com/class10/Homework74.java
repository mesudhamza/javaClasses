package com.class10;

public class Homework74 {
	public static void main(String[] args) {
		
//		Write a program that creates an array of integers that stores the following values: 45,78, 12,  67, 55, 89, 23, 77, 88
//		Print only values that stored with even index including 0.
//		Output:
//		45 12 55 23 88
		
		int [] numbers= {45,78,12,67,55,89,23,77,88};
		
		for(int i=0; i<numbers.length; i++) {
			if(i%2==0) {
				System.out.print(numbers[i]+ " ");
			}
		}
		
		System.out.println(" ");
		System.out.println("--------------------------------------------------");
		//Second way
		
		int [] nums= {45,78,12,67,55,89,23,77,88};
		
		for(int a=0; a<numbers.length; a++) {
			if(a%2!=0) {
				
			}else {
				System.out.print(numbers[a]+ " ");
			}
		}
		
//		3rd way
//		
//		int[] arr = {45,78, 12,  67, 55, 89, 23, 77, 88};
//
//		for (int i = 0; i < arr.length; i+=2) {
//
//			System.out.print(arr[i] + " ");
//		}
		
		
		
	}
}
