package week5day1_hw;

public class incalssq3 {
	
	public static void main(String[] args) {
        incalssq3 make = new incalssq3();
       boolean t= make.make10(9, 10);
       System.out.println("result:"+t);
       boolean f= make.make10(9, 9);
       System.out.println("result:"+f);
       boolean tf= make.make10(1, 9);
       System.out.println("result:"+tf);
		
	}
	
	
	public boolean make10(int a,int b) {
		if(a==10 || b==10 || (a+b)==10) {
			return true;
		}
		else {
			return false;
		}
		
		
		}
}
