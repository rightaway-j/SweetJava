package Wrapper12_01_07;
//int -> String ����� ��� �ΰ���
//���1. Integer.toString()���
//���2. + ������ ���
public class int_to_String {
	public static void main(String args[]) {
		
		int i = 10;
		//��� 1.Integer.toString()���
		String age = Integer.toString(i);
		
		//���2. + ������ ���
		String age2 = "" + i;
		
		System.out.println(age);
		System.out.println(age2);
	}
}
