
/*
 * List �������̽� - Array alist (��ӹ޴� Ŭ����)
 * 1. �������� �ڷ����� Data�� ��� ������ �� �ֽ��ϴ�.
 * ex)int, double, char, boolean, String etc
 * 2.�Է��� ������� ��µȴ�.(intdex��ȣ ������ �����)
 * 3.�ߺ��� Data�� ������ �� �ִ�.
 * 4. ������ ���� ������ �̿��Ҽ� �ִ�.(add()/ remone())
 * 
 */
package Collection12_02_01;

import java.util.*;

public class arrayList {
	public static void main(String args[]) {
		//��ĳ����(������� �޼ҵ常 ��밡��)
		//List list = new ArrayList();//���� ������� ������ �� ���� �� �ִ�.
		ArrayList list = new ArrayList();
		
		//�ڷ��߰�
		list.add("�ϳ�");//autdboxing �Ǵ°�, integer.parseInt();
		list.add(2); //list.add(Integer.valueOf(2));
		list.add(false);
		list.add(3.42);
		list.add("��");
		list.add("five");
		list.add('A');
		
		System.out.println(list); //list�� ��� ������ ���
		System.out.println(list.toString()); //�������̵� �Ǵ��� Ȯ��(@�� �ȳ����� �������̵� �� �Ȱ�)
		
		//size(): �������� ���� ���ϴ� �޼ҵ�
		System.out.println("�������� ���� = " + list.size());
		
		//get(index):�ش� �ε����� ������ �������� �޼ҵ�
		//get(3): 0���� ����, index =3 �� ������ ����ض�
		System.out.println("list.get(3)=" + list.get(3));
		System.out.println("list.get(1)=" + list.get(1));
		
		//�Ʒ� ���� ������ �ּ���
		int i = (Integer)list.get(1); //int i = ((Integer)list.get(1)).intValue();�� �ڵ����� �̷���� (��ĳ���� �ٿ�ĳ����)
		System.out.println("list.get(1)=" + i);
		
		i = (int)list.get(1); //i = ((Integer)list.get(1)).intValue();
		System.out.println("list.get(1)" + i);
		
		
		
		//��� ��� 1. = �ش� ��ü������ ����ϴ� ���
		System.out.println("===��ü������ ����ϱ�==");
		System.out.println(list);
		System.out.println(list.toString());
		
		//��¹�� 2. - get()�޼ҵ� �̿��
		System.out.println("===get()�޼ҵ� �ƿ��==");
		for ( i = 0; i < list.size(); i++) {
			System.out.println(i + "��° ���" + list.get(i));
		}
		System.out.println("===========");

		for ( i = 0; i< list.size(); i++) {
			Object s = list.get(i); //get()�޼ҵ��� ��ȯ���� Object��
			System.out.println(s);
		}
		//��¹��3. -for�� ���
		System.out.println("=====���� for�� ���======");
		for(Object a : list)
			System.out.println(a);
		//��¹�� 4 - Iterator�������̽� ���: �ݺ���
		System.out.println("===Iterator�������̽� ���===");
		
		Iterator elements = list.iterator();
		//hasNext():�о�� ��Ұ� �ִ��� Ȯ���Ѵ�.
		while(elements.hasNext()) {
			System.out.println(elements.next());
			//next()�޼ҵ带 �̿��ؼ� ���ʴ�� �Ѱ��� ������ �����´�.
		}
		
		
	}

}
