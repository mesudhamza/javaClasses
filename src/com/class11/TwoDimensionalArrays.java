package com.class11;

public class TwoDimensionalArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Declare 2D Array
		
		int[] [] array=new int[3][4];
		
		//1st row
		array [0][0] = 44;
		array [0][1] = 80;
		array [0][2] = 33;
		array [0][3] = 20;
		
		//2nd row
		array[1][0] = 10;
        array[1][1] = 5;
        array[1][2] = 7;
        array[1][3] = 8;
        
        //3rd row
        array[2][0] = 10;
        array[2][1] = 9;
        array[2][2] = 70;
        array[2][3] = 6;
        System.out.println(array[1][3]);
		
		
		//Task: create 2D array of String with 2 rows and 3 columns
        //and print value in second row and 3rd column
        
        //first way
        String[][] arr= new String[2][3];
        
        arr[1][2]= "ABC";
        
        System.out.println(arr[1][2]);
        //second way
//        String [][]arr= {
//        		{"AK","MK","CK"},
//        		{"SK","BY","OK"}
//        	
//        };
//        
//        System.out.println(arr[1][2]);
        
        System.out.println("***********");
		
        int [][] array2=new int[2][3];
		
		//1st row
		array2 [0][0] = 1;
		array2 [0][1] = 2;
		array2 [0][2] = 3;
		
		//2nd row
		array2 [1][0] = 4;
		array2 [1][1] = 5;
		array2 [1][2] = 6;
		
		System.out.println(array2[1][2]);
		
		System.out.println("***********");
		
		int [][] numbers= {
                {8,7,5,3,8},
                {1,5,6,4,9},
                {3,6,8,0,7}    
        };
        
        System.out.println("The value in index 1 and 4 is= "+numbers[1][4]);
        
        //To identify the numbers of Rows
        System.out.println("The number of Rows are:= "+numbers.length);
        
        //To identify the numbers of Columns/elements in that row
        System.out.println("The number of Columns are:= "+numbers[0].length);
        
       
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
