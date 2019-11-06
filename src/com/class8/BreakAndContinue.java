package com.class8;

public class BreakAndContinue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//break keyword breaks/exits the loop

		for (int i=0; i<10; i++) {
			if(i==7) {
				break;
			}
			System.out.println(i);
		}
		System.out.println("I am outside of the loop");
		
		//continue - it will skip CURRENT iteration
		
		for(int i=1; i<=5; i++) {
			if(i==3) { //you can do i==3 || i==4 too then it will skip 3 and 4 and continue with 5
				continue;
			}
			System.out.println(i);
		}
		System.out.println("******************");
		
		//I want to print nums from 1 to 20 except 5,6,7
		
		for (int a=1; a<=20; a++) {
			if(a==5 || a==6 || a==7) {
				continue;//if you use break here as soon as it sees 5 it will break and stop executing and stop at 4
			}
			System.out.println(a);
		}
		
		System.out.println("******************");
		
		//print numbers from 1 to 50 except those that are divisible by 3
		
		for(int c=1; c<=50; c++) {
			if(c%3==0) {
				continue;
			}
			System.out.println(c);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
