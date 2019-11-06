package com.class8;

public class ForExercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//1.Print numbers from 1 to 100 in line with space
		//2.Print numbers from 100 to 1
		//Print even numbers from 20 to 1(2 ways)
		//Print odd numbers between 20 and 50(2 ways)
		
		for(int i=1; i<=100; i++) {
			System.out.print(" ");
			System.out.print(i);
		}
		System.out.println("**********************");
		
		for(int i=101; i>=1; i--) {
			System.out.println(i);
		}
		System.out.println("**********************");
		
		for(int i=20; i>0; i-=2) {
			System.out.println(i);
		}
		System.out.println("**********************");
		
		for(int i=21; i<50; i+=2) {
			System.out.println(i);
		}
		//2nd way
		System.out.println("**********************");
		
		//what is the output?
		int sum=0;
		for(int i=1; i<=5; i++) {
			sum=sum+i;
			System.out.println(sum+ "+");
		}
		System.out.println();
		System.out.println(sum);//
		
		System.out.println("**********************");
		
		//what is the output?
		int sumAll=0;
		for(int i=0; i<=20; i+=5) {
			sumAll=sumAll+i;
		}	
		System.out.println(sumAll);
		
		System.out.println("**********************");
		
		
		//what is the output?
		
		int total=2;
		
		for(int y=1; y<=3; y++) {
			total=total*y;//2=2*1; 4=2*2; 12=4*3
		}
		System.out.println(total); //whatever the last value of total will be printed in the statement outside of the loop
		
		
		
		
	}

}
