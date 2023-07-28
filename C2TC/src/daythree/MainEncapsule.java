package daythree;

public class MainEncapsule {
	public static void main(String a[]) {
		Encapsule eobj = new Encapsule();
		System.out.println(eobj.getId());
		
		eobj.setName("Balaji");
		eobj.setId(101);
		eobj.setAge(20);
		eobj.setGender("Male");
		eobj.setMobileNo(9080022621L);
		
		System.out.println(eobj.getMobileNo());
		System.out.println(eobj.getId());
	}
}
