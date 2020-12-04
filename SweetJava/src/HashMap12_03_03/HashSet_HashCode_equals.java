package HashMap12_03_03;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

class Member {
	public String name;
	public int age;
	
	public Member(String name, int age) {
		this.name = name;
		this.age = age;
	}
}
public class HashSet_HashCode_equals {
	public static void main(String args[]) {
		Set<Member> set = new HashSet<Member>();
		set.add(new Member("홍길동", 30));
		set.add(new Member("홍길동", 30));
		set.add(new Member("하지은", 30));
		System.out.println("총 객체수:" + set.size());
		//iterator () : set에 있는 데이터를 모두 가져온다.
		Iterator<Member>iterator = set.iterator();
		int count = 0;
		while (iterator.hasNext()) {
			Member str = iterator.next();
			System.out.println(++count + "." + str.name + "," + str.age +"\n");
		}
	}
}
