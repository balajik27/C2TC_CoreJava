package OOPs;


class Parent{
	void display1() {
		System.out.println("This is parent");
	}
}
class child extends Parent{
	void display2() {
		System.out.println("This is child");
	}
}
class MultiLevel extends child{
	void display3() {
		System.out.println("This is third child");
	}
}
