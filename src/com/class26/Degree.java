package com.class26;

public class Degree {

	public void getDegree() {
		System.out.println("I got a degree");
	}

	public static void main(String[] args) {

		Degree objDegree = new Degree();
		objDegree.getDegree();
		Undergraduate undergrad = new Undergraduate();
		undergrad.getDegree();
		Postgraduate postgrad = new Postgraduate();
		postgrad.getDegree();

	}
}

class Undergraduate extends Degree {

	public void getDegree() {
		System.out.println("I am an Undergraduate");
	}

}

class Postgraduate extends Degree {

	public void getDegree(){
		System.out.println("I am a Postgraduate");
	}
}