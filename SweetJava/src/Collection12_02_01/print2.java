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

import java.util.*;

public class print2 {
	public static void main(String[]args) {
		List<String> list = new ArrayList<String>();
		//�ڷ��߰�
				list.add("����");
				list.add("����");  	
				list.add("�ƺ�ī��");
				//��� ��� 1. = �ش� ��ü������ ����ϴ� ���
				System.out.println("===��ü������ ����ϱ�==");
				System.out.println(list);
				System.out.println(list.toString());
				
				int num = list.size(); //list�� �ִ� �������� ���� ���ϴ� �޼ҵ�
				//list�� �ִ� �������� ����ŭ �ݺ��ϸ鼭 �����͸� ������ ���
				for(int cnt = 0; cnt<num; cnt++){
					//get(index)�޼ҵ带 ����Ͽ� index��ġ�� �ִ� �ڷḦ �����´�.
					String str = list.get(cnt);
					/*
					 * get(i)�� ��ȯ���� Ovject�������� Generic���� �����߱� ������ (String)�� �����Ҽ� �ִ�.
					 * ������� ���� ��쿡�� ��ȯ���� ����������� �����ؾ��Ѵ�.
					 * String str = (String )list.get(cnt);
					 * 
					 */
					System.out.println(str);
				}
				//��¹��3. -for�� ���
				System.out.println("=====���� for�� ���======");
				for(Object a : list)
					System.out.println(a);
				
	}
}
