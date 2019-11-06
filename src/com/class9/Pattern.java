package com.class9;

public class Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		********************
//		********************
//		********************
//		********************
//		********************
//		********************
//		********************
//		********************
//		********************

		for(int i=0; i<9; i++) {
			for(int y=0; y<20; y++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		//print
		
//		12345
//		12345
//		12345
//		12345
		
		for(int i=1; i<5; i++) {
			for(int j=1; j<6; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		
//		11111
//		22222
//		33333
//		44444
//		55555
		
		System.out.println("----------------------------------");
		
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=5; j++) {
				System.out.print(i);
			}
			System.out.println();
		}
		
		System.out.println("----------------------------------");
		
//		123456789
//		123456789
//		123456789
//		123456789
//		123456789
		
		for(int i=1; i<=5; i++) {
			for(int y=1; y<=9; y++) {
				System.out.print(y);
			}
			System.out.println();
		}
		
		System.out.println("----------------------------------");
		
		//54321
		//54321
		//54321
		//54321
		//54321
		
		for(int y=1; y<=5; y++) {
			for(int i=5; i>=1; i--) {
				System.out.print(i);
			}
			System.out.println();
		}
		
		System.out.println("----------------------------------");
		
		//55555
		//44444
		//33333
		//22222
		//11111
		
		
		for (int i=5; i>=1; i--) {
			for(int y=1; y<=5; y++) {
				System.out.print(i);
			}
			System.out.println();
		}
		//alternative
		
		System.out.println("----------------------------------");
		
//		work on this!!!
//		for (int i=5; i>=1; i--) {
//			for(int y=1; y<6; y++) {
//				System.out.print(y);
//			}
//			System.out.println();
//		}	
		
		
	}

}
