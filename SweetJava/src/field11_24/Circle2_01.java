package field11_24;

import java.util.Scanner;

public class Circle2_01 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("반지름을 입력하세요>");
		 int radius = sc.nextInt();
		 Circle2 a = new();
		 System.out.println("원의 반지름=" + radius);
		 System.out.println("원의 넓이=" + area );
		 
		 
		
		sc.close();//메인안에 넣어주기
	}
}
