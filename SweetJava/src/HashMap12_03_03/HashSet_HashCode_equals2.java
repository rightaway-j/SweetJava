package HashMap12_03_03;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

class Member2 {
	
	public String name;
	public int age;
	
	
	public Member2(String name, int age) {
		this.name = name;
		this.age = age;
		
	}
	public boolean equals(Object obj) { //업캐스팅하는 코드 //오버라이딩을해서 다를수 밖에 없는 hashcode를 같게 만들어줌
		if(obj!=null && obj instanceof Member2) {
			Member2 member = (Member2)obj;
			return member.name.equals(name)&&(member.age == age);
		}else {
			return false;
		}
	}
	//String 클래스의 hashCode()는 같은 문자열에 대한 hashCode()값을 같도록 오버라이딩 했다.
		public int hashCode() {
			return (name + age).hashCode();
			
		
	}
		
}
public class HashSet_HashCode_equals2 {
	public static void main(String args[]) {
		Set<Member2> set = new HashSet<Member2>();
		set.add(new Member2("홍길동", 30));
		set.add(new Member2("홍길동", 30));
		set.add(new Member2("하지은", 30));
		System.out.println("총 객체수:" + set.size());
		//iterator () : set에 있는 데이터를 모두 가져온다.
		Iterator<Member2>iterator = set.iterator();
	
		 
		int count = 0;
		while (iterator.hasNext()) {
			Member2 str = iterator.next();
			System.out.println(++count + "." + str.name + "," + str.age +"\n");
			
			
			
		}
		
	}
}
