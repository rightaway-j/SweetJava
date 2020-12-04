package private11_24;
//Circle 클래스 안에 선언된 필드를 사용하는 프로그램
//정보의 은닉: 객체의 구성요소를 외부로 부터 감추는 기술
import field11_24.Circle;

public class Crecle_test {
	public static void main(String args[]) {
		Circle obj = new Circle(3.5);
		double area = obj.getArea();
		System.out.println("원의 반지름=" + obj.radius);//오류가 나면 접근자를 잘못썼는지 확인하기
		System.out.println("원의 넓이=" + area);

		obj.radius = 5;
		area = obj.getArea();
		System.out.println("원의 반지름=" + obj.radius);
		System.out.println("원의 넓이=" + area);

//	width.radius=5;//필드에 있는것을 호출했던것 width.radius();이 아니고 = 이여야함/ 위에 숫자5.0 넣어줬으니 중복이므로 생략하면됨

	}
	
}


