package homework_week6day1;

public class case4 {

	
	float mymethod(int a, float b) {
		return a+b;
		
		
	}
	float mymethod(float var1, int var2) {
		return var1-var2;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		case4 Case= new case4();
		float  add= Case.mymethod(50,60f);
		System.out.println("rresult:"+add);
		float subtract = Case.mymethod(12f,34 );
		System.out.println("result sub:"+subtract);
		
		
		
		
		
	}

}
