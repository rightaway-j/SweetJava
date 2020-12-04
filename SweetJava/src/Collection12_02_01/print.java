/*1.지네릭스(Generics)jdk 1.5에서 처음 도입
 * 다양한 타입의 객체들을 다루는 메소드나 컬렉션 클래스에 컴파일 시의 타입체크를 해주는 기능
 * 2.클래스 옆에 꺽쇠(<>)기호를 이용해서 만든다
 * 	1)<>안에 특정 자료형(Wrapper클래스, String, 사용자 정의 클래스형 - 참조형)을 넣어주면 된다
 * 	2)Api형식 표기
 * 		Class ArrayList<E>: E의Array List라고 읽는다
 * 		-ArrayList :원시타입(raw type)
 * 		-E (차입 매개 변수) : 기호의 종류만 다를 뿐 임의의 참조형 타입을 의미
 * 
 * 		변수: 의미
 * E:원소(Element)
 * K:키(key)
 * T:타입(Type)
 * V:값(Value)
 * 
 * 
 * 사용예)
 * 		List<String> 		list = new ArrayList<String>();
 * 		ArrayList<String> list = new ArrayList<String>();
 * 		ArrayList<Integer> list = new ArrayList<Integer>();
 * 		ArrayList<Double> list = new ArrayList<Double>();
 * 		ArrayList<MemberInput> list = new ArrayList<MemberInput>();
 * 		
 */
package Collection12_02_01;

import java.util.ArrayList;
import java.util.List;

public class print {
	public static void main(String[]args) {
		List<String> list = new ArrayList<String>();
		//자료추가
				list.add("하나");
				list.add(2);  	//오류 발생 -String형 아님
				list.add(false);//오류 발생 -String형 아님
				list.add(3.42);//오류 발생 -String형 아님
				list.add("넷");
				list.add("five");
				list.add('A');//오류 발생 -String형 아님
	}
}
