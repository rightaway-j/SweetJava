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
public class LinkedListEx2 {
	public static void main(String args[]){
		//Linkedlist ��ü�� ����
		LinkedList<String> list = new LinkedList<String>();
		list.add("grape");
		list.add("strawbarry");
		list.add("peach");
		int num = list.size();
		for(int cnt = 0; cnt <num; cnt++) {
			String str = list.get(cnt);
			System.out.println(str);
			
		}
	}

}
