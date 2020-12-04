//package com.naver.myhome;
//
//import java.util.Scanner;
//
//public class Assignment11_18solve {
//	public static void main(String args[]) {
//	Scanner sc = new Scanner(System.in);
//	
//	System.out.print("숫자를 입력하세요:");
//	int inputdata=sc.nextInt();
//	int output = (inputdata-1)/10; //값이 1개 차이나니까, 10개씩이니
//	System.out.println(output);
//	 
//	sc.close();
//	}
//}
//=======================2=================
//package com.naver.myhome;
//
//import java.util.Scanner;
//
//public class Assignment11_18solve {
//	public static void main(String args[]) {
//	Scanner sc = new Scanner(System.in);
//	
//	System.out.print("숫자를 입력하세요:");
//	int inputdata=sc.nextInt();
//	int output = (inputdata-1)/10 * 10; //값이 1개 차이나니까, 10개씩이니
//	System.out.println(output);
//	 
//	sc.close();
//	}
//}
//
//============================3===========
//package com.naver.myhome;
//
//import java.util.Scanner;
//
//public class Assignment11_18solve {
//	public static void main(String args[]) {
//	Scanner sc = new Scanner(System.in);
//	
//	System.out.print("숫자를 입력하세요:");
//	int inputdata=sc.nextInt();
//	int output = (inputdata-1)/10 * 10 + 1; //값이 1개 차이나니까, 10개씩이니
//	System.out.println(output);
//	 
//	sc.close();
//	}
//}
//=============================4============
//package com.naver.myhome;
//
//import java.util.Scanner;
//
//public class Assignment11_18solve {
//	public static void main(String args[]) {
//		Scanner sc = new Scanner(System.in);
//		int page, startpage;
//		System.out.print("정수를 입력하세요:");
//		page =sc.nextInt();
//		startpage = (page-1)/10 * 10 + 1; //값이 1개 차이나니까, 10개씩이니
//		System.out.println(startpage);
//		 
//		sc.close();
//	}
//} 
//===========================5=======================
package check;

import java.util.Scanner;
//2번문제와 유사하다, 2번결과에 1을 더하면 된다
//10대신 limit로 바꾼다.
public class Assignment11_18solve {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("limit : ");
		
		int limit = sc.nextInt();
		System.out.print("listcount :");
		int listcount = sc.nextInt();
		
		int maxpage1 = (listcount-1)/limit+ 1; //값이 1개 차이나니까, 10개씩이니
		System.out.println(listcount + "=." + maxpage1);
		 
		sc.close();
	}
}
