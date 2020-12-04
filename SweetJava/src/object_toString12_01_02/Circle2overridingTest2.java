package object_toString12_01_02;
/*
 *  Object  클래스에 정의된 toSting()은 인스턴스에 대한 정보를 문자열(String)로 제공할 목적으로 정의한 것.
 *  클래스 자겅할때 toString()을 오버라이딩 하지 않으면 아래와 같이 정의된 내용이 그대로 사용됨
 *  
 *  public String toStirng(){
 *  	return getClass().getName() + "@"
 *  		+ INteger.toHexString (hashCode());
 *  }
 *  
 *  -getClass()메소드와 hashCode()메소드 역시  Object클래스의 메소드이므로 호출 불가. 해시 코드는 인스턴스의 주소와 관련된 값이다.
 *  
 *  -hashCode()메서드는 해싱(hashing)기법에 사용되는 해시함수(hash function)을 구현한 것.
 *  해싱은 데이터 관리 기법 중의 하나로 다량의 데이터를 저장하고 검색하는데 유용하다. 해시함수는 찾고자 하는 값을 입력하면 그값이 저장된 위치를 알려주는 해시코드를 반환한다.
 *  
 *  -Circle 인스턴스 두개를 생성한 다음 각 인스턴스에 toSring()을 호출한 결과를 출력했다. Circle클래스에서 Object클래스로부터 상속받은 toString()을 
 *  오버라이딩 하지 않았기때문에 Circle인스턴스에 toString()을 호출하면 Object클래스의 toStrint()이 호출된다.
 */
public class Circle2overridingTest2 {
	public static void main(String args[]) {
		Circle2overriding obj1 =  new Circle2overriding(5);
		Circle2overriding obj2 =  new Circle2overriding(15);
		
		System.out.println(obj1.toString());//오버라이딩을 안해줘서 주소값이 나옴object_toString12_01_02.Circle@15db9742
		//System.out.prit()나 System.out.println()메서드에 문자열이 아닌 객체를 넘겨주면 toString()메서드가 호출된다.
		System.out.println(obj1);
		
		System.out.println(obj2.toString());
		System.out.println(obj2);
	}
}
