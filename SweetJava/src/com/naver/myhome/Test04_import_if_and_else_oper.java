package com.naver.myhome;
/* 
 * �Է¹��� ����
 * 1-9 ���̸� "10���̸�"
 * 10-19�̸� " 10��"
 * 20-29�̸� "20��"
 * 30-39�̸�" 30��"
 * 40-49�̸�"40��"�̶�� ����Ѵ�
 *  if ���� ���
 */
import java.io.InputStream;
import java.util.Scanner;
public class Test04_import_if_and_else_oper {
	public static void main(String args[]) {
		InputStream in = System.in;
		Scanner sc = new Scanner (in);
		int num;
		
		System.out.println("���̸� �Է��ϼ���>");
		num = sc.nextInt();
		
//		if (num <= 9 ) {
//			System.out.print("10�� �̸�");
//		}if(num >= 10 && num <=19  ){ 
//			System.out.print("10��");
//		}if(num >= 20 && num <=29  ){ 
//			System.out.print("20��");
//		}if(num >= 30 && num <=39  ){ 
//			System.out.print("30��");
//		}if(num >= 40 && num <=49  ){ 
//			System.out.print("40��");
//		}
		
		//if,else�� ����Ͽ� �ذ�
		int dae = num/10*10;
		if ( dae == 0) {
			System.out.println("10�� �̸�");
	}else{
				System.out.println(dae + "��");
			}
		sc.close();
	}

}
