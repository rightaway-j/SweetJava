package exception_try_chatch12_01_01;

import java.util.Scanner;

public class test {
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("���� �Է��ϼ���>");
		try{
			int n = sc.nextInt();
			System.out.println("�Է��� ������:" + n);
		}catch(java.util.InputMismatchException e){
			System.out.println("������ �Է��ϼ���");
		}
		finally {
		
			sc.close();
		}
		
	}
}
