package exception_try_chatch12_01_01;

import java.io.*; //io��Ű���� �ִ� ���� ����Ѵ� *

public class exceptionExample03_FileNotFound {
	public static void main(String args[]) {
		try {
			FileReader reader = new FileReader("some.txt");
			reader.close();

		} catch (FileNotFoundException e) { // FileNotFoundException ->�ڼ� IOException=>�θ� ��Ӱ����̹Ƿ� �ڼպ��� �������Ѽ� catch������ �ذ�
			System.out.println("������ ã�� �� �����ϴ�.");
//			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("����� ������ �߻��߽��ϴ�.");
			// e.printStackTrsace();
		} // �̹� �θ� IOException���� �ڽ� FileNotFoundException�� ó���� �� �ֱ� ������ �̺κ��� �ʿ����.
	}
}
