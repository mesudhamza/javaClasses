package com.class11;

public class Task3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int[][] numbers = {
                { 8, 7, 5, 3 },
                { 1, 5, 6, 7 },
                { 3, 6, 8, 1 }
                };
        
		//with regular for loop
        int sum=0;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                //System.out.print(numbers[i][j] + ” “);
                
                sum=sum+numbers[i][j];
            }
            System.out.println();
        }
        System.out.println("The sum of all elements in the array is= "+sum);
        
        
        //with enhanced for loop
        int sum1=0;
        for(int nums[]: numbers) {
            for(int getNum:nums) {
                sum1=sum1+getNum;
            }
        }
        System.out.println("The sum of all elements in the array is= "+sum1);
		
        System.out.println("---------------------------------------------");
        
        int[][] number = {
                { 8, 7, 5, 3 },
                { 1, 5, 6, 7 },
                { 3, 6, 8, 1 }
                };
        
        for (int i = 0; i < number.length; i++) {
            for (int j = 0; j < number[i].length; j++) {
                System.out.print(number[i][j] + " ");
            }
            System.out.println();
        }
	}

}
