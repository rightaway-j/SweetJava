package exception_try_chatch12_01_01;

import java.io.*; //io��Ű���� �ִ� ���� ����Ѵ� *

public class exceptionExample04_FileNotFound {
	public static void main(String args[]) {
		FileReader reader = null;

		try {
			reader = new FileReader("some.txt");//�Է��� �޾Ƶ��������� �����߻�, reader�� ���� null

		} catch (IOException e) {
			System.out.println("����� ������ �߻��߽��ϴ�.");
			//FileNotFoundExeption �� IOException�� ���� Ŭ������ FileNotFoundException�� ���� �� �ִ�.
		} finally {
			try {		//
				reader.close();
			} catch (IOException e) { 
				e.printStackTrace();
			} // reader�� ��ü �������� �ν� �� �� �ֵ��� �ʵ� �κп� �ۼ����ְ� null�� �ʱ�ȭ.
		}
	}
}
