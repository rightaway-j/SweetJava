package Wrapper12_01_07;

public class integer_to_hexString {
	public static void main(String args[]) {
		int num = 0;
		for (int cnt = 0; cnt < args.length; cnt++) {
			//인자로 받은 문자열을 int타입의 값으로 바꾸어서 합산합니다.
			num += Integer.parseInt(args[cnt]);
		}
		System.out.println("합은=" + num);
		System.out.println("10진수:"+ num + "\t2진수 :"+ Integer.toBinaryString(num));
		System.out.println("10진수:"+ num + "\t8진수 :"+ Integer.toOctalString(num));
		System.out.println("10진수:"+ num + "\t16진수 :"+ Integer.toHexString(num));
		
	}
}
