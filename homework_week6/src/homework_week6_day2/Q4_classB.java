package homework_week6_day2;

public class Q4_classB extends Q4_abstract_classA{

	public static void main(String[] args) {
		Q4_classB b = new Q4_classB();
		int addtion = b.add(22, 44);
		System.out.println(addtion);

		
		
	}

	@Override
	int add(int a, int b) {
		
	 return  a + b ;
	}

}
