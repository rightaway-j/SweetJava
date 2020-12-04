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

Integer.parseInt(args[0])

//방법 2.
public class String_to_int3 {
	public static void main(String args[]) {
		int total = 0;
		
		for (int cnt =0; cnt < args.length; cnt++) {
			total += Integer.parseInt(args[cnt]);
			
		}
		System.out.println("합="+total);
	}
}
