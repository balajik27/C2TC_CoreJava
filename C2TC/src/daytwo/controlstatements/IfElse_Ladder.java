package daytwo.controlstatements;

public class IfElse_Ladder {
	public static void main(String args[]) {
		int a=10;
		if(a>0 && a<15) {
			if(a%2==0) {
				if(a==10) {
					System.out.println("The number is 10");
				}
			}
		}
	}
}
