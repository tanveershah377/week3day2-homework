package homework_week6day1;

public class case5 {
	
	public int mymethod(int a, int b) {
		return a-b;
		
	}
	float mymethod(int var1, float var2) {
		return var1+var2;
	}

	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  
		case5 cas = new case5();
		int neg= cas.mymethod(15, 37);
		System.out.println("result neg:"+neg);
		float addition= cas.mymethod(34, 10f);
		System.out.println("result add:"+addition);
	}

}
