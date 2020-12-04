package conditional_loop;

import java.util.Scanner;

public class max_min01solve {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("세 개의 정수를 입력하세요.>");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();

		int max, min;
		if (num1 >= num2 && num1 >= num3) {
			max = num1;
		} else if (num2 >= num3) {
			max = num2;
		} else {
			max = num3;
		}
		System.out.println("max =" + max);

		if (num1 <= num2 && num1 <= num3) {
			min = num1;
		} else if (num2 <= num3) {
			min = num2;
		} else {
			min = num3;
		}
		System.out.println("min =" +min);
		sc.close();
	}
}
