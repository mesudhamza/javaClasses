package com.reviewclass4java;

public class Democratic {
	String voterName;
	public static String nominee;
	public static int totalVotes; 
	public static int totalContributions;
	
	public void vote(int vote1) {
		System.out.println(voterName+ " voted for " + nominee);
		totalVotes += vote1;
	}
	
	public void contribute(int cont1) {
		totalContributions += cont1;
	}
	
	
}
