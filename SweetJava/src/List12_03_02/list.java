
package List12_03_02;

public class list {
	public static void main(String args[]) {
		System.out.println("=======���2.=========");
	//���2.
	//list2���� list1�� ����Ǵ� ��ҵ��� ã�� ����
	for (int i = list2.size()-1; i>= 0; i--) {
		//������ ��ü (list2.get(i))�� list1�� ���ԵǾ� �ִ��� Ȯ��
		if (list1.contatins(list2.get(i))) {
			list2.remove(i);
			System.out.println("list2="+ list2);
			
		}
	}System.out.println("list1=" + list1);
	System.out.println("list2=" + list2);
	
	System.out.println("================");
	//���3.
	//list2���� list1�� ���ѵǴ� ��ҵ��� ã�� ����
	}
}
