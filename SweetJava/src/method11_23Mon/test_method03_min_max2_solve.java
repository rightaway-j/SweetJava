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
public class test_method03_min_max2_solve {
	public static void main(String[]args) {

	Scanner sc = new Scanner(System.in);
	System.out.println("�ΰ��� ������ �Է��ϼ���>");
	int a = sc.nextInt();
	int b = sc.nextInt();
	
	
	System.out.println(" �ִ�:" + max(a,b));
	System.out.println(" �ּڰ�:" + min(a,b));
	
		 sc.close(); //�����ʱ�
		 
	}
	public static int max(int a, int b) {
		int max =a> b? a:b;
		 return max;//��ȯ���� �ݵ��!!
		}
	public static int min(int a, int b) {
		int min =a<b? a:b;
		 return min;
	}
}
