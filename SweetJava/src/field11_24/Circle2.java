package field11_24;

public class Circle2 {
	double radius;
	final double PI = 3.14;

	Circle2(double radius) {
		this.radius = radius;

	}

	double getArea() {
		double area;
		area = radius * radius * PI;
		return area;
	}                                                       

	// getter�޼���
	public double getRadius() { // ���� �������� �ű⿡ �Ű����� ����, ���� �������⿡ ������ �ִ�
		return radius;		
	}

	// setter�޼���
	public void setRadius(double radius) {
		this.radius = radius;
	}
}
