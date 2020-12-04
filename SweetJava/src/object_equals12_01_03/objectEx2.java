/*
 * equals 메소드 사용 예 - 똑같은 값을 갖는 두 개의 객체를 생성
 * 
 * object 클래스의equals()메서드
 * 매개변수로 객체의 참조변수를 받아서 비교하여 그 결과를  boolean값으로 알려주는 역할을 한다.
 * 다음은 equals메소드의 실제 내용이다.
 * public boolean equals (Object arg0){ //다형성으로 인해서 Object를 사용
 * 			return this == arg0;
 * }
 * 두 객체의 같고 다름을 참조변수의 값으로 판단하고 있다.
 * 서로 다른 두객체를 equals메서드로 비교하면 항상 false결과를 얻게 된다.
 */
package object_equals12_01_03;

public class objectEx2 {
	public static void main(String args[]) {
		Circle obj1 =  new Circle(5);
		Circle obj2 =  new Circle(5);
		
		System.out.println(obj1.toString());
		System.out.println(obj2.toString());
		
//		System.out.println(obj1.toString()); //@가 안나왔기에 오버라이딩 된 것을 확이 할 수있다.
//		System.out.println(obj2.toString());
		if(obj1.equals(obj2))//오버라이딩 되었다.
			System.out.println("obj1.equals(obj2):같음");
		else
			System.out.println("obj1.equals(obj2):다름");
		
		if(obj1 == obj2)
			System.out.println("obj1==obj2:같음");
		else
			System.out.println("obj1==obj2:다름");
			
	}

}
