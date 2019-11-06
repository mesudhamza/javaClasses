package com.class4;

public class NestedIfTask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*Write a program to store a boolean value of whether user has diploma or not. If user has a
		 * diploma, you should say congratulations, otherwise program should suggest to get a degree.
		 * Then if user has a degree program it should check a gpa score. If gpa score is higher or 
		 * equals to 3.5 --> output should say "You are eligible for scholarship", otherwise-->
		 * "You should have studied harder".
		 */
		
		
		boolean diploma=true;
		double gpa=3.4;
		
		if(diploma) {
			System.out.println("Congratulations!");
			if(gpa>=3.5) {
				System.out.println("You are eligible for scholarship");
			}else {
				System.out.println("You should have studied harder");
			}
		}else {
			System.out.println("Go get a degree loser!");
		}
		
		/*Create a java program and store values of mortgage rate and mortgage price. First, program should
		 * check if rate is higher than 4.5 user will not buy a house, otherwise user will consider buying.
		 * Once user decides to buy a house, if price of the house is larger than 200000 then user will take
		 * loan, otherwise user will pay cash.
		 */
		
		
		double mortgagerate=4.5;
		int mortgageprice=200000;
		
		if(mortgagerate>4.5) {
			System.out.println("I will not buy a house");
		}else {
			System.out.println("I will consider buying");
			if(mortgageprice>200000) {
				System.out.println("I will take a loan");
			}else {
				System.out.println("I will pay cash");
			}
		}
	
	}


}
