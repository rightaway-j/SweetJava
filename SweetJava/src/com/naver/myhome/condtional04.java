package com.naver.myhome;

public class condtional04 {
	public static void main(String args[]) {
//		int a = 20, b = 30, max;
//		
//		System.out.println(a > b ? a : b);
//		
//		max = a > b ? a : b; //a<b라면 최소값이 구해진다.
//		System.out.println("최대값 =" + max);
		int a = 20, b = 30, min;
		
		System.out.println(a < b ? a : b);
		
		min = a < b ? a : b; //a<b라면 최소값이 구해진다.
		System.out.println("최소값 =" + min);
	}
}
