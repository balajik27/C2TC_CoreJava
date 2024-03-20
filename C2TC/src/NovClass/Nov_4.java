package NovClass;

public class Nov_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			System.out.println(3/0);
		}
		catch(Exception err){
			System.out.println(err);
		}
		finally {
		System.out.println("finally");
		}
	}

}
