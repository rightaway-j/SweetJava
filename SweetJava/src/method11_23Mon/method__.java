package method11_23Mon;

import java.util.Scanner;

public class method__ {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�ΰ��� ������ �Է��ϼ���>");
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println("before: " + "a=" +a + ",\tb=" +b);
		int imsi;
//		imsi = b;
//		   b = a;
//		   a = imsi;
		   imsi = a;
		      a = b;
		      b = imsi;
		   System.out.println("after: "+"a=" +a + ",\tb=" +b);
		   sc.close();
	}
}
