package daytwo.controlstatements;

public class Continue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=5;i<15;i++) {
			if(i==10) {
				continue; // 10 wont print
			}
			System.out.println(i);
		}
	}

}
