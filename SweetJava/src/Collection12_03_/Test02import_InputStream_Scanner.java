package Collection12_03_;

import java.io.InputStream;
import java.util.Scanner;

public class Test02import_InputStream_Scanner {
	public static void main(String args[]) {
		//System.in은 키보드로 데이터를 입력 받을 때 사용한다.
		InputStream is = System.in;
		//클래스명 참조형변수 연산자 생성자 호출
		Scanner sc = new Scanner(is);
		
		System.out.print("정수1를 입력하세요?"); //정수 잆력 후 엔터"
		int a = sc.nextInt();//정수를 읽어 변수 a에 저장한다.
		
		System.out.println("정수2를 입력하세요?");
		int b = sc.nextInt();
		
		int c = a + b;
		System.out.println("a + b= " + c);
		 c = a - b;
		System.out.println("a - b= " + c);
		 c = a * b;
		System.out.println("a * b= " + c);
		 c = a / b;
		System.out.println("a / b= " + c);
		
		sc.close();
		
	}

}
