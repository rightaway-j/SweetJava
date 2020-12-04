/*
 * LinkedList 사용예
 *LinkedList와  ArrayList의 차이ㅊ점
 *- 데이터의 추가 또는 삭제시 ArrayList 보다 속도가빠릅니다.
 *ArrayList의 경우 차례대로 데이터를 추락하고
 *마지막에서부터 데이터를 삭제하는 것은 LinkedList보다 빠릅니다.
 *하지만 중간에 데이터를 추가하려면 빈자리를 만들기 위해 다른 데이터를 복하새서 이동해야 하고
 *삭제인 경우에는 뎅터를 재배치ㅐ야 하지만
 *LinkedList의 경우에는 각 요소간 연결만 변경해주면 되기 때문에 처리속도가 상당히 빠릅니다.
 *-검색에ArrayList는 연속적으로 메모리상에 존재하기 때문에 /찾는데 빠르지만 불연속적으로
 *위치한LinkedList는 처음부터 차례대ㅗ로 따라가야 원하는 값을 얻을 수 잇어 검색시간이 느립니다.
 */
package List12_03_02;
import java.util.*;
public class LinkedListEx2 {
	public static void main(String args[]){
		//Linkedlist 객체를 생성
		LinkedList<String> list = new LinkedList<String>();
		list.add("grape");
		list.add("strawbarry");
		list.add("peach");
		int num = list.size();
		for(int cnt = 0; cnt <num; cnt++) {
			String str = list.get(cnt);
			System.out.println(str);
			
		}
	}

}
