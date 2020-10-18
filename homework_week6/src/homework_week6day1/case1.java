package homework_week6day1;

public class case1 {

	
	
		public float myMethod(int a, int b, float c) {
	return a+b+c;
			
		}
		public float myMethod(int var1, float var3,int var2) {
			return var1+var3+var2;
		}


		
		
		
	
public static void main(String[] args) {

	case1 ca= new case1();
    int a= 10;
    int b =20;
    float c= 1.2f;
    System.out.println("result:"+ ca.myMethod(a, b, c));

    int var1=4;
    int var2= 8;
    float var3= 2.4f;
    System.out.println("result2:"+ ca.myMethod(var1, var3, var2));
    
   
    
}}
