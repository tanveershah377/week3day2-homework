package operators;

import java.util.Scanner;

public class Even_or_odd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           int num;
           System.out.println("enter a remainder:");
           
   Scanner scan1 = new Scanner(System.in);
        num = scan1.nextInt()		;
        
        
        if(num%2==1)
        	System.out.println("Entered number is odd");
        else
           System.out.println("Entered number is even");
     
	}

}
