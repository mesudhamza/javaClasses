package com.class36;

import java.util.Collection;
import java.util.Map;
import java.util.TreeMap;
//Create a Person class with following private fields: name, lastName, age, salary. 
//Variables should be initialized through constructor.
//Inside the class also create a method to print user details.
//In Test Class create a Map that will store key in ascending order. 
//In that map store personId and a Person Object. Print each object details.
class Test {
String name, lastName;
	
	int age, salary;
	
	
	Test(String name, String lastName, int age, int salary){
		this.name=name;
		this.lastName=lastName;
		this.age=age;
		this.salary=salary;
	}
	
	
	public void display() {
		System.out.println(name+" "+lastName+" "+age+" "+salary);
	}
}

public class Person1{
public static void main(String[] args) {
		
		Map<Integer, Test> mapPerson=new TreeMap<>();
		mapPerson.put(1239, new Test("Mesud", "Hasgur", 31, 50000));
		mapPerson.put(1231, new Test("Jack", "Ryan", 32, 60000));
		mapPerson.put(1234, new Test("John", "Smith", 33, 70000));
		mapPerson.put(1232, new Test("Jim", "Harper", 34, 80000));
		mapPerson.put(1237, new Test("Henry", "Five", 36, 90000));
		
		System.out.println(mapPerson.size());
		
		System.out.println("------------");
		
		Collection <Test> coll=mapPerson.values();
		for (Test c:coll) {
			System.out.println(c.name+"--"+c.lastName+"--"+c.age+"--"+c.salary);
			c.display();
		}
//		System.out.println("----iterating through values----");
//		Iterator<Car> iter= coll.iterator();
//		while(iter.hasNext()) {
//			Car car=iter.next();
//			System.out.println(car.make+"--"+car.model);
//			
//		}
}
}
