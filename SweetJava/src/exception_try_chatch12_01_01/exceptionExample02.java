package exception_try_chatch12_01_01;

public class exceptionExample02 {
	public static void main(String args[]) {
		try {								//�޾ƿ� �������� try chtch�� �̾��ش�
			
			int result = add(1, -2);
			System.out.println(result);
		} catch (Exception e) {
			System.err.println("���� �߻��߽��ϴ�.");
		}
	}

	static int add(int a, int b) throws Exception {//���� �߻��� �̰��� �߻���Ų ������ ��������
		int result = a + b;
		if (result < 0)
			throw new Exception("�����߻�"); //
		return result;
	}
}
