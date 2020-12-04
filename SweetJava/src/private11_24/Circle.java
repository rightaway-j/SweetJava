package private11_24;

public class Circle {
//접근 제어자 private은 클래스 내부에서 사용가능합니다.
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
