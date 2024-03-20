package daytwo.controlstatements;

public class SwitchBreak {
	public static void main(String arg[]) {
		char a = 'b';
		switch(a) {
			default:
				System.out.println("This is default");
				break;
			case 'b':
				System.out.println("This is b");
				break;
			case 'a':
				System.out.println("This is a");
				break;
		}
	}
}
