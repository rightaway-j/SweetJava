package object_toString12_01_02;

public class CircleTest {
	public static void main(String args[]) {
		Circle obj1 =  new Circle(5);
		Circle obj2 =  new Circle(5);
		
		System.out.println(obj1.toString());//오버라이딩을 안해줘서 주소값이 나옴object_toString12_01_02.Circle@15db9742
		//System.out.prit()나 System.out.println()메서드에 문자열이 아닌 객체를 넘겨주면 toString()메서드가 호출된다.
		System.out.println(obj1);
		
		System.out.println(obj2.toString());
		System.out.println(obj2);
	}
}
