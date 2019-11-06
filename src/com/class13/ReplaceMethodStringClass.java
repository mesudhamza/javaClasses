package com.class13;

public class ReplaceMethodStringClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*.replace
		 * this method returns a new string resulting 
		 * from replacing all occurrences of oldChar
		 * in this string with newChar.
		 */
		String str="Hello Dear Dan,how are you,how you been Dan?";
		System.out.println(str.replace('e', 'z'));
		System.out.println(str.replace("Dear", "Respected"));
		System.out.println(str.replaceFirst("Dan","Ali"));

		
		
	}

}
