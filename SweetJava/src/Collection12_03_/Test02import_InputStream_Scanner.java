package Collection12_03_;

import java.io.InputStream;
import java.util.Scanner;

public class Test02import_InputStream_Scanner {
	public static void main(String args[]) {
		//System.in�� Ű����� �����͸� �Է� ���� �� ����Ѵ�.
		InputStream is = System.in;
		//Ŭ������ ���������� ������ ������ ȣ��
		Scanner sc = new Scanner(is);
		
		System.out.print("����1�� �Է��ϼ���?"); //���� ��� �� ����"
		int a = sc.nextInt();//������ �о� ���� a�� �����Ѵ�.
		
		System.out.println("����2�� �Է��ϼ���?");
		int b = sc.nextInt();
		
		int c = a + b;
		System.out.println("a + b= " + c);
		 c = a - b;
		System.out.println("a - b= " + c);
		 c = a * b;
		System.out.println("a * b= " + c);
		 c = a / b;
		System.out.println("a / b= " + c);
		
		sc.close();
		
	}

}
