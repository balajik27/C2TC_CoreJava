package com.cg.daysix.StaticEg;

public class StaticVariable {
	static int a = 10;
	
	static {
		a = 20;
	}
	
	void display()
	{
		System.out.println(a);
	}

}
