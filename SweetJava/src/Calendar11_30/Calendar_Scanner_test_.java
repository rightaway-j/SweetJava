package Calendar11_30;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Calendar_Scanner_test_ {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		System.out.println("출력할 년도를 입력하세요>");
		int year = sc.nextInt();

		System.out.println("출력할 달을 입력하세요>");
		int month = sc.nextInt();

		sc.close();
		// c의 매개변수로 년, 월, 일 넣을 수 있다
		GregorianCalendar c = new GregorianCalendar(year, month - 1, 1);// 1일이 언제인지 알아야 공백을 채울 수 있다//구하고자 하는 달의 -1을 해줘야
																		// 구해짐,

		// 마지막 날을 구한다
		int lastday = c.getActualMaximum(Calendar.DATE);

		int s = c.get(Calendar.DAY_OF_WEEK);//GregorianCalendar의 DAY_OF_WEEK를 가져와 달라, 그리고 변수 s에 담는다.

		String[] yoil = { "일", "월", "화", "수", "목", "금", "토" };
		System.out.print("\t\t\t" + c.get(Calendar.YEAR) + "년");
		System.out.print((c.get(Calendar.MONTH) + 1) + "월" + "\n");
		for (int i = 0; i < yoil.length; i++) {
			System.out.print(yoil[i] + "\t");
		}
		System.out.println();

		// 시작이 일요일일 경우 s=1 공백 없음 i=1 2 3 4 5 6 7
		// 시작이 일요일일 경우 s=2 공백 한개 i=0 1 2 3 4 5 6
		// 시작이 일요일일 경우 s=3 공백 두개 i=-1 0 1 2 3 4 5
		// 시작이 일요일일 경우 s=4 공백 세개 i=-2 -1 0 1 2 3 4
		// 시작이 일요일일 경우 s=5 공백 네개 i=-3 -2 -1 0 1 2 3
		// 시작이 일요일일 경우 s=6 공백 다섯개 i=-4 -3 -2 -1 0 1 2
		// 시작이 일요일일 경우 s=7 공백 여섯개 i=-5 -4 -3 -2 -1 0 1

		for (int i = 2 - s; i <= lastday; i++) { // s+i = 2 => i =2-s
			if (i <= 0) {

				System.out.printf("\t");
			} else {
				System.out.printf(i + "\t");

			}
			// 시작이 일요일인 경운 s=1 출력 1 2 3 4 5 6 7
			// 시작이 일요일인 경운 s=2 출력 1 2 3 4 5 6
			// 시작이 일요일인 경운 s=3 출력 1 2 3 4 5
			// 시작이 일요일인 경운 s=4 출력 1 2 3 4
			// 시작이 일요일인 경운 s=5 출력 1 2 3
			// 시작이 일요일인 경운 s=6 출력 1 2
			// 시작이 일요일인 경운 s=7 출력 1

			if ((i + s) % 7 == 1) // 더한8에서 7로 만들어 주기에 -1//총 합이 8로 되어야함 ((i+s-1)%7 == 0 으로도 가능
				// 7가지 경우의 수를 따져야 하기 때문에 한가지만 다루던 if (i % 7 == 5)와는 경우가 다름.

				System.out.println("\n");
		}
	}
}
