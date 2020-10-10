package week5day2;

public class classZ{

	int num1=20;
	int num2=30;
	
	
	int add;
	
	classZ(int add){
	this.add=add;
	}
	
	public int addition() {
		return num1+num2;
		
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		classY classs = new classY(6000);
		int sub= classs.addition();
		System.out.println("add:"+sub);
		classs.result2();
		
		
		Q3_classX  var= new Q3_classX(5000);
		
		
		int sub2 = var.addition();
		System.out.println("add2:"+ sub2);
		var.result();
	}
           

		
	}


