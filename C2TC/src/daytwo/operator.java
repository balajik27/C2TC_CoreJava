package daytwo;

public class operator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Operators\n");
		int a = 5;
		int b =10;
		float c = 3f;
		float d = 6f;
		double dd = 5d;
		
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a/b);
		System.out.println(a%b);
		System.out.println(a<<b);// signed left and right shift both positive and negative
		System.out.println(a>>b);
		System.out.println(a>>>b); // unsigned right shift for only positive number
//		System.out.println(a<<<b);
		
		System.out.println("\nOperation on int and float: \n");
		System.out.println(a+c);
		System.out.println(a/c);
		System.out.println(d/b);
		System.out.println(c%d); //float and float return float value
		System.out.println(a%c); // float and int return float value
		System.out.println(dd%a);
		System.out.println(((Object)(dd%a)).getClass().getSimpleName()); // double and int return double
		// this import java.util.*;
		
	}

}
