/*
 * 
 * HashMap Generic 사용예
 * Map 인터페이스 - HashMap, Hashtable(상속받는 클래스)
 * 		1. 여러가지 자료형의Data를 모두 저장
 * 			ex) int, double, char, boolean, String etc
 * 		2.Data를 저장할때 Key,Value를 동시에 저장
 * 
 * HashMap과 HashSet등에 사용되느 hashing에 대한 설명
 * - 해싱이란 해시함수를 이요해서 데이터를 해시 테이블에 저장하고 검색하는 기법을 말합니다.
 * - 해시 테이블이란 여러개의 통(bucket)을 만들어 두고 키값을 이용하여 데이터를 넣을 통 번호를 계산하는 데이터 구조이다.
 * 
 * - 해시 함수는 키 값을 받아 해쉬 테이블의 인덱스 키 값을 구하는 함수이다.
 * -해시함수는 데이터가 저장되어 있는곳을 알려주기 대문에 다량의 데ㅌ이터 주엥서도 원하는데이터를 빠르게 찾을 수 있다.
 * -
 * - 해싱을 구현한 컬렉션 클래스로는 HashSet, HashMap, Hashtable등이 있다.
 * -Ovject클래스에 정의된 hashCode()를 해시함수로 사용한다.
 */
	
	/*
	 * 
	 * 
	 */
package HashMap12_03_03;
import java.util.HashMap;
import java.util.Set;
public class hashMap_HashSet {
	public static void main(String []args) {
		//HashMap객체 생성 방법 두가지
		//Map hm = new HashMap(); //방법1. 업캐스팅
		HashMap<String, String>hm = new HashMap<String, String>();//방법2. 구현 클래스를 통한 객체생성
		
		//key와 Value쌍을 삽입
		//Map의 put()을 이용해(Key,Value)쌍으로 자료 저장
		hm.put("woman","재미있니");
		hm.put("man","좋은하루");
		hm.put("age",new String("10"));
		hm.put("city","Seoul");
		hm.put("city","Busan");
		
		
		//HashMap 에 있는 객체들을 출력
		//출력방법1. 해당 객체명으로 출력
		System.out.println(hm);
		//{woman=재미있니, city=Busan, man=좋은하루, age=10}
		
		//출렺방법2. Key값만 출력
		System.out.println(hm.keySet()); //[woman, city, man, age]
		
		//출력방법3. Value 값만 출력
		System.out.println(hm.values());
		
		//출력방법4.
		//get(Key): key에 해당하는 Value를 출력 - 가장 많이 사용
		System.out.println(hm.get("woman"));//재미있니
		System.out.println(hm.get("city"));//Busan
		
		
		//출력방법5.
		System.out.println("====================");
		Set<String>keys = hm.keySet();
		for(String key: keys) {
			System.out.println(key +"="+ hm.get(key));
		}
	}
}

