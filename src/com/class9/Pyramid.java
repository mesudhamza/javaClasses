package com.class9;

public class Pyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		*
//		**
//		***
//		****
//		*****
		
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			} 
			System.out.println();
			
		}
		System.out.println("----------------------------------");
//		1
//		12
//		123
//		1234
//		12345
//		123456
//		1234567
//		12345678
//		123456789

		
		for(int i=1; i<=9; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		
		System.out.println("----------------------------------");
		
//		1
//		22
//		333
//		4444
//		55555
//		666666
//		7777777
//		88888888
//		999999999

		
		for(int i=1; i<=9; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print(i);
			}
			System.out.println();
		}
		
		
	}

}
