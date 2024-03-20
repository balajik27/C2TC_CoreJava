package daythree;

import java.util.Scanner;

public class ScannerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		char ch = s.next().charAt(0); // takes only first character
		String b = s.next(); // takes single word
		String d = s.nextLine(); // takes whole line even space not the next line or \n
		boolean boo = s.nextBoolean();
		float f = s.nextFloat();
		double dd = s.nextDouble();
		long l = s.nextLong();
		short sh = s.nextShort();
		
		
//		System.out.println(a);
//		System.out.println(ch);
//		System.out.println(b);
//		System.out.println(d);
		s.close();
		
	}

}
