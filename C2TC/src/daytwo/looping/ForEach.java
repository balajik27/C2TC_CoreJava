package daytwo.looping;

public class ForEach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = new int[10];
		for(int i : arr) {
			i=i+1; // doesnot increment
		}
		for(int i=0;i<10;i++) {
			arr[i]=arr[i]+1; // this increment
		}
		for(int i : arr) {
			System.out.println(i);
		}
	}

}
