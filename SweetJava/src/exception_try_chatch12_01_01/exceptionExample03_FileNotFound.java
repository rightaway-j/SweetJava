package exception_try_chatch12_01_01;

import java.io.*; //io패키지에 있는 모든걸 사용한다 *

public class exceptionExample03_FileNotFound {
	public static void main(String args[]) {
		try {
			FileReader reader = new FileReader("some.txt");
			reader.close();

		} catch (FileNotFoundException e) { // FileNotFoundException ->자손 IOException=>부모 상속관계이므로 자손부터 순서지켜서 catch문으로 해결
			System.out.println("파일을 찾을 수 없습니다.");
//			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("입출력 에러가 발생했습니다.");
			// e.printStackTrsace();
		} // 이미 부모 IOException에서 자식 FileNotFoundException도 처리할 수 있기 때문에 이부분이 필요없다.
	}
}
