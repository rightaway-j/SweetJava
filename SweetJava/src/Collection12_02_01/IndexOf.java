/*
 * ArrayList�� �ִ� ������ �˻��ϴ� ��
 * -indexOf(data):���ڿ� ���� ���� ���� ù ��° �����͸� ã�Ƽ� �� ��ġ�� �ε����� ����
 * -lastIndexOf(data): ���ڿ� ���� ���� ���������� ������� �����͸� ã�Ƽ� ����ġ�� �ε����� ����
 * - ���ڿ� ���� ���� ������ -1�� ����
 */
package Collection12_02_01;

import java.util.ArrayList;

public class IndexOf {
	public static void main(String args[]) {
		ArrayList<String>list = new ArrayList<>();
		list.add("�ӷ�"); list.add("���");
		list.add("�޵�"); list.add("�ڵ�");
		list.add("���");
		int index1 = list.indexOf("���");
		int index2 = list.lastIndexOf("���");
		System.out.println("ù��° ���:"+ index1);
		System.out.println("������ ���:"+index2);
	}
}
