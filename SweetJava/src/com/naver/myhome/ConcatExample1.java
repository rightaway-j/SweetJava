package com.naver.myhome;

public class ConcatExample1 {
	public static void main(String args[]) {
		String str1 = "num =" + 3 +  4;
		System.out.println(str1);
		
		String str2 = 3 + 4 + "=num";//���ڰ���� ���ڿ��� �����ִ� 7 = num
		System.out.println(str2);
		
		String str3 = "num=" + (3 + 4);
		System.out.println(str3);
		
		str1 = "" + 3 + 4; //���ڿ� ���� = ����� ���ڿ� 
		System.out.println(str1);
	}
	//num=34
	//34=num
	//num = 7
	//7
}
