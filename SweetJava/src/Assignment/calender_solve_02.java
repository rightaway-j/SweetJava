package Assignment;

public class calender_solve_02 {
	public static void main(String args[]) {
		System.out.println("\n===========================");
		for (int i = -1; i <= 31; i++) {
			if (i <= 0)

				System.out.printf("%5s", ""); //0�Ʒ��� ���ڰ� ������ �ʴ� ����?
			else
				System.out.printf("%5d", i); // d�� s�� ����� �ٸ�����?

			if (i % 7 == 5) // 5 �϶��� �� �ٲ�� (���ٿ� 5)

				System.out.println();
		}
	}
}