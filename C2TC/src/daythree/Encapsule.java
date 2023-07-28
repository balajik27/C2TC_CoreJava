package daythree;

public class Encapsule {
	private int id;
	private String name;
	private int age;
	private long mobileno;
	private String gender;
	
	
	
	public Encapsule() {
//		super();
		// TODO Auto-generated constructor stub
	}
	public Encapsule(int id, String name, int age, long mobileno, String gender) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.mobileno = mobileno;
		this.gender = gender;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public void setMobileNo(long mobileno) {
		this.mobileno = mobileno;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public String getGender() {
		return gender;
	}
	public long getMobileNo() {
		return mobileno;
	}
}
