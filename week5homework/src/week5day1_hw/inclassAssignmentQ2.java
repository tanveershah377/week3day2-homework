package week5day1_hw;

import java.util.ArrayList;

public class inclassAssignmentQ2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> numbers= new ArrayList<Integer>();
	    numbers.add(12);
		numbers.add(24);
		numbers.add(36);
	    numbers.add(48);
	    numbers.add(60);
	    
	    for(int i=0; i<numbers.size(); i++) {
	    	System.out.println("printed:"+numbers.get(i));
	    }
		
	}

}
