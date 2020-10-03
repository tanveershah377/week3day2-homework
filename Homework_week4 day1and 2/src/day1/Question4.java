package day1;

import java.util.Scanner;

public class Question4 {

	public static void main(String[] args) {
		
       int secretnumber = 50;
       int guess;
       boolean statement = true;
       
       Scanner gn = new Scanner(System.in);
       
    
		
      while(statement) {
    	  System.out.println("guess a number");
      guess = gn.nextInt();
       
      if(guess==secretnumber) {
    	  statement = false;
    	  System.out.println("you guessed it right");
    		  
      }
      
      else if(guess!=secretnumber){
    	  System.out.println("you guessed it wrong");
    	  
      }
      
      }
		

		
		

	}

}
