package com.class17;

public class Phone {
	//Create a Class “Phone”. Create 3 Objects of it: iPhone, Android, Nokia with specific  attributes and behaviours.
	String make, model1;
	boolean camera;
	int year, memory;

	void siriUse() {
		System.out.println("I can use siri on my "+make);
	}
	
	void autoUpdate() {
		System.out.println("My "+ make+ " have automatic updates");
	}
	
	public static void main(String[] args) {
	
	
	Phone iPhone=new Phone();
	Phone Android=new Phone();
	Phone Nokia=new Phone();
	iPhone.model1="8 plus";
	iPhone.make="iPhone";
	iPhone.year=2018;
	iPhone.memory=256;
	iPhone.camera=true;
	
	System.out.println("I have "+iPhone.make+ iPhone.model1+ " which was made in "+iPhone.year);
	
	//accessing behavior for 1 object
	iPhone.siriUse(); //calling method start from class phone
	iPhone.autoUpdate();
	
	Android.camera=true;
	Android.make="Samsung";
	Android.memory=128;
	Android.model1="Note 5";
	Android.year=2015;
	
	System.out.println("My "+Android.make+ Android.model1+ " sucks because it has a memory of " + Android.memory);
	
	Nokia.model1="Ericsson";
	Nokia.make="nokiasucks";
	Nokia.year=1999;
	Nokia.memory=12;
	Nokia.camera=false;
	
	System.out.println("My Nokia " + Nokia.model1+ " sucks because it's make is called "+ Nokia.make);
	System.out.println("Does my Nokia "+ Nokia.model1 + " have a camera? : "+ Nokia.camera);
	
	
	
	
	
	
	}			
}
