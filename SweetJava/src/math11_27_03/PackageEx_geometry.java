//다른 패키지의 클래스를 사용하는 프로그램 = 잘못된 에러
//다른 페키지 에 속하는 클래스나 인터페이스를 패키지 이름 없이 사용할 수 있게됨
//패키지 선언문이 있을 경우에는 패키지 선언문보다 뒤에 써야함

package math11_27_03;

import geometry.polygon11_27_03.Rectangle;//import선언문 = 다른 패키지속 이거를 사용할거야~

class PackageEx_geometry {
	public static void main(String args[]) {
		Rectangle obj = new Rectangle(2, 3);// 컴파일러 에러
		System.out.println("가로= " + obj.width);
		System.out.println("세로=" + obj.height);
		System.out.println("면적=" + obj.getArea());
	}
}
