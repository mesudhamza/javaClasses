package com.class11;

public class ForEach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//instead of: 
		
		int[] arr = {2, 3, 5, 7 };

		for(int g=0; g<arr.length; g++){
			System.out.println(arr[g]);
		}

		//we do:

		for(int elemen:arr){
			System.out.println(elemen);
		}
		
	}

}
