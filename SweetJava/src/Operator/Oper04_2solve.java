package Operator;

import java.io.PrintStream;
import java.util.Scanner;

public class Oper04_2solve {
	 public static void main(String args[]){
		 System.out.print("������ �Է��ϼ���:");
		 Scanner sc = new Scanner(System.in);
		int data = sc.nextInt();
		int pandan = data % 2;
		System.out.println("data%2�� �� " + pandan + "�Դϴ�.");
		//if(data % 3 == 0){
			//	System.out.println(data + "3�� ���");
//	 }else {
//		 System.out println(data + "3�� ����� �ƴմϴ�.");
//	 }
	if(pandan == 0) {  
		System.out.println(data + "�� ¦��");
	}else{
		System.out.println(data + "�� Ȧ��");
	}
	sc.close();	
	 }
}
