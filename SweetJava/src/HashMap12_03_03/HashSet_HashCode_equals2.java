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
	public boolean equals(Object obj) { //��ĳ�����ϴ� �ڵ� //�������̵����ؼ� �ٸ��� �ۿ� ���� hashcode�� ���� �������
		if(obj!=null && obj instanceof Member2) {
			Member2 member = (Member2)obj;
			return member.name.equals(name)&&(member.age == age);
		}else {
			return false;
		}
	}
	//String Ŭ������ hashCode()�� ���� ���ڿ��� ���� hashCode()���� ������ �������̵� �ߴ�.
		public int hashCode() {
			return (name + age).hashCode();
			
		
	}
		
}
public class HashSet_HashCode_equals2 {
	public static void main(String args[]) {
		Set<Member2> set = new HashSet<Member2>();
		set.add(new Member2("ȫ�浿", 30));
		set.add(new Member2("ȫ�浿", 30));
		set.add(new Member2("������", 30));
		System.out.println("�� ��ü��:" + set.size());
		//iterator () : set�� �ִ� �����͸� ��� �����´�.
		Iterator<Member2>iterator = set.iterator();
	
		 
		int count = 0;
		while (iterator.hasNext()) {
			Member2 str = iterator.next();
			System.out.println(++count + "." + str.name + "," + str.age +"\n");
			
			
			
		}
		
	}
}
