package exception_try_chatch12_01_01;

public class exception_final {
	public static void main(String args[]) {
		int num1 = 3, num2 = 0;
		
		try {
			int result = num1/ num2;
			System.out.println(result);
		}catch (ArithmeticException e) {
			String message = e.getMessage();	//���� �߻��ϴ� ���� �����ͼ�
			System.out.println(message);		//��� ==> / by zero
		}finally {								
			System.out.println("������� �Ծ��~");
		}
	}
}
