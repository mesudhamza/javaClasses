package com.class25;

public class Main {

	public static void main(String[] args) {
		
//		B obj=new B();
//		System.out.println(obj.i);

		
		
		MathTeacher obj1=new MathTeacher();
		System.out.println(obj1.a);
		System.out.println(MathTeacher.hello);
		
		ChemistryTeacher obj2=new ChemistryTeacher();
		System.out.println(obj2.a);
		System.out.println(obj2.b);
		obj2.myMethod();
		PianoTeacher obj3=new PianoTeacher(3,5);
		
		Teacher obj4=new Teacher();
		obj4.myMethod();
		
		
		
	}

}
