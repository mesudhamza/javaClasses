package com.class10;

import java.lang.reflect.Array;

public class Homework79 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Write a program that creates an array of integers of size 11. 
//		Add the years 2010 to 2020 to your array one by one using a for loop and then print all those values. 
//
//		Example: 
//		2010
//		2011
//		2012
//		2013
//		2014
//		2015
//		2016
//		2017
//		2018
//		2019
//		2020
		
////		int[] arrays= new int[11];
//		int[] arrays= {2010,2011,2012,2013,2014,2015,2016,2017,2018,2019,2020};
//		
//		for(int i=0; i<=arrays.length-1; i++) {
//			System.out.println(arrays[i]);
//		}
		
		//easier way
		
		int[] arrays= new int[11];
		
		for(int i=0; i<=arrays.length-1; i++) {
			arrays[i]=2010+i;
		}
		
		for(int i=0; i<arrays.length; i++) {
			System.out.println(arrays[i]);
		}
		
	}

}
