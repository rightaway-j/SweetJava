package object_toString12_01_02;

import java.io.File;

public class toStringEx {
	public static void main(String args[]) {
		File file = new File("C:\\���ٱ�");
		String str = file.toString(); //toString ���� ���̵� �Ȱ�
		System.out.println(str);
	}
}
