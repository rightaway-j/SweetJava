package Collection12_02_01;

import java.util.ArrayList;

public class contains {
	public static void main(String args[]) {
		ArrayList<String> list1 = new ArrayList<String>();
		list1.add("��");
		list1.add("����");
		
		ArrayList<String> list2 = new ArrayList<String>();
		list2.add("��");
		list2.add("��");
		list2.add("����");
		list2.add("����");
		list2.add("�ܿ�");
	
			
			if(list1.contains("��")) {
				System.out.println("���� �����մϴ�");
			}else {
				System.out.println("���� �������� �ʽ��ϴ�.");
			}
			System.out.println("list1="+ list1);
			
//			list2.remove("��");
//			list2.remove("��");
//			list2.remove("����");
			
			System.out.println("list2="+ list2);
			System.out.println("=======���2.=========");
			//���2.
			//list2���� list1�� ����Ǵ� ��ҵ��� ã�� ����
			for (int i = list2.size()-1; i>= 0; i--) {
				//������ ��ü (list2.get(i))�� list1�� ���ԵǾ� �ִ��� Ȯ��
				if (list1.contains(list2.get(i))) {
					list2.remove(i);
					System.out.println("list2="+ list2);
					
				}
			}System.out.println("list1=" + list1);
			System.out.println("list2=" + list2);
			System.out.println("=======���2-1.=========");
			//���2.
			//list2���� list1�� ����Ǵ� ��ҵ��� ã�� ����
			System.out.println("list2="+ list2);
			for (int i =0 ; i<= list2.size(); i++) { //�տ��� ���� ���� //�̷������� �ڿ��� �� ����
				//������ ��ü (list2.get(i))�� list1�� ���ԵǾ� �ִ��� Ȯ��
				if (list1.contains(list2.get(i))) {
					list2.remove(i-1);
					System.out.println("list2="+ list2);
					
				}
			}System.out.println("list1=" + list1);
			System.out.println("list2=" + list2);
			
			
			System.out.println("================");
			//���3.
			//list2���� list1�� ���ѵǴ� ��ҵ��� ã�� ����
		}
}
