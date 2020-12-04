package object11_23;

public class Saram_make3 {
	public static void main(String[]args) {
		/*
		 * 다른 클래스에 있는 필드나 메서드(멤버)를 사용하려면 먼저 객체를 생성해야 합니다.
		 * 생성된 객체 멤버에 접근하려면 마침표(.)연산자를 사용합니다.
		 * 예)객체.필드, 객체.메서드()
		 */
		Saram3 s = new Saram3("수지");//()괄호 안에 원하는 생서자 데이터를 넣는다
		//s.name="수지";
		s.w=47.4;
		s.ki=168;
		s.age=27;
		s.eat();
		s.sesu();
		s.walk();
		
		Saram3 p = new Saram3("박보검");
		//p.name="박보검";
		p.w=60.3;
		p.ki= 173;
		p.age=29;
		p.eat();
		p.sesu();
		p.walk();
		
		
		Saram3 m = new Saram3("하지은");
		//m.name="하지은";
		m.w=60;
		m.ki=168;
		m.age=26;
		m.eat();
		m.sesu();
		m.walk();
		
	}
}
