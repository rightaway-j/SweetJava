package Array;

import java.util.Scanner;

public class test_array03_total_average {
	public static void main(String args[]) {
		int sum = 0;
		double avg = 0;

		Scanner sc = new Scanner(System.in);
		System.out.println("���� ���� �Է��ϼ���.>");
		byte size = sc.nextByte(); // -128~127������ ����
		int[] score = new int[size];

		System.out.println("������ ������" + size + "�� �Է��ϼ���.>");

		for (int i = 0; i < score.length; i++) {
			score[i] = sc.nextInt();
			sum = sum + score[i];
		}

		avg = (double) sum / (score.length); // avg=(double)sum/5.0;
		System.out.printf("��=" + sum + "\n ���=" + avg);
		sc.close();

	}
}
