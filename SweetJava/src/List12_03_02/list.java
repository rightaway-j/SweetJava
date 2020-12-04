
package List12_03_02;

public class list {
	public static void main(String args[]) {
		System.out.println("=======방법2.=========");
	//방법2.
	//list2에서 list1과 공통되는 요소들을 찾아 삭제
	for (int i = list2.size()-1; i>= 0; i--) {
		//지정된 객체 (list2.get(i))가 list1에 포함되어 있는지 확인
		if (list1.contatins(list2.get(i))) {
			list2.remove(i);
			System.out.println("list2="+ list2);
			
		}
	}System.out.println("list1=" + list1);
	System.out.println("list2=" + list2);
	
	System.out.println("================");
	//방법3.
	//list2에서 list1과 공총되는 요소들을 찾아 삭제
	}
}
