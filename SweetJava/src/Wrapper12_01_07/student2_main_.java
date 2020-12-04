package Wrapper12_01_07;

import java.util.Scanner;

public class student2_main_ {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		Student2[] hs = null;
		do {
			int menu = selectMenu(sc, hs);
			switch (menu) {
			case 1:
				hs = input(sc, hs);
				break;
			case 2:
				update(sc, hs);
				break;
			case 3:
				hs = delete(sc, hs);
				break;
			case 4:
				select(sc, hs);
				break;
			case 5:
				Student2.sort(hs);
				print(hs);
				break;
			case 6:
				close(sc); // 종료하기 위한 case
				return; // 메인을 끝낸다 -메인 종료
			}
		} while (true);// 무한 루프
	}

	private static int selectMenu(Scanner sc, Student2[] hs) {
		String[] menus = new String[] { "입력", "수정", "삭제", "조회", "출력", "종료" };
		for (int i=0; i < menus.length; i++) {}
		if (!(sc.equals(menus)))
			System.out.println(menus[0]);
		else
			System.out.println(menus);
		//end값 지정
		int end = menus[0].length();
		return inputNumber(sc, 1, end);// inputNumber메서드 호출
	}
								//메서드에서 , ( 등 오류 날때는 메인 메소드 괄호밖으로 잘 나와있는지 확인
	int inputNumber(Scanner sc, int start, int end) { // 여기서 start숫자와end숫자는 누가어디서 지정해주나,
		do {					
			try {
				String n = sc.nextLine();
				int a = Integer.parseInt(n);
				if (!(start <= a && a <= end)) {
					System.out.println(start + "~" + end + "사이의 숫자를 입력하세요>");
				} else
					break;
			} catch (java.lang.NumberFormatException e) {
				System.out.println("숫자로 입력하세요>");
			}

		} while (true);

		return;
	}
}
