package String11_27_08;

public class Substring2solve_Switch {
	public static void main(String args[]) {
		String jumin = "123456-4123456";
		String s = jumin.substring(7, 8);
		System.out.print("������ ���ڴ� " + s + "�̰�");// Substring(n1,n2); n1 ���� n2-1��������
		switch (s) {
		case "1":
		case "3":
			System.out.println("���� �Դϴ�.");
			break;
		case "2":
		case "4":
			System.out.println("���� �Դϴ�.");
			break;
		default:
			System.out.println("�ܱ��� �Դϴ�.");

		}

	}
}
