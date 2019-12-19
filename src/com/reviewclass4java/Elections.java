package com.reviewclass4java;

public class Elections {
	
//	Here is the description for Elections example.
//	Create three classes: Elections, Republican, Democratic
//	Republican has some variables: voterName, nominee, totalVotes, totalContributions
//	Democratic has some variables: voterName, nominee, totalVotes, totalContributions
//	Both classes have a method called vote and a method called contribute which takes the amount as parameter.
//	In the Elections class you create voters from each party, you set the voter name, and then you make him vote. 
//	In the vote method, you print: voterName voted for nominee and also you increase the totalVotes. 
//	Some of the voters may want to contribute for their party. 
//	They call the method contribute and specify the amount of money they want to contribute. 
//	It will be added to the amount of totalContributions.
//	At the end you should print the number of votes for each party and check who has more votes is the winner.
//	Note: Nominee is the president candidate for each party.
	
	public static void main(String[] args) {
		Republican voter1=new Republican();
		voter1.voterName="John Doe";
		Republican.nominee="Donald Trump";
		voter1.vote(1);
		voter1.contribute(100);
		
		Republican voter2=new Republican();
		voter2.voterName="Jack Ryan";
		voter2.vote(1);
		voter2.contribute(500);
		
		Republican voter3=new Republican();
		voter3.voterName="Matthew Mcconaghey";
		voter3.vote(1);
		voter3.contribute(100000);
		
		
		
		
		Democratic v1=new Democratic();
		v1.voterName="Mesud Hasgur";
		Democratic.nominee="Bernie Sanders";
		v1.vote(1);
		v1.contribute(10);
		
		Democratic v2=new Democratic();
		v2.voterName="Jennifer Lopez";
		v2.vote(1);
		v2.contribute(200000);
		
		Democratic v3=new Democratic();
		v3.voterName="Robert De Niro";
		v3.vote(1);
		v3.contribute(100000);
		
		Democratic v4=new Democratic();
		v4.voterName="Johnny Depp";
		v4.vote(1);
		v4.contribute(300000);
		
		
		System.out.println("The total number of votes for the Republican party is: "+Republican.totalVotes);
		System.out.println("The total contributions for the Republican party is: "+Republican.totalContributions);
		System.out.println("The total number of votes for the Democratic party is: "+Democratic.totalVotes);
		System.out.println("The total contributions for the Democratic party is: "+Democratic.totalContributions);
		
		System.out.println("The winner is: "+ Democratic.nominee);
	}
	
	
	
	
	
}
