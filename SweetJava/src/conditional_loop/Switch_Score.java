package conditional_loop; 

import java.util.Scanner;

public class Switch_Score {
	public static void main(String args[]) {
		System.out.println("점수를 입력하세요>");
		Scanner sc = new Scanner(System.in);
		int jumsu = sc.nextInt(); // s= 95;
//몫을 구하지 않고 사용하려면 int jumsu자리에 mok 을 넣어준다.
		int mok = jumsu / 10;   //몫에 따른 결과값을 가져오기위해 첨수를 목에 넣어주고 스위치는 목을 가져줌
		switch (mok) {

		case 9:
		case 10:
			System.out.println("A학점");
			break;
		case 8:
			System.out.println("B학점");
			break;
		case 7:
			System.out.println("C학점");
			break;
		case 6:
			System.out.println("D학점");
			break;
		default :
			System.out.println("F학점");
			
	
			System.out.println("끝.");

		}
		sc.close();
	}
}
