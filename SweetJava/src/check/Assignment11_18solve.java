//package com.naver.myhome;
//
//import java.util.Scanner;
//
//public class Assignment11_18solve {
//	public static void main(String args[]) {
//	Scanner sc = new Scanner(System.in);
//	
//	System.out.print("���ڸ� �Է��ϼ���:");
//	int inputdata=sc.nextInt();
//	int output = (inputdata-1)/10; //���� 1�� ���̳��ϱ�, 10�����̴�
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
//	System.out.print("���ڸ� �Է��ϼ���:");
//	int inputdata=sc.nextInt();
//	int output = (inputdata-1)/10 * 10; //���� 1�� ���̳��ϱ�, 10�����̴�
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
//	System.out.print("���ڸ� �Է��ϼ���:");
//	int inputdata=sc.nextInt();
//	int output = (inputdata-1)/10 * 10 + 1; //���� 1�� ���̳��ϱ�, 10�����̴�
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
//		System.out.print("������ �Է��ϼ���:");
//		page =sc.nextInt();
//		startpage = (page-1)/10 * 10 + 1; //���� 1�� ���̳��ϱ�, 10�����̴�
//		System.out.println(startpage);
//		 
//		sc.close();
//	}
//} 
//===========================5=======================
package check;

import java.util.Scanner;
//2�������� �����ϴ�, 2������� 1�� ���ϸ� �ȴ�
//10��� limit�� �ٲ۴�.
public class Assignment11_18solve {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("limit : ");
		
		int limit = sc.nextInt();
		System.out.print("listcount :");
		int listcount = sc.nextInt();
		
		int maxpage1 = (listcount-1)/limit+ 1; //���� 1�� ���̳��ϱ�, 10�����̴�
		System.out.println(listcount + "=." + maxpage1);
		 
		sc.close();
	}
}
