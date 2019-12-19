package com.class29;

public class TaskTest {

	public static void main(String[] args) {
		Task obj=new JavaFile();
		obj.open();
		obj.edit();
		obj.close();
		
		Task obj1=new WordFile();
		obj1.close();
		obj1.edit();
		obj1.open();
		
		Task obj2=new PDFFile();
		obj2.open();
		obj2.edit();
		obj2.close();

	}

}
