package com.naver.myhome;

import java.io.InputStream;
import java.util.Scanner;
public class Logical {
	public static void main(String args[]) {
		InputStream in = System.in;
		Scanner sc = new Scanner(in);
		int num;
		
		System.out.println("수를 입력하세요~>");
		num = sc.nextInt();
		
		if (num == 1 || num == 11) {
			System.out.println("1또는 11입니다.");
		} else {
			System.out.println("1또는 11이 아닙니다.");
		}
		sc.close();
	}
}
