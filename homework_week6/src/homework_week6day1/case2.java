package homework_week6day1;

public class case2 {
	
	int mymethod(int a, int b) {
		return a*b;
		
	}
	
	float mymethod(float var1, float var2) {
		return var1*var2;
		
	}

	
	
	
	
	
	
	
	
	
	

	public static void main(String[] args) {
		
		case2 Case2= new case2();
		
		int multiply= Case2.mymethod(6, 10);
		System.out.println("result:"+ multiply);
		int multi= Case2.mymethod(5, 4);
		System.out.println("result float:"+multi);
		

	}

}
