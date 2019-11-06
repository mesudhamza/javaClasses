package com.homeworks;

import java.util.Scanner;

public class Homework33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*For you to do: Write a program that shows if you input a number it will display a month with corresponding number, 
		 * and if you input a number out of bounds (12) it will display invalid. Display the months to be displayed on my output.
		 *IMPORTANT: use Scanner Class
		 *Example:
		 *1 will display January
		 *2 will display February
		 *3 will display March
		 *4 will display April
		 *5 will display May
		 *6 will display June
		 *7 will display July
		 *8 will display August
		 *9 will display September
		 *10 will display October
		 *11 will display November
		 *12 will display December
		 *ANY INPUT outside of 12 should display in output "Invalid"*/
		
		Scanner inp = new Scanner(System.in);
		System.out.println("Please enter a number");
		int number = inp.nextInt();
		String month;
		
		if(number==1) {
			month="January";
		}else if(number==2) {
			month="February";
		}else if(number==3) {
			month="March";
		}else if(number==4) {
			month="April";
		}else if(number==5) {
			month="May";
		}else if(number==6) {
			month="June";
		}else if(number==7) {
			month="July";
		}else if(number==8) {
			month="August";
		}else if(number==9) {
			month="September";
		}else if(number==10) {
			month="October";
		}else if(number==11) {
			month="November";
		}else if(number==12) {
			month="December";
		}else {
			month="Invalid";
		}
		System.out.print(month);
		
			
			
			
			
			
			
			
			
			
			
			
			
			
		}
		
		
		
	}

