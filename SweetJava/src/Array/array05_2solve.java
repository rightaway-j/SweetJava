package Array;

public class array05_2solve {
	public static void main(String args[]) {
		int arr[][] = {{10,20}, {30,40}, {50}};
		
		for (int i= 0; i<arr.length; i++)
			for (int n= 0; n< arr.length; n++) {
				System.out.println(i+","+n);
			}
			
		}
	}

