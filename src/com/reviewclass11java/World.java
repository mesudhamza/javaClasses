package com.reviewclass11java;

public class World {
	public static void main(String[] args) {
		Human person1 = new Human("Andrei");
		Human person2 = new Human("Salim", 25, 150);
		
		System.out.println("---America---");
		Human person3 = new American("John", 42, 250, "111-22-333");
		
		System.out.println("---Albania---");
		Human person4 = new Albanian("Elion", 38, 190, "Elion123");
		
		System.out.println();
		System.out.println("The world ended!!!");
		
		Human person5 = new Turkish("Mahmut", 45, 250, "S400");
		System.out.println();
		System.out.println("The world ended!!!");
	}
}
