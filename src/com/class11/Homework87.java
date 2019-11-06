package com.class11;

public class Homework87 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		For you to do:
//			Write a program that prints the total number of elements that are negative AND odd
//
//			Output:
//			3
		
		int[][] a = {
				{-5,-2,-3,7},
				{1,-5,-2,2},
				{1,-2,3,-4}
			};
		

        for (int i = 0; i < a.length; i++) {
            for (int k = 0; k < a[i].length; k++) {
                if (a[i][k]<0 && a[i][k]%2!=0) {
                   
                }
            }
        }
		int [] x= {-5,-3,-5};
		System.out.println(x.length);
		
//		better way
//		int countNegative = 0;
//		for (int j = 0; j < numbers.length; j++) {
//			for (int i = 0; i < numbers[j].length; i++) {
//				if (numbers[j][i] < 0 && numbers[j][i] % 2!=0) {
//					countNegative = countNegative+i;
//				}
//			}
//		}
//     System.out.println(countNegative);
		
	}

}
