package day2;

public class Q3_even_odd {

	public static void main(String[] args) {
	
		int [] Arraynums = new int [10];
		
		Arraynums[0] = 1 ;
		Arraynums[1] = 2;
		Arraynums[2] = 3; 
		Arraynums[3] = 4;
		Arraynums[4] = 5;
		Arraynums[5] = 6;
		Arraynums[6] = 7;
		Arraynums[7] = 8;
		Arraynums[8] = 9;
		Arraynums[9] = 10;
		
		
	    
	    for(int x=0; x<Arraynums.length; x++) {
	    	
	    	if(Arraynums[x]%2==0) {
	    		System.out.println("even:"+Arraynums[x]);
	    	}
	    	else if(Arraynums[x]%2!=0) {
	    		System.out.println("odd:"+Arraynums[x]);
	    	}
	    	
	    }
		    
	

	}

}
