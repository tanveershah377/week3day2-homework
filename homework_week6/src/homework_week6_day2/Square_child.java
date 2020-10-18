package homework_week6_day2;

public class Square_child extends Shape_abstract {
	
	public int draw() {
		return 67+87;


}
public static void main (String[]args) {
	
	Square_child sq= new Square_child();
	int squ = sq.draw();
	System.out.println(squ);
	
	
}}