package Wrapper12_01_07;
//Wrapper Ŭ������ �����ڸ� ����ϴ� �����޼ҵ� valueOf
public class ValueOf_ {
	public static void main(String args[]) {
		//WrapperŬ������ �����ڸ� ����ϴ� ���� �޼ҵ�
		// �ڽ� - �⺻�� Ÿ���� ���� ��üȭ
		// int => Integer
		Integer obj1 = Integer.valueOf(10);
		Integer obj2 = Integer.valueOf(10);
		//�Ȱ��� �⺻���� ������ nalueOf �޼ҵ带 ������ ȣ���ϸ� ���� ��ü�� ���� �������� ���ϵȴ�.
		if(obj1==obj2)
			System.out.println("obj1 == obj2");
		else
		System.out.println("obj1!= obj2");
		//String �� ���������� equals�޼ҵ�� �ּҰ��� �ƴ� ������ ���ϵ��� �������̵��Ǿ� �ִ�.
		
		if(obj1.equals(obj2))
			System.out.println("obj1.equals(obj2)���ƿ�");
		else
			System.out.println("obj1.equals(obj2)�޶��");
	}
}
