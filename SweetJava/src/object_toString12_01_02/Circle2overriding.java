package object_toString12_01_02;

//overriding할때 접근제어자는 같거나 더 넓어야 한다.
public class Circle2overriding {
	int radius; // 반지름

	Circle2overriding(int radius) {
		this.radius = radius;

	}

	public String toString() {
		return "radius=" + radius;

	}
}
