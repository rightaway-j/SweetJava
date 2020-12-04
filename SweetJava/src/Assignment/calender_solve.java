package Assignment;

public class calender_solve {
	public static void main(String args[]) {
		for (int i = 1; i <= 31; i++) {
			System.out.printf("%5d", i);//5자리를 차지하고 오른쪽 정렬
			if (i % 7 == 0)
				System.out.println();
		}
		
		System.out.println("\n============================");
		for (int i = 1; i <= 31; i++) {
			System.out.printf("%-5d", i); //5자리를 차지하고 외쪽정렬
			if (i % 7 == 0)
				System.out.println();
		}
		
		System.out.println("\n===========================");
		for (int i = 1 ; i <= 31; i ++){
			System.out.printf("%-5d", i);
			if (i % 7 == 5) // 5 일때는 줄 바꿔라 (한줄에 5)
			 
				System.out.println();
			
		}
		
		
	}

}
