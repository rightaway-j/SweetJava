package List12_03_02;

import java.util.Stack;

/*
 * Generic ���
 * java.an.Object
 * 
 * ����(Stack)Ŭ����:
 * 1. LIFO(Last Input First Output) ����
 * ���������� �Էµ� �ڷᰡ ���� ���� ��µǴ� ����
 * 2. �������� �ڷ����� Data�� ��� ������ �� �ִ�.
 */
public class queueEx {
public static void main(String[]args) {
	//Stack ��ü ����
	Stack<String> s = new Stack<String>();
	System.out.println("�������?"+ s.empty());//true - ������� �Ǵ�
	
	//Stack�� ���� ����
	s.push("���ƿ�");
	s.push("java");
	
	System.out.println("�������?" + s.empty());//false:������� �Ǵ�
	//������ ������ �������� �޼ҵ�
	System.out.println("�� ������ ������:" + s.peek());//������ ������ Ȯ��
	
	//Stack�� ���� ���
	while(!s.empty()) {
		System.out.println("������ ���:" +s.pop());//�����ͼ� ��� �Ǵ� ����ġ���� ���������
		System.out.println("���� ������ ����:" + s.size());
		
	}
	System.out.println("�������?"+ s.empty());//true-������� �Ǵ�
}
}
