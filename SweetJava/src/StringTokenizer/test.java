//StringTokenizer의 기능
//StringTokenizer의 기능과 유사한 String의 split메소드 사용법
/*
 * StringTokenizer:010-1234-5678 토큰 분리
 * 010
 * 12
 * 5678
 * 
 * Stirng의 split메소드 이용 
 * 010
 * 1234
 * 5678
 */
package StringTokenizer;

import java.util.StringTokenizer;

public class test {

	public static void main(String args[]) {
		String phone = "010-1234-5678";
		StringTokenizer str = new StringTokenizer(phone, "-"); //두번 사용할거기에 변수에 담음 -번호를 바꾸고싶을때 변경이 쉬우니(리터럴을 그대로 쓰면 번거로움)
		System.out.println("***StringTokenizer:" + phone + "토큰 분리 ***");

		while (str.hasMoreTokens()) { //몇개가 있는지 모르니 있는거 true false로 다 가져와라
			System.out.println(str.nextToken()); //내부적으로 스트링 배열 취급하고 있음 (몇개인지 모르니)
			}
		System.out.println("***String의 split 메서드 이용:" + phone + "토큰 분리 ***");
			//배열의 갯수가 가변적일때 length 속성을 사용
		String[]st = phone.split("-"); //자료형이 스트링이어서 스트링 배열 사용 //반환형을Sring[] 확인하고 넣어주기
		//String 의 split이라느 메서드를 사용해서 배열,변수 완성
			for(int i = 0; i <st.length; i++) //스트링 클래스의 length는 문자열의 개수, 둘이 구분할 필요 있음
				System.out.println(st[i]);
			System.out.println("========향상된 for문=======");
			for(String token:st) {
				System.out.println(token);
			}

	}
}
