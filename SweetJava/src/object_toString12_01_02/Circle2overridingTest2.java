package object_toString12_01_02;
/*
 *  Object  Ŭ������ ���ǵ� toSting()�� �ν��Ͻ��� ���� ������ ���ڿ�(String)�� ������ �������� ������ ��.
 *  Ŭ���� �ڰ��Ҷ� toString()�� �������̵� ���� ������ �Ʒ��� ���� ���ǵ� ������ �״�� ����
 *  
 *  public String toStirng(){
 *  	return getClass().getName() + "@"
 *  		+ INteger.toHexString (hashCode());
 *  }
 *  
 *  -getClass()�޼ҵ�� hashCode()�޼ҵ� ����  ObjectŬ������ �޼ҵ��̹Ƿ� ȣ�� �Ұ�. �ؽ� �ڵ�� �ν��Ͻ��� �ּҿ� ���õ� ���̴�.
 *  
 *  -hashCode()�޼���� �ؽ�(hashing)����� ���Ǵ� �ؽ��Լ�(hash function)�� ������ ��.
 *  �ؽ��� ������ ���� ��� ���� �ϳ��� �ٷ��� �����͸� �����ϰ� �˻��ϴµ� �����ϴ�. �ؽ��Լ��� ã���� �ϴ� ���� �Է��ϸ� �װ��� ����� ��ġ�� �˷��ִ� �ؽ��ڵ带 ��ȯ�Ѵ�.
 *  
 *  -Circle �ν��Ͻ� �ΰ��� ������ ���� �� �ν��Ͻ��� toSring()�� ȣ���� ����� ����ߴ�. CircleŬ�������� ObjectŬ�����κ��� ��ӹ��� toString()�� 
 *  �������̵� ���� �ʾұ⶧���� Circle�ν��Ͻ��� toString()�� ȣ���ϸ� ObjectŬ������ toStrint()�� ȣ��ȴ�.
 */
public class Circle2overridingTest2 {
	public static void main(String args[]) {
		Circle2overriding obj1 =  new Circle2overriding(5);
		Circle2overriding obj2 =  new Circle2overriding(15);
		
		System.out.println(obj1.toString());//�������̵��� �����༭ �ּҰ��� ����object_toString12_01_02.Circle@15db9742
		//System.out.prit()�� System.out.println()�޼��忡 ���ڿ��� �ƴ� ��ü�� �Ѱ��ָ� toString()�޼��尡 ȣ��ȴ�.
		System.out.println(obj1);
		
		System.out.println(obj2.toString());
		System.out.println(obj2);
	}
}
