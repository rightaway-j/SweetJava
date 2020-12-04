package com.naver.myhome;

public class ConcatExample1 {
	public static void main(String args[]) {
		String str1 = "num =" + 3 +  4;
		System.out.println(str1);
		
		String str2 = 3 + 4 + "=num";//숫자계산후 문자열을 더해주니 7 = num
		System.out.println(str2);
		
		String str3 = "num=" + (3 + 4);
		System.out.println(str3);
		
		str1 = "" + 3 + 4; //빈문자열 숫자 = 연결로 문자열 
		System.out.println(str1);
	}
	//num=34
	//34=num
	//num = 7
	//7
}
