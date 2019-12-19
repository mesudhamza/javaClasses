package com.reviewclass11java;

public class Turkish extends Human {

	String weapon;
	
	public Turkish(String name, int age, int weight, String weapon) {
		super(name, age, weight);
		this.weapon = weapon;
	}
	
	public void eatLahmacun() {
		System.out.println("I like eating lakhmacun");
	}
	
}
