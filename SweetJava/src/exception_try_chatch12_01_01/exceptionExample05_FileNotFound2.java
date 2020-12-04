package exception_try_chatch12_01_01;

import java.io.*; //io패키지에 있는 모든걸 사용한다 *

public class exceptionExample05_FileNotFound2 {
	public static void main(String args[]) {
		FileReader reader = null; // runtime중 발생한 에러//null에 에러발생 상속관계 생각해서 에러 처리 //null인데 가리키는 것이 없어서 난 에러

		try {
			reader = new FileReader("some.txt");// 입력을 받아들이지 못해 에러발생으로 객체생성 불가.
		} catch (IOException e) {
			System.out.println("입출력 에러가 발생했습니다.");

		} finally {
			try {

				if (reader != null)
					reader.close();
			} catch (IOException e) {
				System.out.println("파일 닫는 중 오류 발생했습니다");
			}
//				reader.close();
//			} catch (IOException e) {
//				e.printStackTrace();
//			} catch (Exception e) { //runtime중 발생한 오류 이기 때문에 상속관계의 위에있는 Exception을 잡아줌
//					System.out.println("파일 닫는 중 오류 발생했습니다");
//					
//			}
		}
	}
}
