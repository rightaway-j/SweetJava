/*
 * 
 * HashMap Generic ��뿹
 * Map �������̽� - HashMap, Hashtable(��ӹ޴� Ŭ����)
 * 		1. �������� �ڷ�����Data�� ��� ����
 * 			ex) int, double, char, boolean, String etc
 * 		2.Data�� �����Ҷ� Key,Value�� ���ÿ� ����
 * 
 * HashMap�� HashSet� ���Ǵ� hashing�� ���� ����
 * - �ؽ��̶� �ؽ��Լ��� �̿��ؼ� �����͸� �ؽ� ���̺� �����ϰ� �˻��ϴ� ����� ���մϴ�.
 * - �ؽ� ���̺��̶� �������� ��(bucket)�� ����� �ΰ� Ű���� �̿��Ͽ� �����͸� ���� �� ��ȣ�� ����ϴ� ������ �����̴�.
 * 
 * - �ؽ� �Լ��� Ű ���� �޾� �ؽ� ���̺��� �ε��� Ű ���� ���ϴ� �Լ��̴�.
 * -�ؽ��Լ��� �����Ͱ� ����Ǿ� �ִ°��� �˷��ֱ� �빮�� �ٷ��� �������� �ֿ����� ���ϴµ����͸� ������ ã�� �� �ִ�.
 * -
 * - �ؽ��� ������ �÷��� Ŭ�����δ� HashSet, HashMap, Hashtable���� �ִ�.
 * -OvjectŬ������ ���ǵ� hashCode()�� �ؽ��Լ��� ����Ѵ�.
 */
	
	/*
	 * 
	 * 
	 */
package HashMap12_03_03;
import java.util.HashMap;
import java.util.Set;
public class hashMap_HashSet {
	public static void main(String []args) {
		//HashMap��ü ���� ��� �ΰ���
		//Map hm = new HashMap(); //���1. ��ĳ����
		HashMap<String, String>hm = new HashMap<String, String>();//���2. ���� Ŭ������ ���� ��ü����
		
		//key�� Value���� ����
		//Map�� put()�� �̿���(Key,Value)������ �ڷ� ����
		hm.put("woman","����ִ�");
		hm.put("man","�����Ϸ�");
		hm.put("age",new String("10"));
		hm.put("city","Seoul");
		hm.put("city","Busan");
		
		
		//HashMap �� �ִ� ��ü���� ���
		//��¹��1. �ش� ��ü������ ���
		System.out.println(hm);
		//{woman=����ִ�, city=Busan, man=�����Ϸ�, age=10}
		
		//��¹��2. Key���� ���
		System.out.println(hm.keySet()); //[woman, city, man, age]
		
		//��¹��3. Value ���� ���
		System.out.println(hm.values());
		
		//��¹��4.
		//get(Key): key�� �ش��ϴ� Value�� ��� - ���� ���� ���
		System.out.println(hm.get("woman"));//����ִ�
		System.out.println(hm.get("city"));//Busan
		
		
		//��¹��5.
		System.out.println("====================");
		Set<String>keys = hm.keySet();
		for(String key: keys) {
			System.out.println(key +"="+ hm.get(key));
		}
	}
}

