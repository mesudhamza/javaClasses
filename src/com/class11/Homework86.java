package com.class11;

public class Homework86 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Write a program that  takes a 2-D array and prints the sums of the rows as an integer array.
//		For example, the if we run rowSums for the following 2D array:
		
		int[][] a = {
				{1,1,2}, //sum = 4
				{3,1,2}, //sum = 6
				{3,5,3}, //sum = 11
				{0,1,2}  //sum = 3
			};
		
		int sum0 = 0;
        int row = 0;
        for (int k = 0; k < a[row].length; k++) {
            sum0 += a[row][k];
        }    
		System.out.println(sum0);
		
		int sum1 = 0;
        int row1 = 1;
        for (int k = 0; k < a[row1].length; k++) {
            sum1 += a[row1][k];
        }    
		System.out.println(sum1);
		
		int sum2 = 0;
        int row2 = 2;
        for (int k = 0; k < a[row2].length; k++) {
            sum2 += a[row2][k];
        }    
		System.out.println(sum2);
		
		int sum3 = 0;
        int row3 = 3;
        for (int k = 0; k < a[row3].length; k++) {
            sum3 += a[row3][k];
        }    
		System.out.println(sum3);
		
		int[] array= {sum0,sum1,sum2,sum3};
		
		
		for(int i=0; i<array.length; i++) {
			System.out.println(array[i]);
		}
		
		//another short way 
		
//		int sums[] = new int[nums.length];
//		
//		for (int i = 0; i < nums.length; i++) {
//			int rowSum = 0;
//			for (int j = 0; j < nums[i].length; j++) {
//				rowSum += nums[i][j];
//			}
//			sums[i] = rowSum;
//		}
//
//	for(int sum : sums) {
//			System.out.println(sum);
//  }
		
		
		
		
	}

}
