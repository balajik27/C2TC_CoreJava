package com.cg.daysix.FinalEg;

public class Main {
	public static void main(String a[]) {
		FinalClass f = new FinalClass();
		child c = new child(); //The type child cannot subclass the final class FinalClass
		System.out.println(c.a); // error in before line
		System.out.println(f.a); 
		
	}
}
