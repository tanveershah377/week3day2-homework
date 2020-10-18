package homework_week6_day2;

public class Circle implements Shape {

	public static void main(String[] args) {
		
		Circle c = new Circle();
		c.draw();
		

	}

	@Override
	public void draw() {
		System.out.println("shape interface");
		
	}

}
