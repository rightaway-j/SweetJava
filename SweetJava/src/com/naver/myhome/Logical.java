package com.naver.myhome;

import java.io.InputStream;
import java.util.Scanner;
public class Logical {
	public static void main(String args[]) {
		InputStream in = System.in;
		Scanner sc = new Scanner(in);
		int num;
		
		System.out.println("���� �Է��ϼ���~>");
		num = sc.nextInt();
		
		if (num == 1 || num == 11) {
			System.out.println("1�Ǵ� 11�Դϴ�.");
		} else {
			System.out.println("1�Ǵ� 11�� �ƴմϴ�.");
		}
		sc.close();
	}
}
