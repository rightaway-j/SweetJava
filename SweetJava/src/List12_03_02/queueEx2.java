package List12_03_02;

import java.util.*;
import java.util.Queue;

/*
 *ť(Queue)�������̽�
 *- LinkedList(Queue�������̽��� ������ Ŭ����)�����
 *-FIFO(First Input First Output)����
 *���� �Էµ� �ڷᰡ ���� ��µǴ� ����
 */
public class queueEx2 {
	 public static void main(String args[]) {
		 //ť�� ����� LinkedList��ü�� �����Ѵ�.
		 // LinkedList<Strin> queue = new LinkedList<String>();
		 Queue<String>queue = new LinkedList<String>();
		 System.out.println("�������?"+ queue.isEmpty());//true-������� �Ǵ�
		 
		 //offe()�޼ҵ� : ť�� 3���� �����͸� �߰�
		 queue.offer("rabbit");
		 queue.offer("deer");
		 queue.offer("lion");
		 
		 //peek() �޼ҵ�: ó�� �����͸� �״�� �� ���·� �����´�.
		 System.out.println(queue.peek());
		 System.out.println("�������?"+queue.isEmpty());//false-������� �Ǵ�
		 System.out.println("����=" + queue.size());
		 
		 System.out.println("poll()���");
		 while(!queue.isEmpty()) {
			 //poll()�޼ҵ�� �� �ִ� �����͸� �����ϸ鼭 �����´�
			 String str= queue.poll();
			 System.out.
			 
			 println(str);
		 }
		 System.out.println("�������?"+ queue.isEmpty());//true������� �Ǵ�
	 }//���ÿ� �־����� �������� �ݴ�� ��µ�

}
