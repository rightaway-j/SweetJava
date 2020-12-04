package Wrapper12_01_07;
//기본형 값=> Wrapper객체의 자동(오토) Boxing
public class auto_boxing {
	public static void main(String args[]) {
		printDouble(new Double(123.45));
		
		//double 타입의 값을 가지고   Double타입인자를 받는 메소드를 호출한다.
		printDouble(123.45);
		//내부적으로 printDouble(Double.valyeOf(123.456D));로 변환한다.
		
	}
	
	//자동(오토)Boxing
	static void printDouble(Double obj) {
		System.out.println("obj = " + obj);
		System.out.println("obj.doubleValue() =" + obj.doubleValue());
		System.out.println("obj.toString()="+ obj.toString());
	}
}
