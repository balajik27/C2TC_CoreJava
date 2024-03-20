package daytwo.controlstatements;

public class Nested_Ifelse {
	public static void main(String args[]) {
		int a = 10;
		if(a>0) {
			System.out.println("A is positive number");
		}
		else if(a<0) {
			System.out.println("A is negative number");
		}
		else if(a==0) {
			System.out.println("A is zero");
		}
		else {
			System.out.println("Invalid input");
		}
	}
}
