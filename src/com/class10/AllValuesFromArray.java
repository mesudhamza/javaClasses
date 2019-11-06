package com.class10;

public class AllValuesFromArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//syso+ctrl+space
		
		char[] grades= {'A', 'B', 'C', 'D', 'E', 'F'};
		
		int a=2;
		System.out.println(grades[a]);
		
		//create an array to store 5 double values, print all in 1 line
		
		double[] values= {2.3, 45.56, 19.99, 0.5, 7.8};
		
		int size=values.length;
		
		for(int i=0; i<size; i++) {
			System.out.print(values[i]+" ");
		}

		System.out.println("-------------------------------------------------------------");
		System.out.println("-------------------------------------------------------------");
		
		String[] animals= {"Cat", "Cow", "Snake", "Dog", "Elephant"};
		//I want to print all values from an array
		//when value is Dog --> I love dogs
		
		for(int i=0; i<animals.length; i++) {
			
			if(animals[i].equals("Dog")) {
				System.out.println("I love dogs");
			}else {
				System.out.println(animals[i]);
			}
		}
		
		//Create an array of countries. While retrieving all values from an array print capital for each country.
		
		String[] countries= {"Turkey", "Russia", "China", "Iran", "Lebanon"};
		
		for(int i=0; i<countries.length; i++) {
			
			if(countries[i].equals("Turkey")) {
				System.out.println("Ankara");
			}else if(countries[i].equals("Russia")) {
				System.out.println("Moscow");
			}else if(countries[i].equals("China")) {
				System.out.println("Beijing");
			}else if(countries[i].equals("Iran")) {
				System.out.println("Tehran");
			}else
				System.out.println("Beirut");
			}
		}
		
		

}
