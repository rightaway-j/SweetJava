package HashMap12_03_03;
import java.util.*;
public class Hashset2_lotto {
/*
 * Set  인터페이스
 * 	- HashSet (상속받는 클래스): 내부적으로 HashMap을 이용해서 만들어졌으며
 * 	HashSet이란 이름은 해싱을 이용해서 구현했기 때문에 붙여진 것이다.
 * - TreeSet 은 이진 검색 트리(binary search tree)라는 자료구조의 형태로 데이터를 저장하는 컬렉션 클래스입니다.정렬이된다.
 * 1.여러가지 자료형(기본자료형 참조형 모두 ) 의 Data를 모두 저장가능
 * ex) int,couble, char, boolean,String etc
 * 2.순서 없이 입, 출력한다.
 * 3. 중복된Data를 저장하지 못합니다.
 * 예 로도 번호 6개를 중복되지 않게 하는 프로그램시 이용
 */
	public static void main(String args[]) {
		//HashSet객체생성
		HashSet<String>set = new HashSet<String>();
	
		int num;
		
		num = (int) (Math.random() * 10);
		System.out.println(num);
		
		for (int n = 0; n < 6; n++) {
			num = (int) ((45 - 1 + 1) * Math.random() + 1); // n으로 for문이 6번 돌꺼야 그 6번 도는 동안에 num 에대한 식이 6번 돌아
			System.out.print(num + " ");
			set.add(Integer.toString(num));
			if (!(set.size() == 6));
			else		
				break;
				}
		
		
	}
	
}
