/*
 * clone()메소드는 객체를 복제하는 기능을 한다. 즉, 똑같은 값을 갖는 객체를 한 개 더 만듭니다. 복제 가능한 클래스에 대해서만 호출 할 수 있다.
 * 복제 가능한 클래슨 Cloneable인터페이스 구현 여부이다. (Cloneable인터페이스를 부모로 가져라)
 * 
 * Cloneable 인터페이스를 구현한 GregorianCalendar 클래스에 대해서 clone()메소드를 호출하는 예제
 */
package clone12_01_03;
//clone()메소드를 호출하는 예제
import java.util.GregorianCalendar;
public class Snippet {
	public static void main(String[] args) {
		//객체를 생성
		GregorianCalendar obj1 = new GregorianCalendar(2020,11,1);
		//clone메서드로 객체를 복제한다.
		Object imsi = obj1.clone();
		GregorianCalendar obj2 = (GregorianCalendar)imsi;
		//위 두문장을 한 문장으로 표현하면 다음과 같습니다.
		//GregorianCalendar obj2 = (GregorianCalendar) obj1.clone();//Object형으로 온것을 downCasting해서 쓸수 있다.
		
		//%tF : 포맷 명세자는 날짜를 yyyy-MM-dd형식으로 포맷하는 역할을 한다.
		System.out.printf("%tF %n", obj1);
		System.out.printf("%tF %n", obj2);
		
		obj1.set(2021,3,28);
		System.out.printf("%tF %n", obj1);
		System.out.printf("%tF %n", obj2);
	}
}

