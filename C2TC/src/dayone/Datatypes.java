package dayone;

public class Datatypes {
	static int a;
	static boolean c; // compiler assign default value to class member variable 
	static char b;
	static double d;
	static float f;
	static long l;
	static String s;
	
	public static void main(String args[]) {
		System.out.println("Default int value: "+a);
		
		int a; //doesn't throw error but while accessing the uninitialized variable it throes error
//		error - The local variable a may not have been initialized
//		compiler never assigns default 
//		values to an uninitialized local variable.
//		System.out.println("Default int value: "+a);
		
		System.out.println("Default char value: "+b);
		System.out.println("Default boolean value: "+c);
		System.out.println("Default double value: "+d);
		System.out.println("Default float value: "+f);
		System.out.println("Default long value: "+l);
		System.out.println("Default string value: "+s+"\n");
		
		
		a= 20;
		b = 'b';
		c=true;
		d = 5d;
		f = 4f;
		l = 6l;
		s="Balaji";
//		float height = 167.7f;
//		or   upper or lower f , d , l 
//		float height = 167.7F;
		System.out.println("Value of int: "+a);
		System.out.println("Value of char: "+b);
		System.out.println("Value of boolean: "+c);
		System.out.println("Value of double: "+d);
		System.out.println("Value of float: "+f);
		System.out.println("Value of long: "+l);
		System.out.println("Value of string: "+s);
	}
}
