//���� �Է¹޴� ScannerŬ������ ����� ���ô�.
//Scanner Ŭ������ java.util ��Ű���� �ִ�.
//nextInt() : Ű����� ���� �������� ���� �Է� �޴� �޼��� �̴�.
package Operator; //���� ��� �ִ���
//import java.io.InputStream;
//import java.util.Scanner;

import java.io.InputStream; //���� ����ϴ� ���� �ּ�
import java.util.Scanner;

public class Oper02_input {
	public static void main(String args[]) {
		//System.in�� Ű����� �����͸� �Է� ���� �� ����Ѵ�.
		InputStream is = System.in;
		//Ŭ������ ���������� ������ ������ ȣ��
		Scanner sc = new Scanner(is);
		
		System.out.print("������ �Է��ϼ���>"); //���� ��� �� ����"
		int a = sc.nextInt();//������ �о� ���� a�� �����Ѵ�.
		
		System.out.println("�Է°���"+ a + "�Դϴ�.");
		
		System.out.print("������ �Է� �ϼ���>");
		int b = sc.nextInt();
		
		System.out.println("�Է°���" + b + "�Դϴ�.");
		sc.close();
		
	}
}
