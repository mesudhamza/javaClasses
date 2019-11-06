package com.class14;

public class SplitMethod2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//how to separate comma delimited string.
		
		String str="If you come to class early, "
				+ "then you can study more, also you can learn more, "
				+ "and you can leave early";
		
		String[] array=str.split(",");
		for (int i=0; i<array.length; i++) {
			System.out.println(array[i]);//you can do .trim() here if you want to
		}
		System.out.println("******************");
		
		String str1="Welcome To Syntax Technologies";
		String[] array2=str1.split(" ", 3);//it starts splitting whenever it sees space and then splits into three, keep splitting when it sees space
		System.out.println(array2.length);
		
		for(int i=0; i<array2.length; i++) {
			System.out.println(array2[i]);
		}
		
		
		
		
				
		
		
	}

}
