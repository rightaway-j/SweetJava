package Collection12_03_;

public class Casting3 {
	public static void main(String args[]) {
		//int -> char (����� ����ȯ)
		int i3 = 97;
		char c1 = (char) i3;
		System.out.println("i3 ����Ÿ�� " + i3 + "�Դϴ�.");
		System.out.println("c1 �����ʹ� " + c1 + "�Դϴ�.");
		
		i3 = 65;
		c1 = (char)i3;
		System.out.println("i3 ����Ÿ��" + i3 + "�Դϴ�.");
		System.out.println("c1 ����Ÿ��" + c1 + "�Դϴ�.");
		
		i3='A'; //�����ڵ� '��'�� �ش��ϴ� ���� ������ ����  i3�� �����϶�
		System.out.println("i3='A'����Ÿ��" + i3 + "�Դϴ�.");
		i3='��';
		System.out.println("i3='��'����Ÿ�� " + i3 + "�Դϴ�.");
		
	
	}

}
