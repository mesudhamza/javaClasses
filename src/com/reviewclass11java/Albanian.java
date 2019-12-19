package com.reviewclass11java;

public class Albanian extends Human {

	String albanianId;
	
	public Albanian(String name, int age, int weight, String albanianId) {
		super(name, age, weight);
		this.albanianId = albanianId;
	}
	
	public void albanianLiver() {
		System.out.println("I like eating liver");
	}
	
	
}
