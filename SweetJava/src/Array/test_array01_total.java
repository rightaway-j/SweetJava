package Array;

public class test_array01_total {
	public static void main(String args[]) {
		int[] score = { 95, 70, 80, 75, 100 };

		int sum = 0;
		for (int i = 0; i < 5; i++) {
			// for (int i = 0; i < score.length ;i++) �� ����ϴ°��� ����
			System.out.println("Score[" + i + "]= " + score[i]);
			sum += score[i]; // ���� ���ϴ°� ���⿡ �ִ´�. check�ϱ�

		}
		System.out.println("����=" + sum);
	}
}
