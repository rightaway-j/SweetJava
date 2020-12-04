package Wrapper12_01_07;

import java.util.ArrayList;
import java.util.Scanner;
//���� �������൵ ������ ������ ����� , �װ� �����ϱ� ���� data base����Ѵ�.
public class student2_main_solve4_arraylist12_03 {
	public static int number; //

	public static void main(String args[]) {
		ArrayList<Student2_ArrayList> hs = new ArrayList<Student2_ArrayList>();// �ʱⰪ�� �����ʾƵ� �ȴ� null�� �迭������ �ѵ� ����ϴ� �ʱ�ȭ
		Scanner sc = new Scanner(System.in);
		 // �޾�� ��ü�� �־���ϴ� �� ���̽����� �ٲ���� �����Ҽ� �ֵ��� �������
		do {
			int menu = selectMenu(sc, hs);//1
			switch (menu) {
			case 1:
				 input(sc, hs);//��ȯ���� ������ hs.= �� �����
				break;
			case 2:
				update(sc, hs);
				break;
			case 3:
				 delete(sc, hs);
				break;
			case 4:
				select(sc, hs);
				break;
			case 5:
				Student2_ArrayList.sort(hs);
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

	private static void print(ArrayList<Student2_ArrayList> hs) {
		System.out.println("=================�л���/      ����       �������ϱ�==============");
		System.out.println("��ȣ\t�̸�\t����\t����\t����\t����\t���");
		for (int i = 0; i < hs.size() ; i++) { //ArrayList���� size�� ��� ����?
			System.out.println(hs.get(i).toString());
		}

	}

	private static void input(Scanner sc, ArrayList<Student2_ArrayList> hs) {
		// �ο��� ��ŭ �迭�� ����� �� ������ �װ��� �����ҰŴ� //for������ �ε��� ó�� ����

		System.out.println("�Է��� �ο����� �Է��ϼ���(1~10)>");
		int inwon = inputNumber(sc, 1, 10);
		int index = 0;

		do {
			System.out.println("�̸��� �Է��ϼ���>");
			String name = inputName(sc);

			System.out.println("���������� �Է��ϼ���>");
			int kor = inputNumber(sc, 0, 100);

			System.out.println("���������� �Է��ϼ���>");
			int eng = inputNumber(sc, 0, 100);

			System.out.println("���������� �Է��ϼ���>");
			int math = inputNumber(sc, 0, 100);

			hs.add(new Student2_ArrayList(name, kor, eng, math, ++number)); //������� �͵��� add�� �־ ���
			
		} while (++index < inwon);
	
	}

	private static String inputName(Scanner sc) {
		String name = "";
		while (true) {
			name = sc.nextLine().trim();
			if (name.length() > 0) {
				break;
			} else {
				System.out.print("�̸��� �Է��ϼ���>");

			}
		}
		return name;
	}

	private static int getIndex(Scanner sc, ArrayList<Student2_ArrayList> hs){ 
		int searchNo = inputNumber(sc,1, number);
		
		for (int i = 0; i < hs.size(); i++) {
			if (searchNo == hs.get(i).getNo()) { //i => ���° �ִ��� Ȯ��
				
				return i;//���ϴ� i �� ã���� ����  //if (index == -1) { System.out.println("������ ��ȣ�� �������� �ʽ��ϴ�.");}	
			}
		}
		return -1;//������ ���ϴ� ���� ������ �����ͼ� -1����//indexOf���� ���ϴ� �� ������ -1retrun�ϴ� �Ͱ� ����
	}
	private static void update(Scanner sc, ArrayList<Student2_ArrayList> hs) {
		
		System.out.println("������ ��ȣ�� �Է��ϼ���>");	
		int index = getIndex(sc, hs);
		
		if (index == -1) { 
			System.out.println("������ ��ȣ�� �������� �ʽ��ϴ�.");	
		}else {
			while (true) {
				int updateItem = getUpdateItem(sc);
				switch(updateItem) {
				case 1:
					System.out.print("�̸��� �Է��ϼ���>");
					hs.get(index).setName(inputName(sc));
					break;
					
				case 2:
				System.out.print("���� ������ �Է��ϼ���>");
					int kor = inputNumber(sc, 0, 100);
					hs.get(index).setKor(kor);
					break;
					
				case 3:
					System.out.print("���� ������ �Է��ϼ���>");
					int eng = inputNumber(sc, 0, 100);
					hs.get(index).setEng(eng);
					break;
					
				case 4:
					System.out.print("���� ������ �Է��ϼ���>");
					int math = inputNumber(sc, 0, 100);
					hs.get(index).setMath(math);
					break;
					
				case 5:
					return;
				}
			}
			
			
		}
		
	}

	private static int getUpdateItem(Scanner sc) {
		String[] items = {"�̸�", "����", " ����", "����", "����"};
		int count=1; // items�տ� ���� ������� �Է��ϴ� ��
		for(String item: items) {
			System.out.println(count++ +"."+ item);
		}
		System.out.print("������ �׸��� �����ϼ���>");
		return inputNumber(sc, 1, items.length);
	}

	private static void delete(Scanner sc, ArrayList<Student2_ArrayList> hs) {

		System.out.println("������ ��ȣ�� �Է��ϼ���>");
		int index = getIndex(sc, hs);
		
		if (index != -1) {
		Student2_ArrayList.korTotal -= hs.get(index).getKor(); //������ ���� ��Ż���� ����� ��
		Student2_ArrayList.engTotal -= hs.get(index).getEng();
		Student2_ArrayList.mathTotal -= hs.get(index).getMath();
		}else {
			System.out.println("������ ��ȣ�� �������� �ʽ��ϴ�.");
		}
	}

	private static int selectMenu(Scanner sc, ArrayList<Student2_ArrayList> hs) {
		String[] menus = new String[] { "�Է�", "����", "����", "��ȸ", "���", "����" };
		int end = 1;
		if (hs != null && hs.size() > 0) { // ��쿡 ���� end���� �������̶� ������ ����. hs�� �ʱⰪ�� null = lenth��� �Ұ�/ ������ �ƴ���!�� Ȯ��
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

	private static void select(Scanner sc, ArrayList<Student2_ArrayList> hs) {// �̾ȿ� ��ȣ�� �ִ��� ������ Ȯ���ϰ� ������ ����. ������ �����Ұų�, ����;
		System.out.print("��ȸ�� ��ȣ�� �Է��ϼ���>");
		int index = getIndex(sc,hs);
		
		
		if (index != -1) {
			printCharacter('=', 53);
			System.out.println("\t��ȣ\t�̸�\t����\t����\t����\t����\t���");
			System.out.println(hs.get(index).toString());
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
