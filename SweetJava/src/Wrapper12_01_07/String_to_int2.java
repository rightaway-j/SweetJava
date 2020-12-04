package Wrapper12_01_07;
/*
 * Integer객체를 이용한 String => int 방법 두 가지
 * 
 * 방법1.
 * String => Integer 객체
 * Integr 객체 => int형 값
 * 
 * 방법2. 
 * String =>int
 * Ex) Integer.parseInt(args[cnt])
 */


//방법1. 
public class String_to_int2 {
	public static void main(String args[]) {
		int total = 0;
		for (int cnt =0;cnt < args.length; cnt++) {
			System.out.println("args[" + cnt + "]=" + args[cnt]);
			
			//인자로 받은 문자열을 가지고 Integer객체를 생성
			Integer obj = new Integer(args[cnt]); //Integer에 인자값으로 넣어서
			
			//Integer 객체 안에 있는 int값을 가져옵니다.
			total += obj.intValue();
			
		}
		System.out.println("합=" + total);
	}
}
