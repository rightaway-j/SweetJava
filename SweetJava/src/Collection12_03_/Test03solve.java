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
//		System.out.println("�μ��� �Է��ϼ���>");
//		int a = sc.nextInt();
//		int b = sc.nextInt();
////		if (a >=b ) {
////			System.out.println("max =" + a);
////			
////		}else {
////			System.out.println("max =" + b);
//		if (a == b ) {
//			System.out.println("���� �� �Դϴ�.");
//		}else {
//			System.out.println("�ٸ� �� �Դϴ�.");
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
		System.out.println("�̸��� �Է��ϼ���>");
		String name = sc.next(); //�������� int
		
		if (name.equals("java")) {
			System.out.println("�̸��� ��ġ�մϴ�.");
		}else {
			System.out.println("�ٽ� ������ ������.");
		}
		sc.close();
	}
}
