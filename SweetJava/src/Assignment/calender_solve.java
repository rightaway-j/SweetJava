package Assignment;

public class calender_solve {
	public static void main(String args[]) {
		for (int i = 1; i <= 31; i++) {
			System.out.printf("%5d", i);//5�ڸ��� �����ϰ� ������ ����
			if (i % 7 == 0)
				System.out.println();
		}
		
		System.out.println("\n============================");
		for (int i = 1; i <= 31; i++) {
			System.out.printf("%-5d", i); //5�ڸ��� �����ϰ� ��������
			if (i % 7 == 0)
				System.out.println();
		}
		
		System.out.println("\n===========================");
		for (int i = 1 ; i <= 31; i ++){
			System.out.printf("%-5d", i);
			if (i % 7 == 5) // 5 �϶��� �� �ٲ�� (���ٿ� 5)
			 
				System.out.println();
			
		}
		
		
	}

}
