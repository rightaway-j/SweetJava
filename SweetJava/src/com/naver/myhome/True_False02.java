package com.naver.myhome;

public class True_False02 {
	public static void main(String args[]) {
		int a = 10, b = 4;
		boolean test; // true or false ���� ����
		
		test = a > b;
		System.out.println(a + ">"  + b + "=" + test);
		
		test = a < b;
		System.out.println(a + "<"  + b + "=" + test);
		
			// ��������� a+b, a-b ���� �� �� ���� ��
		System.out.println(a + b > a - b );
		
	}
}
