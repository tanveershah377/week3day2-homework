package week5day1_hw;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;



public class Q3Colorsarray {

	public static void main(String[] args) {
	
		ArrayList<String> colors = new ArrayList<String>();
		
	Scanner scan = new Scanner(System.in);
    boolean statement = true;

   
    while(statement){
   	
          System.out.println("Please input a color name and add to arraylist(Q or q to quit to program): ");
         String colorname = scan.next();
         
         if(colorname.equals("Q")|| colorname.equals("q")) {
        	 System.out.println("you Quit");
      		break;}
         
         
         
     	 colors.add(colorname);
      	 
         
          
		
		
		}
    Collections.sort(colors);
		
	   for(String colorss: colors) {
			System.out.println(colorss);
		
			

		
	}

}}
