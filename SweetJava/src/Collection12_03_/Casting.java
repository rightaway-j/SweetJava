package Collection12_03_;

public class Casting {
	public static void main(String args) {
		//������ ���� il�� 10�� �����Ѵ�.
		int i1=10;
		
		// �ڵ� ����ȯ�� ������ ���� �����ϰų� �޼����� ���ڰ��� �Ű������� ���޵� ��
		//��ġ���� ���� �ڷ����� ��� �����Ϸ��� �ڵ����� ����ȯ�� ���ִ� ���̴�.
		//double d1 = (double)i1;
		double d1=i1; //�Ǽ��� ������ ������ ���� ������ �� �ִ�.
		System.out.println("d1����Ÿ�� " + d1 + "�Դϴ�.");
		
		double d2=10.12345;
		//�����߻�
		// int i2 = d2;//������ ������ �Ǽ��� ���� ������ �� �����ϴ�.
		
		//����� ����ȯ
		int i2 = (int) d2;
		System.out.println("i2����Ÿ��  "+ i2 +"�Դϴ�.");
		
		
	}
}
