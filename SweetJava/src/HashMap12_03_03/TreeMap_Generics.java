
package HashMap12_03_03;
import java.util.TreeMap;
import java.util.Set;
/*
 * TreeMap
 * 이진 검색 트리의 형태로 키와 값의 쌍으로 ㅣㅇ루어진 데이터를 키로 정렬해서 저장
 * 검색과 정렬에 적합한 컬렉션 클래스이다.
 */

public class TreeMap_Generics {
	public static void main(String args[]) {
			
			TreeMap<String, String>hm = new TreeMap<String, String>();//방법2. 구현 클래스를 통한 객체생성
			
			
			hm.put("woman","재미있니");
			hm.put("man","좋은하루");
			hm.put("age",new String("10"));
			hm.put("city","Seoul");
			hm.put("city","Busan");
			
			
			
			System.out.println(hm);
			
			
		
			System.out.println(hm.keySet()); 
			
			
			System.out.println(hm.values());
			
			
			System.out.println(hm.get("woman"));//재미있니
			System.out.println(hm.get("city"));//Busan
			
			
			
			System.out.println("====================");
			Set<String>keys = hm.keySet();
			for(String key: keys) {
				System.out.println(key +"="+ hm.get(key));
			}
		}
	}


