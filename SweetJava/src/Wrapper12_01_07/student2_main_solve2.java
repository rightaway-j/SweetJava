package Wrapper12_01_07;

import java.util.Scanner;

public class student2_main_solve2 {
	public static int number; //

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		Student2[] hs = null; // �޾�� ��ü�� �־���ϴ� �� ���̽����� �ٲ���� �����Ҽ� �ֵ��� �������
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

	private static void close(Scanner sc) {
		sc.close(); // �߰��� ���Ḧ �ع����� ���� ��ǲ�� ��������� �޼���� ���� ��� ���� ������
	}

	private static void print(Student2[] hs) {
		System.out.println("=================�л���/      ����       �������ϱ�==============");
		System.out.println("��ȣ\t�̸�\t����\t����\t����\t����\t���");
		for (int i = 0; i < hs.length; i++) {
			System.out.println(hs[i].toString());
		}

	}

	private static Student2[] input(Scanner sc, Student2[] hs) {
		// �ο��� ��ŭ �迭�� ����� �� ������ �װ��� �����ҰŴ� //for������ �ε��� ó�� ����

		System.out.println("�Է��� �ο����� �Է��ϼ���(1~10)>");
		int inwon = inputNumber(sc, 1, 10);
		Student2[] copy =null;
		int index = 0;
		if (hs != null && hs.length >= 1) {
			inwon = inwon =hs.length;
			index = hs.length; //2�� �տ� �ְ� 3��°�� �־��ش�, �־��� �� ��ġ. (��𼭺��� �־�����)
			copy = new Student2[inwon];
			for(int i =0; i < hs.length; i++) {
				copy[i] = hs[i];
			}
		}else {
			copy = new Student2[inwon];
		}
		
		do {
			System.out.println("�̸��� �Է��ϼ���>");
			String name = inputName(sc);
			
			System.out.println("���������� �Է��ϼ���>");
			int kor = inputNumber(sc, 0, 100);

			System.out.println("���������� �Է��ϼ���>");
			int eng = inputNumber(sc, 0, 100);

			System.out.println("���������� �Է��ϼ���>");
			int math = inputNumber(sc, 0, 100);

			copy[index] = new Student2(name, kor, eng, math, ++number);
			index++;
		} while (index < inwon);
		return copy;
	}

	private static String inputName(Scanner sc) {
		String name = "";
		while (true) {
			name = sc.nextLine().trim();
			if (name.length()> 0) {
				break;
			}else {
				System.out.print("�̸��� �Է��ϼ���>");
				
			}
		}
		return name;
	}

	private static void update(Scanner sc, Student2[] hs) {
		String[] sujung = new String[] { "�̸�", "��������", "��������", "��������" };
		System.out.println("������ ��ȣ�� �Է��ϼ���>");		//������ ��� �����ֱ�
		int end = 1;
		if (hs != null && hs.length > 0) { 
			end = sujung.length; 
		}
		for (int i = 0; i < end; i++) {
			System.out.println((i + 1) + "." + sujung[i]); // ������� �տ� ���ڸ� �ٿ���
		}
		
		//�Է¹��� �� String �� �־ ����?			//������ ��ȣ�� �ε������� ã��
		int searchNo = inputNumber(sc,1,sujung.length); //�ε��� �������� ����� ��ȸ�� ��ȣ�� ���ٰ� ����ؾ���
				
		int index = -1;
				switch(searchNo) {
				case 1:
					for (int i = 0; i < hs.length; i++) {
						if (hs[i].getNo() == searchNo) {
							index = i;
					System.out.println("�̸�:");
					hs[i].setName( inputName(sc));
					
					break;}}
					
				case 2:
					for (int i = 0; i < hs.length; i++) {
						if (hs[i].getNo() == searchNo) {
							index = i;
					System.out.println("��������:");
					hs[i].setKor(inputNumber(sc,0,100 ));
					break;}}
				case 3:
					for (int i = 0; i < hs.length; i++) {
						if (hs[i].getNo() == searchNo) {
							index = i;
					System.out.println("��������:");
					hs[i].setEng(inputNumber(sc,0,100));
					break;}}
				case 4:
					for (int i = 0; i < hs.length; i++) {
						if (hs[i].getNo() == searchNo) {
							index = i;
					System.out.println("��������:");
					hs[i].setMath(inputNumber(sc,0,100));
					break;}}
					return;
				}
									//������ ����� �Է¹ޱ�				
			}

		int getIndex(Scanner sc, Student2[] hs){
			int searchNo = inputNumber(sc,1,sujung.length);
			int index = -1;
			for (int i = 0; i < hs.length; i++) {
				if (hs[i].getNo() == searchNo) {
					index = i;
		}


	private static Student2[] delete(Scanner sc, Student2[] hs) {
		
		System.out.println("����");
		return null;
	}

	private static int selectMenu(Scanner sc, Student2[] hs) {
		String[] menus = new String[] { "�Է�", "����", "����", "��ȸ", "���", "����" };
		int end = 1;
		if (hs != null && hs.length > 0) { // ��쿡 ���� end���� �������̶� ������ ����. hs�� �ʱⰪ�� null = lenth��� �Ұ�/ ������ �ƴ���!�� Ȯ��
			end = menus.length; // hs�� ��� ����ؾ� �ϴ��� ������..
		}
		printCharacter('*', 53); // ���� �� �޼���� �����(�����ð��� �ߴ�����)

		for (int i = 0; i < end; i++) {
			System.out.println((i + 1) + "." + menus[i]); // �޴� �տ� ���ڸ� �ٿ���
		}

		printCharacter('*', 53);

		System.out.print("�޴��� �����ϼ���>");

		return inputNumber(sc, 1, end); // ����ϱ� ���� ȣ��
	}

	private static void select(Scanner sc, Student2[] hs) {// �̾ȿ� ��ȣ�� �ִ��� ������ Ȯ���ϰ� ������ ����. ������ �����Ұų�, ����;
		System.out.print("��ȸ�� ��ȣ�� �Է��ϼ���>");
		int searchNo = inputNumber(sc, 1, number); // number�� ��ȸ�� �����Ҷ� ��� ���� main �Ʒ��� ��ġ�Ͽ���.
		int index = -1;
		for (int i = 0; i < hs.length; i++) {
			if (hs[i].getNo() == searchNo) {
				index = i;
				break;

			}
		}
		if (index != -1) {
			printCharacter('=', 53);
			System.out.println("\t��ȣ\t�̸�\t����\t����\t����\t����\t���");
			System.out.println(hs[index].toString());
			printCharacter('=', 53);
		} else {
			System.out.println("��ȸ�� ��ȣ�� �������� �ʽ��ϴ�.");
		}

	}

	private static void printCharacter(char c, int count) {
		for (int i = 0; i < count; i++) {
			System.out.print(c);
		}
		System.out.println();
	}

	// �޼��忡�� , ( �� ���� ������ ���� �޼ҵ� ��ȣ������ �� �����ִ��� Ȯ��
	private static int inputNumber(Scanner sc, int start, int end) { // ���⼭ start���ڿ�end���ڴ� ������� �������ֳ�,
		int input = 0;

		while (true) { // ���ѷ����� ������
			try {
				input = Integer.parseInt(sc.nextLine()); // ���ڸ� ��ǲ�� ����
				if (start <= end && input >= start) {
					break;
				} else {
					System.out.println(start + "~" + end + "������ ���ڸ� �Է��ϼ���>");
				}
			} catch (java.lang.NumberFormatException e) {
				System.out.println("���ڷ� �Է��ϼ���>");
			}
 
		}

		return input;
	}
}
