package com.class10;

public class Homework81 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Write a program that creates an array of integers that stores the following values{45, 78, 12,  67, 55, 89, 23, 77, 88}. 
//		Print the values using a for loop starting at index 1 and increment by 3, and then print value divided by its index.
//
//		Output:
//		78 13 11 
	
		int[] nums= {45,78,12,67,55,89,23,77,88};
		
		for(int i=1; i<nums.length; i+=3) {
			System.out.println(nums[i]/i);
		}
		
		
	}

}
