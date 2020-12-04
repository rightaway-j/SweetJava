
//여러개의 import선언문을 포함하는 클래스
package math11_27_03;
import geometry_11_27_04.Circle;
import geometry.polygon11_27_03.Rectangle;//geometry*사용하면 그 geometry까지만의 폴더를 사용(*는 하위의 개념이 아니다.//import선언문 = 다른 패키지속 이거를 사용할거야~
//ctrl + shift + o
class PackageEx_geometry2 {
	public static void main(String args[]) {
		Circle obj1 = new Circle(5);
		Rectangle obj2 = new Rectangle(8,9);
		if (obj1.getArea() > obj2.getArea())
		System.out.println("원의 면적이 더 넓습니다. " );
	else
		System.out.println("원의 면적은 직사각형의 면적보다 작거나 같습니다." );
	}
}
