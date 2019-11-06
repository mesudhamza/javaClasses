package com.class10;

public class AnotherWay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Create an array of countries. While retrieving all values from an array print capital for each country.
		
	String[] countries= {"Turkey", "Russia", "China", "Iran", "Lebanon"};
		
		int size = countries.length;
	
		for(int i=0; i<size; i++) {
			
			switch (countries[i]) {
			case "Turkey":
				System.out.println("Ankara");
				break;
			case "Russia":	
				System.out.println("Moscow");
				break;
			case "China":
				System.out.println("Beijing");
				break;
			case "Iran":
				System.out.println("Tehran");
				break;
			default:
				System.out.println("Beirut");
				break;
			}	
					
		}
		
	}

}
