package OOPs;


public class Parent{
	void display1() {
		System.out.println("This is parent");
	}
}
public class child extends Parent{
	void display2() {
		System.out.println("This is child");
	}
}
public class MultiLevel extends child{
	void display3() {
		System.out.println("This is third child");
	}
}
