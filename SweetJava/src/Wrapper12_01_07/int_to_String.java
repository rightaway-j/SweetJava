package Wrapper12_01_07;
//int -> String 만드는 방법 두가지
//방법1. Integer.toString()사용
//방법2. + 연산자 사용
public class int_to_String {
	public static void main(String args[]) {
		
		int i = 10;
		//방법 1.Integer.toString()사용
		String age = Integer.toString(i);
		
		//방법2. + 연산자 사용
		String age2 = "" + i;
		
		System.out.println(age);
		System.out.println(age2);
	}
}
