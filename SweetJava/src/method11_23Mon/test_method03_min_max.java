/*
 * ���� ������ �����ϴ� �޼��带 �����ض�
 * 1.main()
 * 1) �ΰ��� ����(a,b)�� �Է�
 * 2) max(a,b)�� ȣ���Ͽ� �ִ밪�� ���
 * ���ȭ��) �ִ밪= �Է¹��� �� �� ū ��
 * 
 * 2.max()
 * ���) ���ڷ� ���� ������ 2�� �߿��� �ִ밪�� ���Ѵ�
 * ���ϰ�)�ִ밪
 * 3.min()
 * ��� ) ���ڷ� ���� ������ 2�� �߿��� �ּҰ��� ���Ѵ�
 * ���ϰ�) �ּҰ�
 * 
 */
package method11_23Mon;
import java.util.Scanner;
public class test_method03_min_max {
	public static void main(String[]args) {

	Scanner sc = new Scanner(System.in);
	System.out.println("�ΰ��� ������ �Է��ϼ���>");
	int a = sc.nextInt();
	int b = sc.nextInt();
	int result = max(a,b);
	
	System.out.println(" �ִ�:" + max);
	
		 
		 
	}
	public static int max(int a, int b) {
		if(a < b) {
		 System.out.println("max ="+ a);
		}else {
		 System.out.println("max ="+ b);
		 return 
		}
	}
}
