package Calendar11_30;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Calendar_Scanner_test_ {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		System.out.println("����� �⵵�� �Է��ϼ���>");
		int year = sc.nextInt();

		System.out.println("����� ���� �Է��ϼ���>");
		int month = sc.nextInt();

		sc.close();
		// c�� �Ű������� ��, ��, �� ���� �� �ִ�
		GregorianCalendar c = new GregorianCalendar(year, month - 1, 1);// 1���� �������� �˾ƾ� ������ ä�� �� �ִ�//���ϰ��� �ϴ� ���� -1�� �����
																		// ������,

		// ������ ���� ���Ѵ�
		int lastday = c.getActualMaximum(Calendar.DATE);

		int s = c.get(Calendar.DAY_OF_WEEK);//GregorianCalendar�� DAY_OF_WEEK�� ������ �޶�, �׸��� ���� s�� ��´�.

		String[] yoil = { "��", "��", "ȭ", "��", "��", "��", "��" };
		System.out.print("\t\t\t" + c.get(Calendar.YEAR) + "��");
		System.out.print((c.get(Calendar.MONTH) + 1) + "��" + "\n");
		for (int i = 0; i < yoil.length; i++) {
			System.out.print(yoil[i] + "\t");
		}
		System.out.println();

		// ������ �Ͽ����� ��� s=1 ���� ���� i=1 2 3 4 5 6 7
		// ������ �Ͽ����� ��� s=2 ���� �Ѱ� i=0 1 2 3 4 5 6
		// ������ �Ͽ����� ��� s=3 ���� �ΰ� i=-1 0 1 2 3 4 5
		// ������ �Ͽ����� ��� s=4 ���� ���� i=-2 -1 0 1 2 3 4
		// ������ �Ͽ����� ��� s=5 ���� �װ� i=-3 -2 -1 0 1 2 3
		// ������ �Ͽ����� ��� s=6 ���� �ټ��� i=-4 -3 -2 -1 0 1 2
		// ������ �Ͽ����� ��� s=7 ���� ������ i=-5 -4 -3 -2 -1 0 1

		for (int i = 2 - s; i <= lastday; i++) { // s+i = 2 => i =2-s
			if (i <= 0) {

				System.out.printf("\t");
			} else {
				System.out.printf(i + "\t");

			}
			// ������ �Ͽ����� ��� s=1 ��� 1 2 3 4 5 6 7
			// ������ �Ͽ����� ��� s=2 ��� 1 2 3 4 5 6
			// ������ �Ͽ����� ��� s=3 ��� 1 2 3 4 5
			// ������ �Ͽ����� ��� s=4 ��� 1 2 3 4
			// ������ �Ͽ����� ��� s=5 ��� 1 2 3
			// ������ �Ͽ����� ��� s=6 ��� 1 2
			// ������ �Ͽ����� ��� s=7 ��� 1

			if ((i + s) % 7 == 1) // ����8���� 7�� ����� �ֱ⿡ -1//�� ���� 8�� �Ǿ���� ((i+s-1)%7 == 0 ���ε� ����
				// 7���� ����� ���� ������ �ϱ� ������ �Ѱ����� �ٷ�� if (i % 7 == 5)�ʹ� ��찡 �ٸ�.

				System.out.println("\n");
		}
	}
}
