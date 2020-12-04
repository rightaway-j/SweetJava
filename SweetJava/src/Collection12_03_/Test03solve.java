//package com.naver.myhome;
//
//import java.util.Scanner;
//
//		//import java.util.Scanner;
//		//int i = 10;
//		//Rest s = new rect(i);
//		//=> Rect s = new Rect(10;)
//public class Test03solve {
//	public static void main(String args[]) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("두수를 입력하세요>");
//		int a = sc.nextInt();
//		int b = sc.nextInt();
////		if (a >=b ) {
////			System.out.println("max =" + a);
////			
////		}else {
////			System.out.println("max =" + b);
//		if (a == b ) {
//			System.out.println("같은 수 입니다.");
//		}else {
//			System.out.println("다른 수 입니다.");
//		}
//		sc.close();
//	}
//}

package Collection12_03_;

import java.util.Scanner;

		//import java.util.Scanner;
		//int i = 10;
		//Rest s = new rect(i);
		//=> Rect s = new Rect(10;)
public class Test03solve {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("이름을 입력하세요>");
		String name = sc.next(); //정수형은 int
		
		if (name.equals("java")) {
			System.out.println("이름이 일치합니다.");
		}else {
			System.out.println("다시 생각해 보세요.");
		}
		sc.close();
	}
}
