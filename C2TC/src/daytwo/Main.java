package daytwo;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Operators\n");
		int a = 5;
		int b =10;
		float c = 3f;
		float d = 4.5f;
		double dd = 5.5d;
		
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
	}

}
