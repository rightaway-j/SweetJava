package geometry_11_27_04;
//only public, abstract & final are permitted
public class Circle {// Illegal modifier for the class Circle_private; only public, abstract & final
								// are permitted -private사용불가
	int radius;

	public Circle(int radius) {
		this.radius = radius;
	}

	public double getArea(){
	 return radius * radius * 3.14;
	
}
//double radius;여기로 옮겨도 됨
}

//반지름 5 원의 넓이