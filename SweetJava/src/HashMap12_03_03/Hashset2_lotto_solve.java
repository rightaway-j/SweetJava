package HashMap12_03_03;
import java.util.*;
public class Hashset2_lotto_solve {
/*
 * Set  인터페이스
 * 	- HashSet (상속받는 클래스): 내부적으로 HashMap을 이용해서 만들어졌으며
 * 	HashSet이란 이름은 해싱을 이용해서 구현했기 때문에 붙여진 것이다.
 * - TreeSet 은 이진 검색 트리(binary search tree)라는 자료구조의 형태로 데이터를 저장하는 컬렉션 클래스입니다.정렬이된다.
 * 1.여러가지 자료형(기본자료형 참조형 모두 ) 의 Data를 모두 저장가능
 * ex) int,couble, char, boolean,String etc
 * 2.순서 없이 입, 출력한다.
 * 3. 중복된Data를 저장하지 못합니다.
 * 예 로도 번호 6개를 중복되지 않게 하는 프로그램시 이용 4. 동일한 객체인지 판별법:
 * hashCode()의 리턴값이 다르면 다른 객체ㅗ 인식해 저장합니다.
 * hashCode()의 리천값이 같으면 equals()메서드의 리턴값으로 판별
 * equals(0메서드의 리턴값이 true이면 같은 객체로 인식하면 저장 하지 않고
 * 다르면 다른 객체로 인식해서 저장;.
 * 결론) 같은 객체로 인식하기 위해 hashCode()와equals()를 재정의해야한다.
 */
 
	public static void main(String args[]) {
		//HashSet객체생성
		Set<Integer>set = new TreeSet<Integer>();
	
		while(set.size() <6) {
			int num = (int)(Math.random()*45) +1;
			set.add(num);
	}
	System.out.println(set);
		
		
	}
	
}
