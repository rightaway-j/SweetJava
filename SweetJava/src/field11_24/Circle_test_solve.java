package field11_24;

public class Circle_test_solve {
	public static void main(String args[]) {
		Circle obj = new Circle(3.5);
		double area = obj.getArea();
		System.out.println("원의 반지름=" + obj.radius);
		System.out.println("원의 넓이=" + area);

		obj.radius = 5;
		area = obj.getArea();
		System.out.println("원의 반지름=" + obj.radius);
		System.out.println("원의 넓이=" + area);

//	width.radius=5;//필드에 있는것을 호출했던것 width.radius();이 아니고 = 이여야함/ 위에 숫자5.0 넣어줬으니 중복이므로 생략하면됨

	}
	
}
