package String11_27_08;

public class Substring2 {
	public static void main() {
		String jumin = "123456-4123456";
		if (jumin.substring(7).equals("1")) {

			System.out.println("������ ���ڴ� " + "1" + "���� �Դϴ�.");

		} else if (jumin.substring(7).equals("3")) {
			System.out.println("������ ���ڴ� " + "3" + "���� �Դϴ�.");
		} else if (jumin.substring(7).equals("2")) {
			System.out.println("������ ���ڴ� " + "2" + "���� �Դϴ�.");
		} else if (jumin.substring(7).equals("4")) {
			System.out.println("������ ���ڴ� " + "4" + "���� �Դϴ�.");
		}else{
			System.out.println("������ ���ڴ�  �Դϴ�.");
		}

	}
}
