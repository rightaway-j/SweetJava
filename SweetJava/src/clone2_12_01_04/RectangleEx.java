package clone2_12_01_04;

public class RectangleEx {
	public static void main(String args[]) {
		//��ü ����
		Rectangle obj1 = new Rectangle(10,20);
		//clone�޼���� ��ü�� ����
		Rectangle obj2 = obj1.clone();
		//���� ��ü�� ���� ��ü�� ������ ����Ѵ�
		System.out.println("obj1 = "+ obj1.width + "x" + obj1.height);
		System.out.println("obj2 = "+ obj1.width + "x" + obj2.height);
		
		obj1.height = 100; obj1.width=200;
		System.out.println("obj1 = "+ obj1.width + "x" + obj1.height);
		System.out.println("obj2 = "+ obj1.width + "x" + obj2.height);
	}
	
	
}
