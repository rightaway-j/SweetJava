//package com.naver.myhome;
//
//public class Switch01 {
//	public static void main(String args[]) {
//		int num1 = 52;
//		int num2 = 24;
//		if (num1 < num2)  // 두문장을 실행할경우 중괄호를 해준다 - 입실 퇴실
//			System.out.println("num1 값이 더 큽니다.");
//		System.out.println("num1 = " + num1); //거짓이기에 if지나고 내려와서 다른거 실행
//		
//		System.out.println("End.");
//	}
//}
//========================================
//package com.naver.myhome;
//
//public class Switch01 {
//	public static void main(String args[]) {
//		int num1 = 52;
//		int num2 = 24;
//		if (num1 < num2) {
//			System.out.println("num1 값이 더 큽니다.");
//			System.out.println("num1 = " + num1);
//		}
//		System.out.println("End.");
//	}
//}
//=====================================
//package com.naver.myhome;
//
//public class Switch01 {
//	public static void main(String args[]) {
//		int num1 = 52;
//		int num2 = 24;
//		if (num1 < num2) 
//			System.out.println("num1 = " + num1);
//		else
//			System.out.println("num2 = " + num2);
//		
//		System.out.println("End.");
//	}
//}
//=============================================
package Collection12_03_;

public class Switch01 {
	public static void main(String args[]) {
		int num1 = 52;
		int num2 = 24;
		int num3 = 32;
//		
//		if (num1 > num2)  {
//			if (num1 > num3)
//			System.out.println("num1 이 제일큽니다.");
//		}
//		
//			//위 문장을 한 개의  if 문과 &&연산자로 바꾸어 주세요.
		if (num1 > num2 && num1 > num3) {
			System.out.println("num1 이 제일큽니다."); //중괄호로 묶는것 - 이거 실행 해라
		}
		System.out.println("End.");
	}
}

