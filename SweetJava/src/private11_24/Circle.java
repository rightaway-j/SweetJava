package private11_24;

public class Circle {
//���� ������ private�� Ŭ���� ���ο��� ��밡���մϴ�.
	private double radius;
	final double PI  = 3.14;
	Circle(double radius){
		this.radius = radius;
	}
	double getArea() {
		double area;
		area = radius *radius * PI;
		return area;
	}
}
