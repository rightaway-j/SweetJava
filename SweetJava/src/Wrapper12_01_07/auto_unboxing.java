package Wrapper12_01_07;
//wrapper객체-> 기본형 값으로 자동 (오토)Unboxing하는예
//기본형의 값을 써야 할 자리에 wrapper객체를 사용하면
// 그 wrapper객체로부터 기본형의 값이 자동으로 추출되어 사용됨
public class auto_unboxing {
	public static void main(String args[]) {
		//문자역 "10"을 Wrqpper객체 Integer로 바꿈
		Integer obj = new Integer("10");
		
		//Integer 객체와 int 타입의 값을 더하는 명령문
		int sum = obj + 20; //자동(오토 )Unboxing
		//int sum = ovj.intValue() + 20;
		System.out.println(sum);
		
	}
}
