package exception_try_chatch12_01_01;
//unchecked exception�� �ش� - ������ ���� ����
//����� ���� �߻� - ���� �߻� (java.lang.ArithmeticException)
public class exceptionExample_unchecked {
	public static void main(String args[]) {
		int num1 = 3, num2 = 0;
		int result = num1 / num2;
		System.out.println(result);
	}
}
