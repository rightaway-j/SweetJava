package Array;

public class array06_String {
	public static void main(String args[]) {
		int arr[] = {10,20,30,40,50};
		
		//향상된 for문, 확장for문 (jdk1.5이상)
		for (int num : arr) {
			System.out.println(num);
		}
		System.out.println("End.");
	}
	
}
