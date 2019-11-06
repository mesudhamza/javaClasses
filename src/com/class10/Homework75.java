package com.class10;

public class Homework75 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Write a program that creates an array with the following values{s, a, y,  b, n, c, t,  d, a, e, x} 
//		and prints the values starting at index 0 and multiple of 2 using a for loop.
//
//		Output:
//		syntax
		
		char[] array= {'s', 'a', 'y', 'b', 'n', 'c', 't', 'd', 'a', 'e', 'x'};
		
		for(int i=0; i<array.length; i+=2) {
			System.out.print(array[i]);
		}
		
		//another way
		
//		char[] arr = {'s', 'a', 'y',  'b', 'n', 'c', 't',  'd', 'a', 'e', 'x'};
//
//		for (int i = 0; i <= arr.length-1; i+=2) {
//
//			System.out.print(arr[i]);
//		}
		
		
	}

}
