package Collection12_02_01;

import java.util.ArrayList;

public class contains {
	public static void main(String args[]) {
		ArrayList<String> list1 = new ArrayList<String>();
		list1.add("봄");
		list1.add("여름");
		
		ArrayList<String> list2 = new ArrayList<String>();
		list2.add("봄");
		list2.add("봄");
		list2.add("여름");
		list2.add("가을");
		list2.add("겨울");
	
			
			if(list1.contains("봄")) {
				System.out.println("봄이 존재합니다");
			}else {
				System.out.println("봄이 존재하지 않습니다.");
			}
			System.out.println("list1="+ list1);
			
//			list2.remove("봄");
//			list2.remove("봄");
//			list2.remove("여름");
			
			System.out.println("list2="+ list2);
			System.out.println("=======방법2.=========");
			//방법2.
			//list2에서 list1과 공통되는 요소들을 찾아 삭제
			for (int i = list2.size()-1; i>= 0; i--) {
				//지정된 객체 (list2.get(i))가 list1에 포함되어 있는지 확인
				if (list1.contains(list2.get(i))) {
					list2.remove(i);
					System.out.println("list2="+ list2);
					
				}
			}System.out.println("list1=" + list1);
			System.out.println("list2=" + list2);
			System.out.println("=======방법2-1.=========");
			//방법2.
			//list2에서 list1과 공통되는 요소들을 찾아 삭제
			System.out.println("list2="+ list2);
			for (int i =0 ; i<= list2.size(); i++) { //앞에서 부터 삭제 //이런경우방지 뒤에서 붜 삭제
				//지정된 객체 (list2.get(i))가 list1에 포함되어 있는지 확인
				if (list1.contains(list2.get(i))) {
					list2.remove(i-1);
					System.out.println("list2="+ list2);
					
				}
			}System.out.println("list1=" + list1);
			System.out.println("list2=" + list2);
			
			
			System.out.println("================");
			//방법3.
			//list2에서 list1과 공총되는 요소들을 찾아 삭제
		}
}
