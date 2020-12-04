/*
 * 두수와 사칙연산 연산자를 입려가세요~
 * 수1>100
 * 수2>200
 * 연산자>+
 * 100+200=300
 * 계속 입려가시겠습니까?(n이면 종료, 그외 문자는 계속입력 가능)
 * 계속입력> y
 * 수1>10
 * 수2>20
 * 연산자>*
 * 10*20 = 200
 * 계속 입력하식ㅆ습니까?
 * 계속입력>n
 */

//package com.naver.myhome;
//import java.util.Scanner;
//public class do_while03 {
//	public static void main(String args[]) {
//		Scanner sc = new Scanner(System.in);
//		int n1, n2;
//		String s , n;
//		System.out.println("두 수와 사칙연산 연산자를 입력하세요~");
//		do { 
//			System.out.println("수1>");
//			 n1 = sc.nextInt();
//			System.out.println("수2>");
//			 n2 = sc.nextInt();
//			System.out.println("연산자>");
//			s = sc.next();
//		switch (s) {
//			 
//			 case "+": //스트링은 더블코트로 감싸주기
//			  System.out.println(n1 + s + n2 + "=" + (n1 + n2));
//			  break;
//			 case "-":
//				  System.out.println(n1 + s + n2 + "=" + (n1 - n2));
//				  
//				  break;
//			 case "*":
//				  System.out.println(n1 + s + n2 + "=" + (n1 * n2));
//				  break;
//			 case "/" :
//				  System.out.printf("%d %s %d = %.1f\n",n1, s , n2,
//						  						(double)n1/ n2 );
//				  break;
//			 case "%":
//				  System.out.println(n1 + s + n2 + "=" + n1%n2);
//				  break;
//			 default :
//				 System.out.println("+,-,*,/,%중 한개를 입력하세요");
//			 
//			 }
//		System.out.println("계속 입력하시겠습니까?(N(n)이면 종료, 그외 문자는 계속 입력 가능");
//			if(n1.equals("n" || "N")) {
//				break;
//			}
//		}
//			sc.close();
//		
//		}	
//}
//==============================================
package conditional_loop;

import java.util.Scanner;

public class do_while04 {
	public static void main(String args[]) {
		int n1, n2;
		String s , n;
		System.out.println("두 수와 사칙연산 연산자를 입력하세요~");
		Scanner sc = new Scanner(System.in);
		do { 
			System.out.println("수1>");
			 n1 = sc.nextInt();
			System.out.println("수2>");
			 n2 = sc.nextInt();
			System.out.println("연산자>");
			s = sc.next();
		switch (s) {
			 
			 case "+": //스트링은 더블코트로 감싸주기
			  System.out.println(n1 + s + n2 + "=" + (n1 + n2));
			  break;
			 case "-":
				  System.out.println(n1 + s + n2 + "=" + (n1 - n2));
				  
				  break;
			 case "*":
				  System.out.println(n1 + s + n2 + "=" + (n1 * n2));
				  break;
			 case "/" :
				  System.out.printf("%d %s %d = %.1f\n",n1, s , n2,
						  						(double)n1/ n2 );
				  break;
			 case "%":
				  System.out.println(n1 + s + n2 + "=" + n1%n2);
				  break;
			 default :
				 System.out.println("+,-,*,/,%중 한개를 입력하세요");
			 
			 }
		System.out.println("계속 입력하시겠습니까?(N(n)이면 종료, 그외 문자는 계속 입력 가능");
			System.out.print("계속 입력>");
			n= sc.next();
			
		}while (!(n.equals("n") ||n.equals("N"))); // 참이 아닐경우
			
			System.out.println("끝.");
			sc.close();
		
		}	
}