package exception_try_chatch12_01_01;

public class exceptionExample3 {
	public static void main(String args[]) {
		int num1 = 3, num2 = 0;
		try {
			
			int result = num1 / num2;
			System.out.println(result);
		}catch (java.lang.ArithmeticException e) { //�������� ���� �ٿ����� ���� �ƹ�����(e) �Է����ش�
			System.out.println("0���� ������ ������~");
			//ArithmeticException��ü�� �ִ� ���� �޽����� �����´�.
			String message = e.getMessage();
			System.out.println(message);
		}
	}
}
