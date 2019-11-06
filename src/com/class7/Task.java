package com.class7;

public class Task {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*Create a boolean variable workDay and assign true
 * create int variable day and assign it to 1
 * As long as it is workDay print "I need a day off" and increase day ++
 * Once day is 6 print "I do not need a day off anymore"
 */
		
		
		boolean workDay=true;
		int day=1;
		
		while(workDay) {
			System.out.println("I need a day off");
			if(day==6) {
				System.out.println("I do not need a day off anymore");
				workDay=false;//break (you can use break here as well)
			}
			day++;
		}
		
////		//another way of doing this:
//		boolean workDay=true;
//		int day=1;
//		
//		while (workDay) {
//
//			if (day == 7) {
//				workDay = false;
//				System.out.println("I do not need a day off anymore");
//				
//			} else {
//				System.out.println("I need a day off");
//			}
//			day++;
//		}
	
		
		
		
	}

}
