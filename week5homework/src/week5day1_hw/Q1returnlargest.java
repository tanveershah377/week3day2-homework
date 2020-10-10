package week5day1_hw;


public class Q1returnlargest {

	public static void main(String[] args) {
		
		Q1returnlargest large = new Q1returnlargest();
		boolean L = large.largest(5, 10, 15);
		System.out.println("largest:"+L);
		
	
	}
	int a=5;
	int b=10;
	int c=15;
public boolean largest(int a,int b,int c) {
	if(c>a || c>b || (a+b)==c) {
		return true;
	}
	else  
		return false;
	}
	


}
