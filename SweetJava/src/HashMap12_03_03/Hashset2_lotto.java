package HashMap12_03_03;
import java.util.*;
public class Hashset2_lotto {
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
 */
	public static void main(String args[]) {
		//HashSet��ü����
		HashSet<String>set = new HashSet<String>();
	
		int num;
		
		num = (int) (Math.random() * 10);
		System.out.println(num);
		
		for (int n = 0; n < 6; n++) {
			num = (int) ((45 - 1 + 1) * Math.random() + 1); // n���� for���� 6�� ������ �� 6�� ���� ���ȿ� num ������ ���� 6�� ����
			System.out.print(num + " ");
			set.add(Integer.toString(num));
			if (!(set.size() == 6));
			else		
				break;
				}
		
		
	}
	
}
