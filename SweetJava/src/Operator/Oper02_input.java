//값을 입력받는 Scanner클래스를 사용해 봅시다.
//Scanner 클래스는 java.util 패키지에 있다.
//nextInt() : 키보드로 부터 정수형의 값을 입력 받는 메서드 이다.
package Operator; //내가 어디에 있는지
//import java.io.InputStream;
//import java.util.Scanner;

import java.io.InputStream; //내가 사용하는 것의 주소
import java.util.Scanner;

public class Oper02_input {
	public static void main(String args[]) {
		//System.in은 키보드로 데이터를 입력 받을 때 사용한다.
		InputStream is = System.in;
		//클래스명 참조형변수 연산자 생성자 호출
		Scanner sc = new Scanner(is);
		
		System.out.print("정수를 입력하세요>"); //정수 잆력 후 엔터"
		int a = sc.nextInt();//정수를 읽어 변수 a에 저장한다.
		
		System.out.println("입력값은"+ a + "입니다.");
		
		System.out.print("정수를 입력 하세요>");
		int b = sc.nextInt();
		
		System.out.println("입력값은" + b + "입니다.");
		sc.close();
		
	}
}
