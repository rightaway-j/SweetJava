/*
 * LinkedList ��뿹
 *LinkedList��  ArrayList�� ���̤���
 *- �������� �߰� �Ǵ� ������ ArrayList ���� �ӵ��������ϴ�.
 *ArrayList�� ��� ���ʴ�� �����͸� �߶��ϰ�
 *�������������� �����͸� �����ϴ� ���� LinkedList���� �����ϴ�.
 *������ �߰��� �����͸� �߰��Ϸ��� ���ڸ��� ����� ���� �ٸ� �����͸� ���ϻ��� �̵��ؾ� �ϰ�
 *������ ��쿡�� ���͸� ���ġ���� ������
 *LinkedList�� ��쿡�� �� ��Ұ� ���Ḹ �������ָ� �Ǳ� ������ ó���ӵ��� ����� �����ϴ�.
 *-�˻���ArrayList�� ���������� �޸𸮻� �����ϱ� ������ /ã�µ� �������� �ҿ���������
 *��ġ��LinkedList�� ó������ ���ʴ�Ƿ� ���󰡾� ���ϴ� ���� ���� �� �վ� �˻��ð��� �����ϴ�.
 */
package List12_03_02;

import java.util.*;

public class LinkedListEx {
	public static void main(String args[]) {
		// Linkedlist ��ü�� ����
		LinkedList<String> list = new LinkedList<String>();
		list.add("grape");
		list.add("strawberry");
		list.add("peach");
		list.add("kiwi");
		pLinkedList(list);

		list.set(0, "orange");
		pLinkedList(list);

		list.remove(1);
		pLinkedList(list);

		list.remove("kiwi");
		pLinkedList(list);

	}

	private static void pLinkedList(LinkedList<String> list) {
		System.out.println("==========================");
		// iterator() �޼ҵ带 ȣ���Ͽ� Iterator��ü�� ��´�
		Iterator<String> iterator = list.iterator();

		// Iterator��ü�� �̿��Ͽ� list�� �ִ� �����͸� ������� �����ͼ� ���
		while (iterator.hasNext()) { // ���� ��ġ���� ���� �����Ͱ� �ִ��� Ȯ���ϴ� �޼ҵ�
			String str = iterator.next();// ���� �����͸� �������� �޼ҵ�
			System.out.println(str);
		}

	}
}
