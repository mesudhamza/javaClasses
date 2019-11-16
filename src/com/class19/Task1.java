package com.class19;

public class Task1 {

	//1)Create a method createEmail(). Based on provided users name, lastName and email type, 
		//your method should return complete email Address. Example: johnsnow@gmail.com or johnsnow@yahoo.com*
		//2)Write a method to return whether given number is prime or not?
		//3)Create  class Student that will have a method getGrade. 
		//Your method should accept the score of a student and return a grade:
				//score > 90 - A
				//score >80 - B
				//score >70 - C
				//score > 50 - D
				//anything else - F
		
	String createEmail(String usersName, String lastName, String emailType) {
		String emailAddress=usersName+lastName+"@"+emailType+".com";
		return emailAddress;
	}
	
//2)	void primeOrNot(int num) {
//		if(num)
//	}
	
	
	
	
	
			


}
