package field11_24;

import java.util.Scanner;

public class Circle2_2solve {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�������� �Է��ϼ���>");
		double input = sc.nextDouble();

		Circle2 obj = new Circle2(input);
		double area = obj.getArea();
		System.out.println("���� ������=" + obj.getRadius());
		System.out.println("���� ����=" + area);

		sc.close();// ���ξȿ� �־��ֱ�
	}
}
