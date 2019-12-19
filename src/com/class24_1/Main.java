package com.class24_1;

public class Main {

	public static void main(String[] args) {
		ShoppingStore blancket = new ShoppingStore("Blancket" , 49.99, 2);
	    ShoppingStore mattress = new ShoppingStore("Mattress" , 219.59, 2);
	      
	    double totPrice=blancket.itemTotalPrice();
	    double totPrice1=mattress.itemTotalPrice();
	    double a=totPrice+totPrice1;
	    System.out.println("You purchased "+a+" Today");

	}

}
