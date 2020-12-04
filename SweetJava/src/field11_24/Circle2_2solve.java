package field11_24;

import java.util.Scanner;

public class Circle2_2solve {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("반지름을 입력하세요>");
		double input = sc.nextDouble();

		Circle2 obj = new Circle2(input);
		double area = obj.getArea();
		System.out.println("원의 반지름=" + obj.getRadius());
		System.out.println("원의 넓이=" + area);

		sc.close();// 메인안에 넣어주기
	}
}
