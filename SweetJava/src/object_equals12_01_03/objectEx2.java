/*
 * equals �޼ҵ� ��� �� - �Ȱ��� ���� ���� �� ���� ��ü�� ����
 * 
 * object Ŭ������equals()�޼���
 * �Ű������� ��ü�� ���������� �޾Ƽ� ���Ͽ� �� �����  boolean������ �˷��ִ� ������ �Ѵ�.
 * ������ equals�޼ҵ��� ���� �����̴�.
 * public boolean equals (Object arg0){ //���������� ���ؼ� Object�� ���
 * 			return this == arg0;
 * }
 * �� ��ü�� ���� �ٸ��� ���������� ������ �Ǵ��ϰ� �ִ�.
 * ���� �ٸ� �ΰ�ü�� equals�޼���� ���ϸ� �׻� false����� ��� �ȴ�.
 */
package object_equals12_01_03;

public class objectEx2 {
	public static void main(String args[]) {
		Circle obj1 =  new Circle(5);
		Circle obj2 =  new Circle(5);
		
		System.out.println(obj1.toString());
		System.out.println(obj2.toString());
		
//		System.out.println(obj1.toString()); //@�� �ȳ��Ա⿡ �������̵� �� ���� Ȯ�� �� ���ִ�.
//		System.out.println(obj2.toString());
		if(obj1.equals(obj2))//�������̵� �Ǿ���.
			System.out.println("obj1.equals(obj2):����");
		else
			System.out.println("obj1.equals(obj2):�ٸ�");
		
		if(obj1 == obj2)
			System.out.println("obj1==obj2:����");
		else
			System.out.println("obj1==obj2:�ٸ�");
			
	}

}
