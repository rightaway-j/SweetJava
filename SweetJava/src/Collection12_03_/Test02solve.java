package Collection12_03_;

import java.io.InputStream;
import java.util.Scanner;

public class Test02solve {
	public static void main(String args[]) {
		//System.in�� Ű����� �����͸� �Է� ���� �� ����Ѵ�.
		InputStream is = System.in;
		//Ŭ������ ���������� ������ ������ ȣ��
		Scanner sc = new Scanner(is);
		int n1, n2, result;
		System.out.print("����1�� �Է��ϼ���>"); //���� ��� �� ����"
		
		n1 = sc.nextInt();//������ �о� ���� a�� �����Ѵ�.
		
		System.out.print("����2�� �Է��ϼ���>");
		n2 = sc.nextInt();
		
		result = n1 + n2;
		System.out.println(n1 + "+" + n2 + "=" + result);
		result = n1 - n2;
		System.out.println(n1 + "-" + n2 + "=" + result);
		result = n1 * n2;
		System.out.println(n1 + "*" + n2 + "=" + result);
		result = n1 / n2;
		System.out.println(n1 + "/" + n2 + "=" + result);
		
		sc.close();
		
	}

}
