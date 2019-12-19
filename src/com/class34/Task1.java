package com.class34;

import java.util.HashSet;
import java.util.Set;

//3.Create a Set collection that will hold Objects of  Student  Type.  
//In  this  set  we  do  not  care about the insertion order. 
//Each student object should  have  name  and  studentID.  
//Display name of each student.


class Student{
	
	
	String name;
	int studentID;
	
	Student(String name, int studentID){
		this.name=name;
		this.studentID=studentID;
	}
	
	public void display() {
		System.out.println(name);
	}
	
}

public class Task1 {

	public static void main(String[] args) {
		
		Set<Student> stud= new HashSet<>();
		stud.add(new Student("Mesud", 123));
		stud.add(new Student("Hasan", 456));
		stud.add(new Student("Yasin", 789));
		stud.add(new Student("Furkan", 999));
		
		for(Student el:stud) {
//			System.out.println(el.name);
			el.display();
		}

	}

}
