/*
 * �μ��� ��Ģ���� �����ڸ� �Է�������~
 * ��1>100
 * ��2>200
 * ������>+
 * 100+200=300
 * ��� �Է����ðڽ��ϱ�?(n�̸� ����, �׿� ���ڴ� ����Է� ����)
 * ����Է�> y
 * ��1>10
 * ��2>20
 * ������>*
 * 10*20 = 200
 * ��� �Է��ϽĤ����ϱ�?
 * ����Է�>n
 */

//package com.naver.myhome;
//import java.util.Scanner;
//public class do_while03 {
//	public static void main(String args[]) {
//		Scanner sc = new Scanner(System.in);
//		int n1, n2;
//		String s , n;
//		System.out.println("�� ���� ��Ģ���� �����ڸ� �Է��ϼ���~");
//		do { 
//			System.out.println("��1>");
//			 n1 = sc.nextInt();
//			System.out.println("��2>");
//			 n2 = sc.nextInt();
//			System.out.println("������>");
//			s = sc.next();
//		switch (s) {
//			 
//			 case "+": //��Ʈ���� ������Ʈ�� �����ֱ�
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
//				 System.out.println("+,-,*,/,%�� �Ѱ��� �Է��ϼ���");
//			 
//			 }
//		System.out.println("��� �Է��Ͻðڽ��ϱ�?(N(n)�̸� ����, �׿� ���ڴ� ��� �Է� ����");
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
		System.out.println("�� ���� ��Ģ���� �����ڸ� �Է��ϼ���~");
		Scanner sc = new Scanner(System.in);
		do { 
			System.out.println("��1>");
			 n1 = sc.nextInt();
			System.out.println("��2>");
			 n2 = sc.nextInt();
			System.out.println("������>");
			s = sc.next();
		switch (s) {
			 
			 case "+": //��Ʈ���� ������Ʈ�� �����ֱ�
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
				 System.out.println("+,-,*,/,%�� �Ѱ��� �Է��ϼ���");
			 
			 }
		System.out.println("��� �Է��Ͻðڽ��ϱ�?(N(n)�̸� ����, �׿� ���ڴ� ��� �Է� ����");
			System.out.print("��� �Է�>");
			n= sc.next();
			
		}while (!(n.equals("n") ||n.equals("N"))); // ���� �ƴҰ��
			
			System.out.println("��.");
			sc.close();
		
		}	
}