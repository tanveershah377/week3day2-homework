package homework_week6day1;

public class case3 {
	
	
	
	int mymethod(int a, int b) {
		return a/b;
		
		
	}
	int mymethod(int num) {
		return 0;
		
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
              
		case3 Case3 = new case3();
		int div= Case3.mymethod(10, 5);
		System.out.println("result:"+div);
		int number= Case3.mymethod(0);
		System.out.println("result num:"+number);
		
		
	}

}
