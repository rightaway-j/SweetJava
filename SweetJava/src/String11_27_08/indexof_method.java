package String11_27_08;

public class indexof_method {
	public static void main(String args[]) {
		String message = "Java program creates many objects.";
		

		// ������ ���ڰ� ���ʷ� ��ġ�� �ε����� ���Ѵ�.
		// �������� �ʴ� ��� -1�� �����Ѵ�.
		// ���ڿ� �տ��� ���� ���ʴ�� �˻��Ѵ�
		
		int index1 = message.lastIndexOf('a');
		System.out.println("a�� ��ġ��" + index1);

		// �ƽ�Ű�ڵ� 97�� �ҹ���'A'
		int index2 = message.lastIndexOf(97);
		System.out.println("A�� ��ġ��" + index2);

		// index��ȣ 13��°���� 'a'�� ã���ϴ�.
		int index3 = message.lastIndexOf('a', 13);
		System.out.println("13������ a�� ��ġ��" + index3);
		
		// index��ȣ 13��°���� 'a'�� ã���ϴ�.
		int index33 = message.lastIndexOf('a', 13);
		System.out.println("13������ a�� ��ġ��" + index33);
		
		int index4 = message.lastIndexOf("av");
		System.out.println("av�� �����ϴ� index��" + index4);
		
		int index5 = message.lastIndexOf("man", 12);
		System.out.println("12��°���� man��ġ��" + index5);
		
		
		int index6 = message.lastIndexOf("java");
		System.out.println("java����ġ��" + index6);
	}
}
