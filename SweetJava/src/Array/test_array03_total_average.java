package Array;

import java.util.Scanner;

public class test_array03_total_average {
	public static void main(String args[]) {
		int sum = 0;
		double avg = 0;

		Scanner sc = new Scanner(System.in);
		System.out.println("과목 수를 입력하세요.>");
		byte size = sc.nextByte(); // -128~127범위의 정수
		int[] score = new int[size];

		System.out.println("과목의 점수를" + size + "개 입력하세요.>");

		for (int i = 0; i < score.length; i++) {
			score[i] = sc.nextInt();
			sum = sum + score[i];
		}

		avg = (double) sum / (score.length); // avg=(double)sum/5.0;
		System.out.printf("합=" + sum + "\n 평균=" + avg);
		sc.close();

	}
}
