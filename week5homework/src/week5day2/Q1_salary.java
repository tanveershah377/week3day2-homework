package week5day2;

import java.util.HashMap;

public class Q1_salary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<String,Integer> salary = new HashMap<String,Integer>();
		salary.put("mark",20000);
		salary.put("roger",30000);
		salary.put("alex", 40000);
		salary.put("john", 50000);
		
		for(String names: salary.keySet()) {
		System.out.println("names:"+names);
		}
		
		for(Integer sal: salary.values()) {
			System.out.println("salaries:"+sal);
			
		}
		
		
	}

}
