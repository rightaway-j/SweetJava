package private11_24;

/*
 * ��ü ���� ���α׷����� �ֿ� Ư¡ �� �ϳ��� ĸ��ȭ�� Ŭ���� ����� Ŭ���� ���ο� ���ߴ� ���Դϴ�.
 * Ŭ���� ����� �ܺο��� ������ �� ������ �����ϱ� ���� privated�� ����մϴ�.
 * ������ �Ϻ� ����� �ܺ� Ŭ������ ����� �� �ֵ��� �����ؾ� �Ϻ�.
 * ��{�� �������� ������ ���� ȸ�θ� �����ؼ� ����� �� �̰� �մϴ�.
 * ��ó�� Ŭ���� ���ο� ������ �ʵ带 �ܺο��� ����� �� �ֵ���
 * getter setter �� ������
 * �Ϲ������� getter get, setter set ���� ����
 * radius �ʵ忡 ���� �ϱ� ���ؼ� getRadius(), setRadius()�޼��带 ����Ѵ�.
 */

public class Circle2 {//�ٸ� Ŭ���� �̸��� ���⶧���� ���ο�package���ص���
	double radius;
	final double PI = 3.14;
	
	Circle2(double radius){
		this.radius = radius;
		
	}
	double getArea() {
		double area = radius * radius * PI;
		return area;
	}

}
