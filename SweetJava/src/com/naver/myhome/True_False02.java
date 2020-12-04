package com.naver.myhome;

public class True_False02 {
	public static void main(String args[]) {
		int a = 10, b = 4;
		boolean test; // true or false 값을 가짐
		
		test = a > b;
		System.out.println(a + ">"  + b + "=" + test);
		
		test = a < b;
		System.out.println(a + "<"  + b + "=" + test);
		
			// 산술연산자 a+b, a-b 연산 후 두 값을 비교
		System.out.println(a + b > a - b );
		
	}
}
