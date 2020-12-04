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

	// getter메서드
	public double getRadius() { // 값을 가져오는 거기에 매개변수 없음, 값을 가져오기에 리턴은 있다
		return radius;		
	}

	// setter메서드
	public void setRadius(double radius) {
		this.radius = radius;
	}
}
