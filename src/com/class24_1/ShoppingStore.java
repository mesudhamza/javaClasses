package com.class24_1;

public class ShoppingStore {
//	Create class level variable as below.
//	item,
//	price, 
//	quantity
//
//	create one constructor with parameters of item, price and quantity. 
//	in constructor assign the parameter value to class level value. (use this keyword). 
//
//	Create a method with name itemTotalPrice. 
//	write a logic to to calculate the total values of items in stock. and print the result. 
//	return the total value. 
//
//	In Main Class. 
//
//	Create two Object of ShoppingStore and pass the parameters to Constructor. 
//	then using each object call the method itemTotalPrice. 
//	Store the returned value of each object. 
//	Calculate sum of both object and print the result. 
//
//
//
//	Output:
//	Blancket Total Value 99.98
//	Mattress Total Value 439.18
//	You purchased 539.16 Today
//
//
//	Assignment Goals: Clean Code, proper naming convention, Choosing Variable Datatype,  
//	This Keyword, Method Creation, Mathematic Operations, method return types. 
	
	String item;
	double price;
	int quantity;
	
	ShoppingStore(String item, double price, int quantity){
		this.item=item;
		this.price=price;
		this.quantity=quantity;
	}
	
	public double itemTotalPrice() {
		double totalStockValue;
		totalStockValue=this.price*this.quantity;
		System.out.println(item+" Total Value "+totalStockValue);
		return totalStockValue;
	}
	
	
	
	
	
}
