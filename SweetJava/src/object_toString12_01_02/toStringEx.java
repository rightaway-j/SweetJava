package object_toString12_01_02;

import java.io.File;

public class toStringEx {
	public static void main(String args[]) {
		File file = new File("C:\\뻐꾸기");
		String str = file.toString(); //toString 오버 라이딩 된것
		System.out.println(str);
	}
}
