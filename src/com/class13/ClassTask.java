package com.class13;

public class ClassTask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Create a string and print it in reverse order (Sunday-->yadnuS)
		
		
		String str="Mesud";
		
		for(int i=4; i>=0; i--) {//instead of i=4 you can also do i=str.length()
			System.out.print(str.charAt(i));
		}
		
		System.out.println("------------------------------");
		
		//another way
		String day="Sunday";
        
        //System.out.println(day.charAt(5)+” “+day.charAt(4)+” “+day.charAt(3));
        System.out.println(day.length());
        
        
        for(int i=day.length()-1;i>=0;i--) {
            System.out.print(day.charAt(i));
        }
		
		
		//create a string and if the string is not empty perform the following:
		//if the string has an odd number of characters and has 3 or more characters,
		//print the character in the middle of the string
		
		System.out.println("------------------------------");
		
		String a="";
		
		System.out.println(a.isEmpty());
	
        
    
        //
        String str1="Hellourwewr";
        
        int lenght=str1.length();
        int middle=str1.length()/2;//it gives you the middle character which is u.  11 divided by 2= 5,5, since it is int it will
        //give you 5 and when you print 5th index at the bottom it will give you the 5th character which is u
        
        System.out.println();
        if(!str1.isEmpty()) {
            if(lenght%2!=0 && lenght>=3) {
                System.out.println(str1.charAt(middle));
		
            }
		
        }
        
        //another way
        
        String str2 = "Hellou";
        
        if (!str2.isEmpty()) {
            if (str2.length() % 2  != 0) {
                System.out.print(str2.charAt(str2.length()/2));
            }else {
            System.err.println("Error");
            }
        }    
         
        
        int b=5%2;
        System.out.println("-----------------");
        System.out.println(b);
        
       
        
        
        
        
        
        

}
}
