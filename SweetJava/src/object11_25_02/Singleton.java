package object11_25_02;

public class Singleton {
	//필드 s는 외부에서 사용 못함
	//이 문장은 처음 singleton 클래스가 jvm에 로딩될 때 만 번만 실행됨
	private static Singleton a = new Singleton(); //static = 정적이라는 뜻
//private: 외부에서 생성자를 호출할 수 없도록 막는다.	
	private Singleton() {} //초기화
/*
 * 싱글톤(singleton)
 * 하나의 애플리케이션 내에서 단 하나만 생성되는 객체
 * 
 */
	public static Singleton getInstance() {
		System.out.println("여기는 getInstance 입니다");
		return a;
		
		
		
	}
}
