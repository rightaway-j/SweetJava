
package HashMap12_03_03;
import java.util.TreeMap;
import java.util.Set;
/*
 * TreeMap
 * ���� �˻� Ʈ���� ���·� Ű�� ���� ������ �Ӥ������ �����͸� Ű�� �����ؼ� ����
 * �˻��� ���Ŀ� ������ �÷��� Ŭ�����̴�.
 */

public class TreeMap_Generics {
	public static void main(String args[]) {
			
			TreeMap<String, String>hm = new TreeMap<String, String>();//���2. ���� Ŭ������ ���� ��ü����
			
			
			hm.put("woman","����ִ�");
			hm.put("man","�����Ϸ�");
			hm.put("age",new String("10"));
			hm.put("city","Seoul");
			hm.put("city","Busan");
			
			
			
			System.out.println(hm);
			
			
		
			System.out.println(hm.keySet()); 
			
			
			System.out.println(hm.values());
			
			
			System.out.println(hm.get("woman"));//����ִ�
			System.out.println(hm.get("city"));//Busan
			
			
			
			System.out.println("====================");
			Set<String>keys = hm.keySet();
			for(String key: keys) {
				System.out.println(key +"="+ hm.get(key));
			}
		}
	}


