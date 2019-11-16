package com.class11;

public class Homework89 {

	public static void main(String[] args) {
		//Write a program that sums all numbers that are on even index and on even row and prints it out.

		//For example, in the following array, the numbers with parentheses would be summed:
		

		int[][] a = {
				{-5,-2,-3,7},
				{1,-5,-2,2},
				{1,-2,3,-4}
			};
		
//		
		//this code wont work
		int sum=0;
		for(int i=0; i<a.length; i++){
			for(int j=0; j<a[i].length; j++){
				sum+=a[i][j];
				if(a[i][j]==a[1][1]|| a[i][j]==a[1][3]){
				     continue;  
				} 	
			}
		}
				 System.out.println(sum);
				 
		//this is the correct code:
		
		int sum1 = 0;

		for (int i = 0; i < a.length; i++) {

			for (int j = 0; j < a[i].length; j++) {
				if (i % 2 == 0 || j % 2 == 0) {
					sum1 = sum1 + a[i][j];
				}
			}

		}
		System.out.println(sum1);		 
				 
				 
				 
				 
	}
}
