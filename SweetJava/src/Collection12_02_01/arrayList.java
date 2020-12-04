
/*
 * List 인터페이스 - Array alist (상속받는 클래스)
 * 1. 여러가지 자료형의 Data를 모두 저장할 수 있습니다.
 * ex)int, double, char, boolean, String etc
 * 2.입력한 순서대로 출력된다.(intdex번호 순으로 저장됨)
 * 3.중복된 Data를 저장할 수 있다.
 * 4. 동적인 저장 구조를 이용할수 있다.(add()/ remone())
 * 
 */
package Collection12_02_01;

import java.util.*;

public class arrayList {
	public static void main(String args[]) {
		//업캐스팅(상속해준 메소드만 사용가능)
		//List list = new ArrayList();//꺽쉐 사용하지 않으면 다 넣을 수 있다.
		ArrayList list = new ArrayList();
		
		//자료추가
		list.add("하나");//autdboxing 되는것, integer.parseInt();
		list.add(2); //list.add(Integer.valueOf(2));
		list.add(false);
		list.add(3.42);
		list.add("넷");
		list.add("five");
		list.add('A');
		
		System.out.println(list); //list의 모든 데이터 출력
		System.out.println(list.toString()); //오버라이딩 되는지 확인(@가 안나오면 오버라이딩 잘 된것)
		
		//size(): 데이터의 갯수 구하는 메소드
		System.out.println("데이터의 갯수 = " + list.size());
		
		//get(index):해당 인덱스의 데이터 가져오는 메소드
		//get(3): 0부터 시작, index =3 인 데이터 출력해라
		System.out.println("list.get(3)=" + list.get(3));
		System.out.println("list.get(1)=" + list.get(1));
		
		//아래 문장 수정해 주세요
		int i = (Integer)list.get(1); //int i = ((Integer)list.get(1)).intValue();가 자동으로 이루어짐 (업캐스팅 다운캐스팅)
		System.out.println("list.get(1)=" + i);
		
		i = (int)list.get(1); //i = ((Integer)list.get(1)).intValue();
		System.out.println("list.get(1)" + i);
		
		
		
		//출력 방법 1. = 해당 객체명으로 출력하느 방법
		System.out.println("===객체명으로 출력하기==");
		System.out.println(list);
		System.out.println(list.toString());
		
		//출력방법 2. - get()메소드 이용법
		System.out.println("===get()메소드 아용법==");
		for ( i = 0; i < list.size(); i++) {
			System.out.println(i + "번째 요소" + list.get(i));
		}
		System.out.println("===========");

		for ( i = 0; i< list.size(); i++) {
			Object s = list.get(i); //get()메소드의 반환형은 Object형
			System.out.println(s);
		}
		//출력방법3. -for문 사용
		System.out.println("=====향상된 for문 사용======");
		for(Object a : list)
			System.out.println(a);
		//출력방법 4 - Iterator인터페이스 사용: 반복자
		System.out.println("===Iterator인터페이스 사용===");
		
		Iterator elements = list.iterator();
		//hasNext():읽어올 요소가 있는지 확인한다.
		while(elements.hasNext()) {
			System.out.println(elements.next());
			//next()메소드를 이용해서 차례대로 한개씩 데이터 가져온다.
		}
		
		
	}

}
