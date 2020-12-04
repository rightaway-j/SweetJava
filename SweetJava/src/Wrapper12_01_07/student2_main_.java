package Wrapper12_01_07;

import java.util.Scanner;

public class student2_main_ {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		Student2[] hs = null;
		do {
			int menu = selectMenu(sc, hs);
			switch (menu) {
			case 1:
				hs = input(sc, hs);
				break;
			case 2:
				update(sc, hs);
				break;
			case 3:
				hs = delete(sc, hs);
				break;
			case 4:
				select(sc, hs);
				break;
			case 5:
				Student2.sort(hs);
				print(hs);
				break;
			case 6:
				close(sc); // �����ϱ� ���� case
				return; // ������ ������ -���� ����
			}
		} while (true);// ���� ����
	}

	private static int selectMenu(Scanner sc, Student2[] hs) {
		String[] menus = new String[] { "�Է�", "����", "����", "��ȸ", "���", "����" };
		for (int i=0; i < menus.length; i++) {}
		if (!(sc.equals(menus)))
			System.out.println(menus[0]);
		else
			System.out.println(menus);
		//end�� ����
		int end = menus[0].length();
		return inputNumber(sc, 1, end);// inputNumber�޼��� ȣ��
	}
								//�޼��忡�� , ( �� ���� ������ ���� �޼ҵ� ��ȣ������ �� �����ִ��� Ȯ��
	int inputNumber(Scanner sc, int start, int end) { // ���⼭ start���ڿ�end���ڴ� ������� �������ֳ�,
		do {					
			try {
				String n = sc.nextLine();
				int a = Integer.parseInt(n);
				if (!(start <= a && a <= end)) {
					System.out.println(start + "~" + end + "������ ���ڸ� �Է��ϼ���>");
				} else
					break;
			} catch (java.lang.NumberFormatException e) {
				System.out.println("���ڷ� �Է��ϼ���>");
			}

		} while (true);

		return;
	}
}
