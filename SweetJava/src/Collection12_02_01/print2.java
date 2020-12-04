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

import java.util.*;

public class print2 {
	public static void main(String[]args) {
		List<String> list = new ArrayList<String>();
		//자료추가
				list.add("수박");
				list.add("레몬");  	
				list.add("아보카도");
				//출력 방법 1. = 해당 객체명으로 출력하느 방법
				System.out.println("===객체명으로 출력하기==");
				System.out.println(list);
				System.out.println(list.toString());
				
				int num = list.size(); //list에 있는 데이터의 수를 구하는 메소드
				//list에 있는 데이터의 수만큼 반복하면서 데이터를 가져와 출력
				for(int cnt = 0; cnt<num; cnt++){
					//get(index)메소드를 사용하여 index위치레 있는 자료를 가져온다.
					String str = list.get(cnt);
					/*
					 * get(i)이 반환형이 Ovject형이지만 Generic으로 선언했기 때문에 (String)을 생략할수 있다.
					 * 사용하지 않을 경우에는 변환형으 ㄹ명시적으로 선언해야한다.
					 * String str = (String )list.get(cnt);
					 * 
					 */
					System.out.println(str);
				}
				//출력방법3. -for문 사용
				System.out.println("=====향상된 for문 사용======");
				for(Object a : list)
					System.out.println(a);
				
	}
}
