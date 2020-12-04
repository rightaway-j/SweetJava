package String11_27_08;

import java.util.Scanner;

public class String_methodEx {
	public static void main(String args[]) {
		/*
		 * 1. main()메서드 (1) Scanner 객체 생성합니다. (2) 무한 반복 시작합니다. - 3~6 반복합니다. (3)
		 * "주민번호 입력 (exit=e): "출력합니다. (4) 주민번호 입력 받습니다. (5) 입력 문자열이 "e"이면 "종료합니다." 출력하고
		 * 반복문 벗어납니다. (6) printCheck(zumin) 호출합니다.
		 */
		
		String zumin;

		do {
			System.out.println("주민번호 입력 (exit=e): ");
			Scanner sc = new Scanner(System.in);
			zumin = sc.next();
		} while (!(zumin.equals("e")));
		System.out.println("종료합니다");
		printCheck(zumin);// printCheck(zimin)호출
	}

	/*
	 * 2. 메서드 이름 : checkLength 매개변수 : 입력 받은 주민번호(String) 기능 : 입력받은 주민번호 길이가 14개인지
	 * 판단(14개이면 true, 아니면 false) 반환형 : boolean
	 */

	static boolean checkLength(String zumin) {
		if (zumin.length() == 14) {
			return true;
		} else
			return false;
	}
	/*
	 * 다른 방법 return zumin.length() == 14? true : false;
	 */

	/*
	 * 3. 메서드 이름 : checkHyphen 매개변수 : 입력 받은 주민번호(String) 기능 : 입력받은 주민번호의 7번째 문자가
	 * '-'인지 판단('-'이면 true, 아니면 false) 반환형 : boolean
	 */
	static boolean checkHyphen(String zumin) {
		String s = zumin.substring(6, 7);
		if (s.equals("-")) {
			return true;
		} else
			return false;

	}
	// 다른 방법
	// return zumin.substring(6,7).equals("-")?true:false;
/*
 * 5. 메서드 이름 : select
   매개변수 : 뒷자리 첫문자를 받는 문자열
   기능 : 매개변수의 값이 "1" 또는 "3"이면 "남자", "2" 또는 "4"이면 "여자" 그 외는 "외국인" 리턴
   반환형 : String

 */
	static String select(String n) {
		// TODO Auto-generated method stub
		String result = "외국인";
		switch (n) {
		case "1":
		case "3":
			result = "남자";
			break;
		case "2":
		case "4":
			result = "여자";
		}
		
		return result;
	}
	/*
	 * 4. 메서드 이름 : isNumber 매개변수 : 입력 받은 주민번호(String) 기능 : 매개변수의 값이 null이거나
	 * ""(빈문자열)이면 false 리턴 아닌 경우에는 매개변수의 모든 문자가 숫자인지 판단해서 숫자가 아니면 false 리턴 숫자이면 true
	 * 리턴 반환형 : boolean
	 */

	public static boolean isNumber(String str) {
		if (str == null || str.contentEquals(""))
			return false;

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch < '0' || ch > '9') {
				return false;
			}
		} // for end
		return true;
	}
	// isnumber end

/*	boolean isNumber(String zumin) {
//		if(zumin.contentEquals(null)|| zumin.equals("")) {
//			return false;
//		}else if () {
//			
//			int len = zumin.length();
//			
//			for(int cnt = 0; cnt < len; cnt++) {
//				char ch = zumin.charAt(cnt);
//				
//				ch < 10;
//			
//		}
//		

	// else if(int a < 10) {
// (!(zumin.substring(1,7) && zumin.substring(8,13) int))}
	/*
	 * 5. 메서드 이름 : select 매개변수 : 뒷자리 첫문자를 받는 문자열 기능 : 매개변수의 값이 "1" 또는 "3"이면 "남자",
	 * "2" 또는 "4"이면 "여자" 그 외는 "외국인" 리턴 반환형 : String
	 */

	private static void printCheck(String zumin) {
		if (!checkLength(zumin)) {
			System.out.println("주민번호 길이는 14개 입니다.");

		} else if (!checkHyphen(zumin)) {
			System.out.println("주민번호 형식에 맞지 않습니다.(-위치).");
		} else if (!isNumber(zumin.substring(0, 6))) {
			System.out.println("앞자리에 숫자를 입력하세요");
		} else if (!isNumber(zumin.substring(7, 14))) {
			System.out.println("뒤자리에 숫자를 입력하세요");
		} else {
			String n = zumin.substring(7, 8);
			System.out.println(select(n));
		}
	}

}
/*
 * 6. 메서드 이름 : printCheck 매개변수 : 입력 받은 주민번호(String) 기능 : checkLength()가 거짓이면
 * "주민번호 길이는 14개 입니다." checkLength()가 거짓이 아닌 경우 checkHyphen()가 거짓이면
 * "주민번호 형식에 맞지 않습니다.(-위치)" checkHyphen()가 거짓이 아닌 경우 isNumber(앞자리6자리)가 거짓이면
 * "앞자리에 숫자를 입력하세요" isNumber(앞자리6자리)가 거짓이 아닌 경우 isNumber(뒷자리7자리)가 거짓이면
 * "뒤자리에 숫자를 입력하세요" isNumber(뒷자리7자리)가 거짓이 아닌 경우 성별구분짓는 문자 추출해서 판단하는 select()호출
 * 반환형 : void
 */
