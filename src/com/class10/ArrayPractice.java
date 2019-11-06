package com.class10;

public class ArrayPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//
//		1) Create an array of chars and store grades into it: A,B,C,D,E,F. 
//		Then print a grade B (use 2 different ways of creating an array).
//
//		2)Create an array of names and store all names of your group. 
//		Then print your name from that array. (use 2 different ways of creating an array).
//
//		3)Create an array of words: Java, Saturday, day, coding, is. 
//		Print the following sentence using element of array: “Saturday is Java coding Day”. 
//		
		//1
		char[] grade=new char[6];
		grade[0]='A';
		grade[1]='B';
		grade[2]='C';
		grade[3]='D';
		grade[4]='E';
		grade[5]='F';
		
		System.out.println(grade[1]);
		//second way
		
		char[] grades= {'A','B','C','D','E','F'};
		System.out.println(grade[1]);
		
		System.out.println("-------------------------------------------------------------");
		//2
		
		String[] name=new String[8];
		name[0]="Mesud";
		name[1]="Kamal";
		name[2]="Helen";
		name[3]="Romal";
		name[4]="Paiman";
		name[5]="Hichem";
		name[6]="Katy";
		
		System.out.println(name[7]);
		
		String[] names= {"Mesud","Kamal","Helen","Romal","Paiman","Hichem","Katy"};
		
		System.out.println(name[0]);
		
		
		System.out.println("-------------------------------------------------------------");
		
		//3)Create an array of words: Java, Saturday, day, coding, is. 
//		Print the following sentence using element of array: “Saturday is Java coding Day”.
		
		String[] words= {"Java","Saturday","day","coding","is"};
		System.out.println(words[1]+" "+words[4]+" "+words[0]+" "+words[3]+" "+words[2]);
		
		
		
		
		
	}

}
