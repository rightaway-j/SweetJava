package conditional_loop;

public class Switch02_char {
	public static void main(String args[]) {
		String ch = "a"; // char''��ü ��� ���� ����

		switch (ch) {
		case "A":
		case "a":
			System.out.println("���");
			break;

		case "P":
		case "p":
			System.out.println("��");
			break;

		case "G":
		case "g":
			System.out.println("����");
			break;

		default:
			System.out.println("?");

		}
		System.out.println("��");

	}
}
