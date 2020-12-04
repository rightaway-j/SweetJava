package field11_24;

public class Circle_test2 {
public static void main(String args[]) {
	Circle width;
	width = new Circle(5.0);
	
//	width.radius=5;//필드에 있는것을 호출했던것 width.radius();이 아니고 = 이여야함/ 위에 숫자5.0 넣어줬으니 중복이므로 생략하면됨
	
	System.out.println(width.getArea());
}
}
