package exception_try_chatch12_01_01;

public class Throw {
	public static void main(String args[]) {
		int result = add(1, -2);
		System.out.println(result);

	}
									//���� ����=�ڽ��� �ذ� ���ϰ� ȣ���� ������ ���ѱ�
	static int add(int a, int b) throws Exception { //main ���� add()�޼��� ��뿡 �����߻��ϴ� ���� ����ϸ� Exception�̶�� ���� �߻��ҰŴ�
													//�̷��� �����ϰ� �ڽ��� ȣ����  main���� ���ѱ��
													//���ƿ� ������ �� main��  try/catchȤ�� (String args[]) throws Exception
													//�����Ͽ� ���󿡰� ���ѱ��(jvm�� ó��)
		int result = a + b;
		if (result < 0)
			throw new Exception("�����߻�"); //�� �������� �̷��� ���� �����ض�.
		return result;
	}
}
