/*1.���׸���(Generics)jdk 1.5���� ó�� ����
 * �پ��� Ÿ���� ��ü���� �ٷ�� �޼ҵ峪 �÷��� Ŭ������ ������ ���� Ÿ��üũ�� ���ִ� ���
 * 2.Ŭ���� ���� ����(<>)��ȣ�� �̿��ؼ� �����
 * 	1)<>�ȿ� Ư�� �ڷ���(WrapperŬ����, String, ����� ���� Ŭ������ - ������)�� �־��ָ� �ȴ�
 * 	2)Api���� ǥ��
 * 		Class ArrayList<E>: E��Array List��� �д´�
 * 		-ArrayList :����Ÿ��(raw type)
 * 		-E (���� �Ű� ����) : ��ȣ�� ������ �ٸ� �� ������ ������ Ÿ���� �ǹ�
 * 
 * 		����: �ǹ�
 * E:����(Element)
 * K:Ű(key)
 * T:Ÿ��(Type)
 * V:��(Value)
 * 
 * 
 * ��뿹)
 * 		List<String> 		list = new ArrayList<String>();
 * 		ArrayList<String> list = new ArrayList<String>();
 * 		ArrayList<Integer> list = new ArrayList<Integer>();
 * 		ArrayList<Double> list = new ArrayList<Double>();
 * 		ArrayList<MemberInput> list = new ArrayList<MemberInput>();
 * 		
 */
package Collection12_02_01;

import java.util.ArrayList;
import java.util.List;

public class print {
	public static void main(String[]args) {
		List<String> list = new ArrayList<String>();
		//�ڷ��߰�
				list.add("�ϳ�");
				list.add(2);  	//���� �߻� -String�� �ƴ�
				list.add(false);//���� �߻� -String�� �ƴ�
				list.add(3.42);//���� �߻� -String�� �ƴ�
				list.add("��");
				list.add("five");
				list.add('A');//���� �߻� -String�� �ƴ�
	}
}
