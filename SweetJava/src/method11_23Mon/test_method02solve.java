/*
 * ������ �Է� �޾� inputdata�� ����
 * abs(inputdata)ȣ��
 * abs()�޼����� ��ȯ���� int�� 
 * 
 * ��°��:
 * ������ �Է��ϼ���?-3
 * ���밪: 3
 * 
 * ��°��:
 * ������ �Է��ϼ���?=3
 * ���밫:3
 */
package method11_23Mon;
import java.util.Scanner;
public class test_method02solve {
	public static void main(String[]args) {
		
		System.out.println("������ �Է��ϼ���>");
		Scanner sc = new Scanner(System.in);
		
		int inputdata = sc.nextInt();
		int result = abs(inputdata) ;
			System.out.println("���밪:" + result);
			sc.close();
	}
	public static int abs(int data) {
		if(data<0)
			data = -data;
	return data;	
	}
}
