package com.naver.myhome;
/* 
 * 입력받은 수가
 * 1-9 사이면 "10세미만"
 * 10-19이면 " 10대"
 * 20-29이면 "20대"
 * 30-39이면" 30대"
 * 40-49이면"40대"이라고 출력한다
 *  if 문을 사용
 */
import java.io.InputStream;
import java.util.Scanner;
public class Test04_import_if_and_else_oper {
	public static void main(String args[]) {
		InputStream in = System.in;
		Scanner sc = new Scanner (in);
		int num;
		
		System.out.println("나이를 입력하세요>");
		num = sc.nextInt();
		
//		if (num <= 9 ) {
//			System.out.print("10세 미만");
//		}if(num >= 10 && num <=19  ){ 
//			System.out.print("10대");
//		}if(num >= 20 && num <=29  ){ 
//			System.out.print("20대");
//		}if(num >= 30 && num <=39  ){ 
//			System.out.print("30대");
//		}if(num >= 40 && num <=49  ){ 
//			System.out.print("40대");
//		}
		
		//if,else만 사용하여 해결
		int dae = num/10*10;
		if ( dae == 0) {
			System.out.println("10세 미만");
	}else{
				System.out.println(dae + "대");
			}
		sc.close();
	}

}
