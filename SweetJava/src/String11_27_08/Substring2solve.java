package String11_27_08;

public class Substring2solve {
	public static void main(String args[]) {
		String jumin = "123456-4123456";
		String s = jumin.substring(7, 8);
		System.out.print("������ ���ڴ� " + s + "�̰�");// Substring(n1,n2); n1 ���� n2-1��������

		if (s.equals("1") || s.equals("3")) {
			System.out.println("���� �Դϴ�.");
		} else if (s.equals("2") || s.equals("4")) {
			System.out.println("���� �Դϴ�.");
		} else {
			System.out.println("�ܱ��� �Դϴ�.");
		}
	}
}
