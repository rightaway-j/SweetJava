package Wrapper12_01_07;
//참조형과 기본형의 형변환을 위한것
//Wrapper클래스의 사용 예
public class boxing_unboxing {
	public static void main(String arg[]) {
		//방싱 = 기본형 타입의 값을 객체로 변환
		//int => Integer
		Integer obj1 = new Integer(12); // Integer객체를 생성
		Integer obj2 = new Integer(7);
		
		//언박싱 = 객체를 기본형 타입의 값으로 변환
		//Integer => int
		int n1 = obj1.intValue ();
		int n2 = obj2.intValue();//Integer객체 안에 int값을 가져옴
		int sum = n1 + n2;
		System.out.println(sum);
		
		//String -> Integer
		Integer n02 = new Integer("20");// 박싱은 아니다. "20"은 문자열로 기본형이 아니기 때문에
		
		//Integer => int
		int n3 = n02.intValue();//언박싱 이루어짐, 이것으로 형변환이 이루어짐
		sum = n1 + n2 + n3;
		System.out.println(sum);
		Integer n03= new Integer("a20");//오류 발생 //런타임중 발생하는 오류
				
	}

}
