/*
 * Generic ���
 * 
 * Vector Ŭ���� - ArrayList�� ������
 * 					ArrayList�� ���� ���, �� �߿��� ArrayList�� �� ���� ���
 * 1.�������� �ڷ����� Kata�� ��� ������ �� �ִ�.
 * ex)int, double, char, boolean, String etc
 * 2.�����ִ� ��,��� ó�� (index��ȣ ������ �����)
 * 3.�ߺ���Data�� ������ �� �ִ�.
 * 4.����� ����� �پ�(���������� ��� ����)
 * 5. ������ ����ȭ�� �ϱ� ������ ���� ������ ó�������� ArrayList�� LinkedList���� ������ �������ϴ�.
 * ����> ����ȭ�� �����忡�� �����ڿ��� �۾��� ��ġ�� �� ������ �ٸ� �����忡�� �������� �������� ���ϰ� ����ϴ°�
 */
package List12_03_02;
import java.util.*;
public class VectorEx { 
	public static void main(String args[]) {
	Vector<String> vec = new Vector<String>(); //String���� �� �� �ִ�.
	vec.add("Apple");
	vec.add("banana");
	vec.add("oRANGE");
	
	String temp;
	for(int i = 0; i<vec.size(); i++) {
		temp=vec.get(i); //get�ؼ� ��ư����� �Դ�.
		System.out.println(temp.toUpperCase());
		System.out.println(temp.toLowerCase());
		System.out.println("==========");
		
		/*
		 * get(i) �� ��ȯ���� Object�������� Generic ���� �����߱� ������
		 * (String)�� ������ �� �ִ�.
		 * temp = (Stribg)vec.get(i);
		 * Generic �� ������� ���� ��쿡�� ��ȯ���� ��������� �����ؾ��Ѵ�.
		 */
	}
	
	}

}
