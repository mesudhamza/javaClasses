package com.class36;
//create a car class that will have variables, methods and constructor
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;


//create a map that will hold car number and car objects store in it

class Car{
	
	String make, model;
	
	public Car(String make, String model) {
		this.make=make;
		this.model=model;
	}
	
	public void display() {
		System.out.println(make+" "+model);
	}
		
}

public class CarTest {
	
	public static void main(String[] args) {
		Map<Integer, Car> mapCar=new LinkedHashMap<>();
		mapCar.put(1, new Car("BMW", "X5"));
		mapCar.put(2, new Car("Tesla", "S"));
		mapCar.put(3, new Car("Mercedes", "S5"));
		mapCar.put(4, new Car("Toyota", "Rav4"));
		mapCar.put(5, new Car("Honda", "Civic"));
		mapCar.put(2, new Car("Lincoln", "Mkc"));
		
		System.out.println(mapCar.size());
		//display only value objects
		Collection <Car> coll=mapCar.values();
		for (Car c:coll) {
			System.out.println(c.make+"--"+c.model);
			c.display();
		}
		System.out.println("----iterating through values----");
		Iterator<Car> iter= coll.iterator();
		while(iter.hasNext()) {
			Car car=iter.next();
			System.out.println(car.make+"--"+car.model);
			
		}

		//map key to its corresponding values (entrySet or keySet)
		
		Set<Entry<Integer, Car>> set=mapCar.entrySet();
		for(Entry<Integer,Car> ent:set) {
			Integer i=ent.getKey();
			Car c=ent.getValue();
			System.out.println("Key "+i +" is associated with value of "+c.make);
		}
		
		System.out.println("----iterating through entrySet----");
		
		Iterator<Entry<Integer, Car>> ite=set.iterator();
		while(ite.hasNext()) {
			Entry<Integer, Car> ent=ite.next();
			System.out.println(ent.getKey()+"--"+ent.getValue().make+"--"+ent.getValue().model);
		}
		
		
		//using keyset to map keys to values
		Set<Integer> keySet=mapCar.keySet();
		for (int key:keySet) {
			//              Integer+map Object --> value object (car type)
			//System.out.println(key+"="+mapCar.get(key).make+"-"+mapCar.get(key).model);
			Car car=mapCar.get(key);
			String carDetails=car.make+"-"+car.model;
			System.out.println(key+"="+carDetails);
		}
		System.out.println("----iterating through keySet----");
		Iterator<Integer> it=keySet.iterator();
		while(it.hasNext()) {
			Integer a=it.next();
			System.out.println(a+"--"+mapCar.get(a).make+"--"+mapCar.get(a).model);
		}

		//use iterator to iterate through your values, through your keySet, and entrySet
		
		
		
		
		
	}

}
