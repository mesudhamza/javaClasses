package com.class9;

public class Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		55555
//		4444
//		333
//		22
//		1
		
		for(int j=5; j>=1; j--) {
			for(int i=1; i<=j; i++) {
				System.out.print(j);
			}
			System.out.println();
		}
		
//		*
//		**
//		***
//		****
//		*****
//		****
//		***
//		**
//		*
		
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=4; i>=1; i--) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
