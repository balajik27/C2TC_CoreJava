package com.cg.daysix.FinalEg;

public class FinalClass {
	int a = 10;
	final int var = 20;
//	var = 30; error because final variable
	
	final public void display() {
		System.out.println("cant override");
	}
}

//class FinalMethod extends FinalClass{
//	@Override
//	public void display() { //  cant be overridden
//		System.out.println("Cant override");
//	}
//}
//public class child extends FinalClass{
//	int b=30;
//	
//}
