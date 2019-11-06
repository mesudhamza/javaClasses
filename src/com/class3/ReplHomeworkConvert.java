package com.class3;

public class ReplHomeworkConvert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(11%7);
		
		String school="Virginia Tech";
		school="Harvard";
		
		System.out.println(school);
		
		int num=1000;
		num=num+1000;
		
		System.out.println(num);
		
		int num3=1000;
		
		num3=num3+=1000;
		
		System.out.println(num3);
		
		num3-=500;
		
		System.out.println(num3);
		
		num3*=100;
		
		System.out.println(num3);
		
		num3/=10000;
		
		System.out.println(num3);
		
		
		byte b=127;
		int i=b;
		System.out.println(i);
		
		int num5=123;
		double d1=num5;
		System.out.println(d1);
		
		int num6=12345678;
		float x1=num6;
		System.out.println(x1);
		
		
		double d8=458.96;
		int i6=(int)d8;      /*normally if you dont put int in brackets the ide(compiler will not let you
		                     and give error(cannot convert from double to int) because there is a 
		                     loss of value after you add (int) its ok*/
		
		System.out.println(i6);
		
		int i8=756;
		byte b1=(byte)i8;         /*same thing the compiler will complain if you dont put byte in brackets. Cannot
		                    convert from int to byte)*/
		
		System.out.println(b1);
		
		int num2=789;
		byte b5=(byte)num2;
		System.out.println(b5);
		
		//Write a program to convert double 100.50 into int.
		
		double d=500.4444;
		  
		long l=(long)d;
		
		System.out.println(l);
		
		/*Declare 2 int variables and assign their values as 5 and 2. 
		Perform the division of these variables. 
		Print the decimal value of the division result. 

		Output:
		Result: 2.5

		Hint: This is example of widening typecasting. 
		But if compiler takes care of your widening automatically, 
		Repl doesn't do that. So you have to take care of it manually ;)*/
		
		int a=5;
		int c=2;
		
		
		double g=a;
		double o=c;
		
		double div=g/o;

		System.out.println(div);
		
		int x=5;
		int y=2;
		
		int result=(int)x/y;
		
		System.out.println("Result: "+result);
		
		
		
		
		
		
	}
}
