package Array;

import java.util.Scanner;

public class test_array_string02solve {
	public static void main(String args[]) {
		String names[] = { "ȫ�浿", "�̼���", "ȫ�浿 ", "�������", "��浿" };

		Scanner sc = new Scanner(System.in); // Scanner���� ctrl shift o
		int index = -1;// ����濡 ����ִ��� Ȯ���ϴ� ������ �ʱⰪ-1�� �ε����� ��ġ�� �ʴ� ���� ����մϴ�.

		System.out.println("�˻��� �̸��� �Է��ϼ���>");
		System.out.println("�̸�:");
		String inputname = sc.next();

		for (int i = names.length - 1; i >= 0; --i) { //�ε����� 0���� ���ϱ� i=4,3,2,1,0���� �����/�ڿ������� ã�°� ��������.
			if (inputname.equals(names[i])) {
				index = i;// ������ �ε��� ��ġ���� ���� �Է��� �̸��� ���� �̸��� ã�´�
				break;// �Է��� �̸������� �̸��� ã���� �ݺ��� �����.
			}
		}
		// �Է��� �̸��� �迭�� �̸��� ã������
		if (index != -1) {
			System.out.println(inputname + "�� �迭�� index=" + index + "�濡�� ã�ҽ��ϴ�.");
		} else//ã����������
			
			System.out.println(inputname + "�� �迭���� ã�� ���߽��ϴ�.");

		sc.close();
	}
}
