package operators;

import java.util.Scanner;

public class designcal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int num1,num2;
        
		Scanner scan = new Scanner(System.in);
		System.out.println("First Input:");
		num1 = scan.nextInt();
		
		System.out.println("Second Input:");
        num2 = scan.nextInt();
        
        System.out.println("operator (+,-,*,/)");
        String operator = scan.next();
        int result;
        
        switch(operator) {
        case "+":   result = num1+ num2;
        	System.out.println("addition:"+ result);
        	break;
        case "-":  result = num1- num2;
                 System.out.println("subtraction:"+ result);
                 break;
        case "/": result = num1/ num2;
                  System.out.println("division"+ result);
                  break;
        case "*": result = num1 * num2;
        	System.out.println("multiplication:"+result);
                  break;
        default:
        	System.out.println("operator invalid");
        }
	}

}
