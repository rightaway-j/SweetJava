package HashMap12_03_03;
import java.util.*;
public class Hashset {
/*
 * Set  �������̽�
 * 	- HashSet (��ӹ޴� Ŭ����): ���������� HashMap�� �̿��ؼ� �����������
 * 	HashSet�̶� �̸��� �ؽ��� �̿��ؼ� �����߱� ������ �ٿ��� ���̴�.
 * - TreeSet �� ���� �˻� Ʈ��(binary search tree)��� �ڷᱸ���� ���·� �����͸� �����ϴ� �÷��� Ŭ�����Դϴ�.�����̵ȴ�.
 * 1.�������� �ڷ���(�⺻�ڷ��� ������ ��� ) �� Data�� ��� ���尡��
 * ex) int,couble, char, boolean,String etc
 * 2.���� ���� ��, ����Ѵ�.
 * 3. �ߺ���Data�� �������� ���մϴ�.
 * �� �ε� ��ȣ 6���� �ߺ����� �ʰ� �ϴ� ���α׷��� �̿�
 * 
 * 4. ������ ��ü���� �Ǻ���:
 * hashCode()�� ���ϰ��� �ٸ��� �ٸ� ��ü�� �ν��� �����մϴ�.
 * hashCode()�� ��õ���� ������ equals()�޼����� ���ϰ����� �Ǻ�
 * equals(0�޼����� ���ϰ��� true�̸� ���� ��ü�� �ν��ϸ� ���� ���� �ʰ�
 * �ٸ��� �ٸ� ��ü�� �ν��ؼ� ����;.
 * ���) ���� ��ü�� �ν��ϱ� ���� hashCode()��equals()�� �������ؾ��Ѵ�.
 */
	public static void main(String args[]) {
		//HashSet��ü����
		HashSet<String>set = new HashSet<String>();
		//������ ����
		set.add("�ڹ�");
		set.add("īǪġ��");
		set.add("����������");
		set.add("�ڹ�");
		System.out.println("����� �������� ��="+ set.size());
		
		//set ��ü�� �����ϰ� �ִµ����� ��ü ���
		System.out.println(set);
		
		//iterator():set�� �ִ� �����͸� ��� �����ɴϴ�.
		Iterator<String>iterator = set.iterator();
		while (iterator.hasNext()) {
			String str = iterator.next();
			System.out.println(str);
			
			
		}
	}
}
