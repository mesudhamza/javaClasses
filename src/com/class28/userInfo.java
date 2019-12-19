package com.class28;

public class userInfo extends userClass{

	String userAddress;
	
	userInfo(String name, int mobileNumber, String userAddress){
		super(name, mobileNumber);
		this.userAddress=userAddress;
	}
	
	public void userDetails() {
		System.out.println(name+" "+mobileNumber+" "+userAddress);
		
	}
	
	public static void main(String[] args) {
		userInfo obj=new userInfo("Jack", 1234567890, "123 Main Street");
		obj.userDetails();
	}
	
	
}
