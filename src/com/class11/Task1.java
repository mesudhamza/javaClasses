package com.class11;

public class Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Create an array of cars and store 6 elements into it. 
//		Using 2 different loops print all values from the array.
//		Create an array on integers and calculate the sum of all elements in an array.
//		Create an array of countries. 
//		While retrieving all values from an array print capital for each country. (use 2 different loops).
		
		//1
		String[] cars= {"Toyota", "Honda", "Chrysler", "Jeep", "Tesla", "Nissan"};
		
		for(int i=0; i<cars.length; i++) {
			System.out.println(cars[i]);
		}
		//2
		
		//first way
		
//		int[] nums= {1,2,3,4,5};
//		
//		System.out.println(nums[0]+nums[1]+nums[2]+nums[3]+nums[4]);
		
		//second way
		
		int[] nums= {1,2,3,4,5};
		int sum=0;
		
		for(int i=0; i<nums.length; i++) {
			sum=sum+nums[i];
		}
		System.out.println(sum);
	}

}
