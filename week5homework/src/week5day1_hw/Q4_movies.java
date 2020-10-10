package week5day1_hw;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Q4_movies {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean statement= true;
		ArrayList<String> movies= new ArrayList<String>();
        Scanner scaner = new Scanner(System.in);	
	    
        while(statement) {
        	
        	System.out.println("Enter the name of your favourite movie");
        	 String moviename = scaner.next();
        	if(moviename.equals("Q") || (moviename.equals("q"))) {
        		System.out.println("you quit");
        	break;}
        	
        	
        	movies.add(moviename);
        }
      // System.out.println(movies.size());
        
        Collections.sort(movies);
	for(String name: movies) {
		System.out.println(name);
	}
	
	
	}
}
