package com.class18;

public class Task1 {
	
	
	public static void main(String[] args) {
		
		Task1 object=new Task1();
		object.numberComparison(55, 25);
		object.evenOrOdd(99);//you can add another object to check another number to see if even or odd same thing but just change the number
		object.isPalindrome("kayak");//argument + when we call the method we are passing the value
		object.isPalindrome("madam");
		
	}
	//method name (parameter1, parameter2)
	void numberComparison(int num1, int num2) {
		if(num1>num2) {
			System.out.println(num1+ " is larger than "+num2);
		}else {
			System.out.println(num2+ " is larger than "+num1);
		}
		
	}
	
	void evenOrOdd(int num3) {
		if(num3%2==0) {
			System.out.println(num3+ " is even");
		}else {
			System.out.println(num3+ " is odd");
		}
	}
	
	void isPalindrome(String original) {
		String reversed = "";
		for (int i = original.length() - 1; i >= 0; i--) {
			reversed = reversed + original.charAt(i);// ""+k=k+a=ka+k
		}

		System.out.println(reversed);

		if (original.equals(reversed)) {
			System.out.println("String is palindrome");
		} else {
			System.out.println("String is NOT palindrome");
		}
		
		
	}
	
	
}
