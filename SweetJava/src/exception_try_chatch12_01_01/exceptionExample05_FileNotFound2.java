package exception_try_chatch12_01_01;

import java.io.*; //io��Ű���� �ִ� ���� ����Ѵ� *

public class exceptionExample05_FileNotFound2 {
	public static void main(String args[]) {
		FileReader reader = null; // runtime�� �߻��� ����//null�� �����߻� ��Ӱ��� �����ؼ� ���� ó�� //null�ε� ����Ű�� ���� ��� �� ����

		try {
			reader = new FileReader("some.txt");// �Է��� �޾Ƶ����� ���� �����߻����� ��ü���� �Ұ�.
		} catch (IOException e) {
			System.out.println("����� ������ �߻��߽��ϴ�.");

		} finally {
			try {

				if (reader != null)
					reader.close();
			} catch (IOException e) {
				System.out.println("���� �ݴ� �� ���� �߻��߽��ϴ�");
			}
//				reader.close();
//			} catch (IOException e) {
//				e.printStackTrace();
//			} catch (Exception e) { //runtime�� �߻��� ���� �̱� ������ ��Ӱ����� �����ִ� Exception�� �����
//					System.out.println("���� �ݴ� �� ���� �߻��߽��ϴ�");
//					
//			}
		}
	}
}
