package Operator;

import java.io.PrintStream;
import java.util.Scanner;

public class Oper04_2solve {
	 public static void main(String args[]){
		 System.out.print("정수를 입력하세요:");
		 Scanner sc = new Scanner(System.in);
		int data = sc.nextInt();
		int pandan = data % 2;
		System.out.println("data%2의 값 " + pandan + "입니다.");
		//if(data % 3 == 0){
			//	System.out.println(data + "3의 배수");
//	 }else {
//		 System.out println(data + "3의 배수가 아닙니다.");
//	 }
	if(pandan == 0) {  
		System.out.println(data + "은 짝수");
	}else{
		System.out.println(data + "은 홀수");
	}
	sc.close();	
	 }
}
