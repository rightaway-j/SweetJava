package Wrapper12_01_07;
//�������� �⺻���� ����ȯ�� ���Ѱ�
//WrapperŬ������ ��� ��
public class boxing_unboxing {
	public static void main(String arg[]) {
		//��� = �⺻�� Ÿ���� ���� ��ü�� ��ȯ
		//int => Integer
		Integer obj1 = new Integer(12); // Integer��ü�� ����
		Integer obj2 = new Integer(7);
		
		//��ڽ� = ��ü�� �⺻�� Ÿ���� ������ ��ȯ
		//Integer => int
		int n1 = obj1.intValue ();
		int n2 = obj2.intValue();//Integer��ü �ȿ� int���� ������
		int sum = n1 + n2;
		System.out.println(sum);
		
		//String -> Integer
		Integer n02 = new Integer("20");// �ڽ��� �ƴϴ�. "20"�� ���ڿ��� �⺻���� �ƴϱ� ������
		
		//Integer => int
		int n3 = n02.intValue();//��ڽ� �̷����, �̰����� ����ȯ�� �̷����
		sum = n1 + n2 + n3;
		System.out.println(sum);
		Integer n03= new Integer("a20");//���� �߻� //��Ÿ���� �߻��ϴ� ����
				
	}

}
