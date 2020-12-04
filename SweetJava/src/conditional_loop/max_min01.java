//package com.naver.myhome;
//import java.util.Scanner;
//public class max_min01 {
//	 public static void main(String args[]) {
//		 Scanner sc = new Scanner(System.in);
//		 int max;
//		 System.out.println("세 개의 정수를 입력하세요.>");
//		 int num1 = sc.nextInt();
//		 int num2 = sc.nextInt();
//		 int num3 = sc.nextInt();
//		 
//		 if (num1 > num2 && num2 > num3) {
//			 (max = num1);
//			 }
//		 else (num2 > num1);
//		 
//		 else (num3 > num2);
//		 
//		 System.out.println("max = " + max );
//	
//		 sc.close();
//	 }
//}
//====================================================
package conditional_loop;

import java.util.Scanner;

public class max_min01 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("세 개의 정수를 입력하세요.>");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		
//		if (num1 >= num2 && num2 >= num3) {
//			System.out.println("max=" + num1);
//		}
		if (num2 >= num3 && num3 >= num1) {
			System.out.println("max=" + num2);
		}
//		if (num3 >= num1 && num1 >= num2) {
//			System.out.println("max=" + num3);
//		}
		if (num1 >= num2 && num1 >= num3) {
			System.out.println("max=" + num1);
		}
		if (num2 >= num1 && num2 >= num3) {
			System.out.println("max=" + num2);
		}
		if (num3 >= num1 && num3 >= num2) {
			System.out.println("max=" + num3);
		}

		sc.close();
	}
}