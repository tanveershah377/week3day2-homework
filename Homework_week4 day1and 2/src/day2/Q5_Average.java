package day2;

public class Q5_Average {

	public static void main(String[] args) {
		
		int[] array= new int[5];
		
		array[0] = 10;
		array[1]=20;
        array[2] =30;
        array[3]= 40;
        array[4]= 50;
        int avg=0;
        
        for (int t=0; t<array.length; t++) {
        	
        	avg= avg + array[t]/5;
        }
	System.out.println("average"+avg);
	}

}
