package Collection12_03_;

import java.io.InputStream;
import java.util.Scanner;

public class Test02solve {
	public static void main(String args[]) {
		//System.in은 키보드로 데이터를 입력 받을 때 사용한다.
		InputStream is = System.in;
		//클래스명 참조형변수 연산자 생성자 호출
		Scanner sc = new Scanner(is);
		int n1, n2, result;
		System.out.print("정수1를 입력하세요>"); //정수 잆력 후 엔터"
		
		n1 = sc.nextInt();//정수를 읽어 변수 a에 저장한다.
		
		System.out.print("정수2를 입력하세요>");
		n2 = sc.nextInt();
		
		result = n1 + n2;
		System.out.println(n1 + "+" + n2 + "=" + result);
		result = n1 - n2;
		System.out.println(n1 + "-" + n2 + "=" + result);
		result = n1 * n2;
		System.out.println(n1 + "*" + n2 + "=" + result);
		result = n1 / n2;
		System.out.println(n1 + "/" + n2 + "=" + result);
		
		sc.close();
		
	}

}
