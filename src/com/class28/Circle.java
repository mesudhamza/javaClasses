package com.class28;

public class Circle extends Shape{

	double area;
	
	
	Circle(double radius){
		super(radius);
	}
	
	public void areaOfCircle() {
		this.area=3.14*radius*radius;
		System.out.println("the area of circle is: "+ area);
	}
	
	public static void main(String[] args) {
		Circle obj=new Circle(2);
		obj.areaOfCircle();
	}
	
	
	
}
