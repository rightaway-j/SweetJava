package object11_23;

public class Saram3 {
	// 필드(멤버 변수

	String name;
	int age;
	double w;
	double ki;
//	String name2;
	

	// 생성자-반드시 클래스 이름과또같고 리턴 타입이 없어야함 
	Saram3(String name2) {//생성자가 달라짐
		name = name2;

	}

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
