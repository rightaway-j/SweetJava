package StringTokenizer;
//문자열로부터 토큰을 분리하는 프로그램

import java.util.StringTokenizer;

public class Ex2 {
	public static void main(String args[]) {
		//true :구분자(구분인자)도 토큰으로 추출하도록 만드는 인자
		StringTokenizer stok = new StringTokenizer("사과=10|초콜렛=3|샵페인=1", "=|",true); 
		
		while(stok.hasMoreTokens()) {
			String token = stok.nextToken();
			System.out.println(token);
		}
	}
}
