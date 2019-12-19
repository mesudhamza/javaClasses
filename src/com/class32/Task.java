package com.class32;

import java.util.ArrayList;

public class Task {

	public static void main(String[] args) {
		
		ArrayList<String> nameArrList = new ArrayList<>();
		nameArrList.add("Mesud");
		nameArrList.add("John");
		nameArrList.add("Jimmy");
		nameArrList.add("Henry");
		nameArrList.add("Bobby");
		
		Boolean boo=nameArrList.isEmpty();
		System.out.println(boo);
		
		Boolean cont=nameArrList.contains("Mesud");
		System.out.println(cont);
		
		
		int size=nameArrList.size();
		System.out.println(size);
		System.out.println(nameArrList);
		
		for(int i=0; i<nameArrList.size(); i++) {
			System.out.println(nameArrList.get(i));
		}
		System.out.println("--------------------------");
		System.out.println();
		for(String var: nameArrList) {
			System.out.println(var);
		}

		
		
	}

}
