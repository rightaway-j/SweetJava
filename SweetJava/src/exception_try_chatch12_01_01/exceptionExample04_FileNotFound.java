package exception_try_chatch12_01_01;

import java.io.*; //io패키지에 있는 모든걸 사용한다 *

public class exceptionExample04_FileNotFound {
	public static void main(String args[]) {
		FileReader reader = null;

		try {
			reader = new FileReader("some.txt");//입력을 받아들이지못해 에러발생, reader은 아직 null

		} catch (IOException e) {
			System.out.println("입출력 에러가 발생했습니다.");
			//FileNotFoundExeption 은 IOException의 서브 클래스로 FileNotFoundException도 잡을 수 있다.
		} finally {
			try {		//
				reader.close();
			} catch (IOException e) { 
				e.printStackTrace();
			} // reader를 전체 영역에서 인식 할 수 있도록 필드 부분에 작성해주고 null로 초기화.
		}
	}
}
