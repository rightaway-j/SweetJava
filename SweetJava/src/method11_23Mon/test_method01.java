/*
 * ���� ������ �����ϴ� �޼��� ����
 * �޼��� �̸� :  add
 * �Ű� ���� ������ 2��
 * ��� : �Ű� ������ ���� ���Ѵ�.
 * ��ȯ��: �Ű� ������ �������� ���� ��
 * ��ȯ��; int
 */
/* 
 * 
 * 
 * 2
 *1������ ������ add�޼��带 ȣ���Ѵ�
 *���ڰ����� 3��4�� ����Ѵ�
 *3.add()�޼��� ȣ�� ������� ����Ѵ�.
 *���ȭ�� )7
 */
package method11_23Mon;

public class test_method01 {
	public static void main(String[]args) {
	int result = add(3,4);
	System.out.println(result);
//	test_method01.add(3,4);
	}
	public static int add(int a, int b) {
		int sum = 0;
		sum = a + b;
		return sum;
	}
	
}


