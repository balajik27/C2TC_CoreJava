package daythree;
class Sample{
	int id;
	String name;
	String dept;
	
	Sample (){
		dept = "CSE";
	}
	
	public Sample(int id, String name , String dept) {
		super();
		this.id = id;
		this.name = name;
		this.dept = dept;
	}
	
	
}

public class Constructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Parameterized constructor: ");
		Sample obj = new Sample(101,"Balaji","CSE");
		System.out.println(obj.name);
		
		System.out.println("Default constructor: ");
		Sample obj2 = new Sample();
		System.out.println(obj2.dept);
	}

}
