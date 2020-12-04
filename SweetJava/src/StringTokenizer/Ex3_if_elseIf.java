package StringTokenizer;
//문자열로부터 토큰을 분리하는 프로그램

import java.util.StringTokenizer;

public class Ex3_if_elseIf {
	public static void main(String args[]) {
		//true :구분자도 토큰으로 추출하도록 만드는 인자
		StringTokenizer stok = new StringTokenizer("사과=10|초콜렛=3|샵페인=1", "=|",true);
		
		System.out.println("상품이름\t상품수");
		while(stok.hasMoreTokens()) {
			String token = stok.nextToken();//(위의 가져온 토큰들을 if,elseif로 걸러줄거야)
			if(token.equals("=")) {
				System.out.print("\t");//제어문자 또는 escape문자
			}
			
			else if(token.equals("|")) {//위의 if를 만족하지 않으면 아래 else if를 실행해라 
				System.out.print("\n");
			}
			else {System.out.print(token); //위에 걸러지고 남은것만 출력해라, 마지막으로 else로 출력
			}
			
		}
	}
}
