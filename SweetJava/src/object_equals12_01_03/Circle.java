package object_equals12_01_03;
public class Circle {
	int radius; // 반지름

	Circle(int radius) {
		this.radius = radius;

	}
	public String toString() {
		return "radius=" + radius;

	}
	//obj가 object 타입이므로 radius를 참조하기 위해서 Circle타입으로형변환이 필요
	public boolean equals(Object obj) {
	 //obj. 에러 =자손에 있는 radius값을 사용하기위해 downcasting 해줘야함
		
		/*
		 * obj가null이 아니고 obj를 Circle로 형변환 가능한지 체크한다.
		 * 조건을 만족하면 obj를 Circle로 형변환하고 
		 * 형변환한obj의 radius값과 현재 객체의 radius값을 비교해서 같으면 
		 * true를 아니면 false를 리턴한다.
		 */
		if(obj !=null && obj instanceof Circle) {
			Circle obj2 = (Circle) obj;
			return this.radius == obj2.radius;
		}else {
			return false;
		}
	}
}
