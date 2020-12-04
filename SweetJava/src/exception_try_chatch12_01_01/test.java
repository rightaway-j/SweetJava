package exception_try_chatch12_01_01;

import java.util.Scanner;

public class test {
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("수를 입력하세요>");
		try{
			int n = sc.nextInt();
			System.out.println("입력한 데이터:" + n);
		}catch(java.util.InputMismatchException e){
			System.out.println("정수를 입력하세요");
		}
		finally {
		
			sc.close();
		}
		
	}
}
