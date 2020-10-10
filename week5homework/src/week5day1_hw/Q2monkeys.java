package week5day1_hw;

public class Q2monkeys {

	public static void main(String[] args) {
		

		Q2monkeys M = new Q2monkeys();
		boolean M1 = M.monk(true,true);
		System.out.println("you are in trouble: "+M1);
	}
	
public boolean monk( boolean asmile,boolean bsmile) {
	if((asmile && bsmile ) ||(!asmile && !bsmile)) {
		return true;
	}
	else {
		return false;
	}
}
}
