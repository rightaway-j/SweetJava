/*
 * Generic 사용
 * 
 * Vector 클래스 - ArrayList의 구버전
 * 					ArrayList와 거의 비슷, 둘 중에서 ArrayList를 더 많이 사용
 * 1.여러가지 자료형의 Kata를 모두 저장할 수 있다.
 * ex)int, double, char, boolean, String etc
 * 2.순서있는 입,출력 처리 (index번호 순으로 저장됨)
 * 3.중복된Data를 저장할 수 있다.
 * 4.입출력 방법이 다양(열거형으로 출력 가능)
 * 5. 무조건 동기화를 하기 때눈에 단일 스레드 처리에서는 ArrayList나 LinkedList보다 성능이 떨어집니다.
 * 참고> 동기화란 스레드에서 공유자원에 작업을 마치기 전 까지는 다른 스레드에서 공윶원에 접근하지 못하게 약속하는것
 */
package List12_03_02;
import java.util.*;
public class VectorEx { 
	public static void main(String args[]) {
	Vector<String> vec = new Vector<String>(); //String형만 올 수 있다.
	vec.add("Apple");
	vec.add("banana");
	vec.add("oRANGE");
	
	String temp;
	for(int i = 0; i<vec.size(); i++) {
		temp=vec.get(i); //get해서 담아가지고 왔다.
		System.out.println(temp.toUpperCase());
		System.out.println(temp.toLowerCase());
		System.out.println("==========");
		
		/*
		 * get(i) 이 변환형이 Object형이지만 Generic 으로 선언했기 때문에
		 * (String)를 생략할 수 있다.
		 * temp = (Stribg)vec.get(i);
		 * Generic 을 사용하지 않을 경우에는 변환형을 명시적으로 선언해야한다.
		 */
	}
	
	}

}
