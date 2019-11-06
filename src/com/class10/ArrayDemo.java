package com.class10;

public class ArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nums=new int[4];
		nums[0]=12;
		nums[1]=13;
		nums[2]=14;
		nums[3]=15;
		
		System.out.println(nums.length);//shows the number of indexes
		System.out.println(nums[0]);
		
		String[] array= {"Winter", "Fall", "Summer", "Spring"};
		//I was born in Summer
		
		System.out.println("I was born in "+ array[2]);
		System.out.println(array.length);
		//another way to print number of indexes
		int arraySize=array.length;
		System.out.println(arraySize);
		
		int[] score= {80,90,100,200,1000};
		
		
		
		
	}

}
