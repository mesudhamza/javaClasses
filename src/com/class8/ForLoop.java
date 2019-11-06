package com.class8;

public class ForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Say good morning 5 times
		//initialize test condition increment
		for(int i=0; i<=4; i++) {
			System.out.println("Good morning");
		}
		
		//print numbers from 1-10;
		
		for (int i=1; i<=10; i++) {//I wanna start from 1 and I wanna end with 10-so it will be from 1-10
			System.out.println(i);
		}
		
		//print numbers from 10-1
		for(int i=10; i>=1; i--) {
			System.out.println(i);
		}
		//since the variable i is inside the for loop we can use the same variable multiple times, because declaration happens inside the loop
		for(int i=0; i<=50; i+=5) {
			System.out.println(i);//5-10,15,20......50
		}
		
	}

}
