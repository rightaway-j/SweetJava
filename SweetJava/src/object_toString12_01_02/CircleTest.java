package object_toString12_01_02;

public class CircleTest {
	public static void main(String args[]) {
		Circle obj1 =  new Circle(5);
		Circle obj2 =  new Circle(5);
		
		System.out.println(obj1.toString());//�������̵��� �����༭ �ּҰ��� ����object_toString12_01_02.Circle@15db9742
		//System.out.prit()�� System.out.println()�޼��忡 ���ڿ��� �ƴ� ��ü�� �Ѱ��ָ� toString()�޼��尡 ȣ��ȴ�.
		System.out.println(obj1);
		
		System.out.println(obj2.toString());
		System.out.println(obj2);
	}
}
