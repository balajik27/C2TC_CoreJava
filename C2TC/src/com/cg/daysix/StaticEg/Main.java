package com.cg.daysix.StaticEg;

public class Main {
	public static void main(String a[]) {
		StaticVariable sv = new StaticVariable();
		sv.display();
		
//		also accessed by creating object
//		StaticMethod sm = new StaticMethod();
//		sm.display(); 
		
		StaticMethod.display();
		
	}
}
