package exception_try_chatch12_01_01;
//unchecked exception�� ������ �޼ҵ� 	unchecked = ���� ó�� ����
//throws ���� ���  try~catch ������ ���� ó�� ����
// ������ 0���� ������ ���� �����Ǿ� ArithmeticException �߻�
public class exception {
	public static void main(String args[]) {
		try {
		int result = devide(3,0);
		System.out.println(result);
		}catch(Exception e) {
			System.out.println("�����߻�");
		}
		
	}
	static int devide(int a, int b) {
		int result = a/b ;
		return result;
	}
}
