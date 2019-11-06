package com.class11;

public class Homework88 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] a = {
				{-5,-2,-3,7},
				{1,-5,-2, 2},
				{1,-2, 3,-4}
			};
			
//		Write a program that will print the sum of all elements in column with index 1 in a 2-D int array. 		
	//   should print -9
		
		System.out.println(a[0][1]+a[1][1]+a[2][1]);
		
		//better way
		
		int column = 1;
		int sum = 0;

		for (int row = 0; row < a.length; row++) {
			sum += a[row][column];
		}

		System.out.println(sum);
		
		
	}

}
