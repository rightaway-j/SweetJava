package private11_24;
//Circle Ŭ���� �ȿ� ����� �ʵ带 ����ϴ� ���α׷�
//������ ����: ��ü�� ������Ҹ� �ܺη� ���� ���ߴ� ���
import field11_24.Circle;

public class Crecle_test {
	public static void main(String args[]) {
		Circle obj = new Circle(3.5);
		double area = obj.getArea();
		System.out.println("���� ������=" + obj.radius);//������ ���� �����ڸ� �߸������ Ȯ���ϱ�
		System.out.println("���� ����=" + area);

		obj.radius = 5;
		area = obj.getArea();
		System.out.println("���� ������=" + obj.radius);
		System.out.println("���� ����=" + area);

//	width.radius=5;//�ʵ忡 �ִ°��� ȣ���ߴ��� width.radius();�� �ƴϰ� = �̿�����/ ���� ����5.0 �־������� �ߺ��̹Ƿ� �����ϸ��

	}
	
}


