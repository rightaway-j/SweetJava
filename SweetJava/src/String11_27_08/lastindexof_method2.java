package String11_27_08;

public class lastindexof_method2 {
	public static void main(String args[]) {
		String message = "Java program creates many objects.";
		String message2 = "Java program creates many objects.";

		// ������ ���ڰ� ���ʷ� ��ġ�� �ε����� ���Ѵ�.
		// �������� �ʴ� ��� -1�� �����Ѵ�.
		// ���ڿ� �տ��� ���� ���ʴ�� �˻��Ѵ�
		
		int index1 = message.indexOf('a');
		System.out.println("a�� ��ġ��" + index1);

		// �ƽ�Ű�ڵ� 97�� �ҹ���'A'
		int index2 = message.indexOf(97);
		System.out.println("A�� ��ġ��" + index2);

		// index��ȣ 13��°���� 'a'�� ã���ϴ�.
		int index3 = message.indexOf('a', 13);
		System.out.println("13������ a�� ��ġ��" + index3);
		
		// index��ȣ 13��°���� 'a'�� ã���ϴ�.
		int index33 = message2.indexOf('a', 13);
		System.out.println("13������ a�� ��ġ��" + index33);
		
		int index4 = message2.indexOf("av");
		System.out.println("av�� �����ϴ� index��" + index4);
		
		int index5 = message2.indexOf("man", 12);
		System.out.println("12��°���� man��ġ��" + index5);
		
		
		int index6 = message2.indexOf("java");
		System.out.println("java����ġ��" + index6);
	}
}
