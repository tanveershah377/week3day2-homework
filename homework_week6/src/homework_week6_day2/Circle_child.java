package homework_week6_day2;

public class Circle_child extends Shape_abstract{

	
	public int draw() {
		return 39-49;
		
	}

	
	public static void main (String[]args) {
		
		Circle_child c= new Circle_child();
		int cir= c.draw();
		System.out.println(cir);
	}
	

}
