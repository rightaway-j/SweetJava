package Array;

import java.util.Scanner;

public class test_array05solve_scanner_max_min {
	public static void main(String args[]) {
		int[] su = new int[5];

		System.out.println("정수 5개를 입력하세요");
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < su.length; i++) {
			su[i] = sc.nextInt();
		}

		int max = su[0];
		int min = su[0];

		for (int i = 1; i < su.length; i++) {
			if (max < su[i])
				max = su[i];
			if (min > su[i])
				min = su[i];

		}
		System.out.println("max=" + max);
		System.out.println("min=" + min);
		sc.close();
	}

}
