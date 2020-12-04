package object11_23;

public class Saram6 {
	// 필드(멤버 변수

	String name;
	int age;
	double w;
	double ki;
//	String name2;
	

	// 생성자-반드시 클래스 이름과또같고 리턴 타입이 없어야함 
	Saram6(String name, double w,double ki, int age) {//생성자가 달라짐
		/*
		 * this란?
		 * 자바는 객체를 참조할 수 있도록 this키워드를 제공한다.
		 * 참조변수로 인스턴스 자신의 주소가 저장되어있습니다.
		 * 생성자와 모든 인스턴스 메서드에 지역변수로 숨겨진 채로 존재한다.
		 */
		this.name = name;
		this.w = w;
		this.ki = ki;
		this.age = age;

	}
//	Saram6(int age2){
//	age = age2;
//	}
//	
//	Saram6(double w2){
//	w = w2;
//	}
//	
//	Saram6(double ki2){
//	ki = ki2;
//	}

	// 메서드
	public void eat() {//static이 없다.정적메소드가 아니다.
		System.out.println(name + "이(가) 밥을 먹는다.");
	}

	// 메서드
	public void walk() {
		System.out.println(name + "이(가) 걷는다.");
	}
//메서드
	public void sesu() {
		System.out.println(name + "이(가) 세수한다");

	}

}
