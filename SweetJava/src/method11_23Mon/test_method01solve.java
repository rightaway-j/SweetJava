/*
 * 다음 조건을 만족하는 메서드 정의
 * 메서드 이름 :  add
 * 매개 변수 정수현 2개
 * 기능 : 매개 변수의 값을 더한다.
 * 반환값: 매개 변수의 ㅏㄱㅄ을 던한 값
 * 반환형; int
 */
/* 
 * 
 * 
 * 2
 *1번에서 정의한 add메서드를 호출한다
 *인자값으로 3과4를 사용한다
 *3.add()메서드 호출 결과값을 출력한다.
 *출력화면 )7
 */
package method11_23Mon;

public class test_method01solve {
	public static int add(int a, int b) {
		int sum;
		sum = a + b;
		return sum;//호출했던 곳으로 돌아감 아래(add(3,4))
	}
	public static void main(String[]args) {//호출시 매개변수 명과 자료형 type
		int result = add(3,4);//add가 반환형의 int이다 라는 것을 알아야함
		System.out.println(result);
//	test_method01.add(3,4);
	}
	
}


