package com.class11;

public class Homework83 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] a = {
				{5,2,3,7},
				{1,5,2,2},
				{1,2,3,4}
			};
			
	     //should print 10
	     
		//first way
		//System.out.println(a[2][0]+a[2][1]+a[2][2]+a[2][3]);
		
		
		//second way
		int sum1=0;
		for(int i=2; i<a.length; i++){
			  for(int j=0; j<a[i].length; j++){
			  sum1=sum1+a[i][j];
			  }
			}
		System.out.print(sum1);
		
		
		

//		
		
	}

}
