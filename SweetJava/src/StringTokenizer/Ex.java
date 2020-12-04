package StringTokenizer;
//문자열로부터 토큰을 분리하는 프로그램

import java.util.StringTokenizer;

public class Ex {
	public static void main(String args[]) {
		//구획문자=콤마ㅏ(,)와 수직선(|)
		StringTokenizer stok = new StringTokenizer("사과,배|복숭아", ",|");
		
		while(stok.hasMoreTokens()) {
			String str = stok.nextToken();
			System.out.println(str);
		}
	}
}
