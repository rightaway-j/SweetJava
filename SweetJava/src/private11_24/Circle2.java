package private11_24;

/*
 * 객체 지향 츠로그래밍의 주요 특징 중 하나인 캡슐화는 클래스 멤버를 클래스 내부에 감추는 것입니다.
 * 클래스 멤버를 외부에서 조작할 수 없도록 은닉하기 위해 privated을 사용합니다.
 * 하지만 일부 멤버는 외부 클래스가 사용할 수 있도록 공개해야 하비낟.
 * ㅇ{로 리모콘은 복잡한 내부 회로를 노출해서 사용할 수 이게 합니다.
 * 이처럼 클래스 내부에 은닉한 필드를 외부에서 사용할 수 있도록
 * getter setter 를 제공함
 * 일반적으로 getter get, setter set 으로 시작
 * radius 필드에 접근 하기 위해서 getRadius(), setRadius()메서드를 사용한다.
 */

public class Circle2 {//다른 클래스 이름을 쓰기때문에 새로운package안해도됨
	double radius;
	final double PI = 3.14;
	
	Circle2(double radius){
		this.radius = radius;
		
	}
	double getArea() {
		double area = radius * radius * PI;
		return area;
	}

}
