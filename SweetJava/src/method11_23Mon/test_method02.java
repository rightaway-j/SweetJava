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
public class test_method02 {
	public static void main(String[]args) {
		System.out.println();
	}
	public static int abs(int inputdata) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("������ �Է��ϼ���>");
		 inputdata = sc.nextInt();
		 if(inputdata <0) {
			System.out.println("���밪:" + -(inputdata));
		 }
	return ;	
	}
}
