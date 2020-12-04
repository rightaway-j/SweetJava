package Array;

public class array05_1 {
	public static void main(String args[]) {
		int arr[][] = {{10,20}, {30,40}, {50}};
		
		for (int[] a: arr) {//arr이 가르키고 있는 각 요소들은 일차원 배열을
			for (int n : a) {
				System.out.print (n + " ");
			}
			System.out.println();
		}
		System.out.println("Done.");
		}
	}


