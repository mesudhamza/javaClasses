package com.class7;

public class WhileLoopPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//how to print numbers from 1 to 20
		
		int a=50;
		
		while(a>=20) {
			System.out.println(a);
			a--;
		}
		System.out.println("------------------------");
		//I want to print all even numbers from 1 to 20
		//1 way- increment value by 2
		
		int z=2;
		
		while(z<=20) {
			System.out.println(z);
			z+=2;
		}
		//second way using modulus
		
		int q=2;
		
		while(q<=20) {
			System.out.println(".");
			if(q%2==0) {
				System.out.println(q);
			}
			q++;
		}
		System.out.println("**************************");
		
		
		//print only odd number from 50 to 100
		// print only even numbers from 100 to 1
		
		int t=51;
		
		while(t<=100) {
			System.out.println(t);
			t+=2;
		}
		System.out.println("----------------------------------");
		
		int k=100;
		
		while(k>1 && k<=100) {
			System.out.println(k);
			k-=2;
		}
		
		
		

		
		
		
		
	}

}
