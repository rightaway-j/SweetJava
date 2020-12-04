package Wrapper12_01_07;

import java.util.Scanner;

public class student2_main_solve2 {
	public static int number; //

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		Student2[] hs = null; // 받어온 객체를 넣어야하니 각 케이스별로 바뀐것을 저장할수 있도록 만들어짐
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

	private static void close(Scanner sc) {
		sc.close(); // 중간에 종료를 해버리면 다음 인풋이 어려움으로 메서드로 빼서 계속 실행 시켜줌
	}

	private static void print(Student2[] hs) {
		System.out.println("=================학생별/      과목별       총점구하기==============");
		System.out.println("번호\t이름\t국어\t영어\t수학\t총점\t평균");
		for (int i = 0; i < hs.length; i++) {
			System.out.println(hs[i].toString());
		}

	}

	private static Student2[] input(Scanner sc, Student2[] hs) {
		// 인원수 만큼 배열을 만들고 각 정보를 그곳에 저장할거다 //for문으로 인덱스 처리 가능

		System.out.println("입력할 인원수를 입력하세요(1~10)>");
		int inwon = inputNumber(sc, 1, 10);
		Student2[] copy =null;
		int index = 0;
		if (hs != null && hs.length >= 1) {
			inwon = inwon =hs.length;
			index = hs.length; //2개 앞에 있고 3번째에 넣어준다, 넣어줄 값 위치. (어디서부터 넣어줄지)
			copy = new Student2[inwon];
			for(int i =0; i < hs.length; i++) {
				copy[i] = hs[i];
			}
		}else {
			copy = new Student2[inwon];
		}
		
		do {
			System.out.println("이름을 입력하세요>");
			String name = inputName(sc);
			
			System.out.println("국어점수를 입력하세요>");
			int kor = inputNumber(sc, 0, 100);

			System.out.println("영어점수를 입력하세요>");
			int eng = inputNumber(sc, 0, 100);

			System.out.println("수학점수를 입력하세요>");
			int math = inputNumber(sc, 0, 100);

			copy[index] = new Student2(name, kor, eng, math, ++number);
			index++;
		} while (index < inwon);
		return copy;
	}

	private static String inputName(Scanner sc) {
		String name = "";
		while (true) {
			name = sc.nextLine().trim();
			if (name.length()> 0) {
				break;
			}else {
				System.out.print("이름을 입력하세요>");
				
			}
		}
		return name;
	}

	private static void update(Scanner sc, Student2[] hs) {
		String[] sujung = new String[] { "이름", "국어점수", "영어점수", "수학점수" };
		System.out.println("수정할 번호를 입력하세요>");		//수정할 목록 보여주기
		int end = 1;
		if (hs != null && hs.length > 0) { 
			end = sujung.length; 
		}
		for (int i = 0; i < end; i++) {
			System.out.println((i + 1) + "." + sujung[i]); // 수정목록 앞에 숫자를 붙여줌
		}
		
		//입력받은 값 String 에 넣어서 변경?			//수정할 번호를 인덱스에서 찾기
		int searchNo = inputNumber(sc,1,sujung.length); //인덱스 범위에서 벗어나면 조회할 번호가 없다고 출령해야함
				
		int index = -1;
				switch(searchNo) {
				case 1:
					for (int i = 0; i < hs.length; i++) {
						if (hs[i].getNo() == searchNo) {
							index = i;
					System.out.println("이름:");
					hs[i].setName( inputName(sc));
					
					break;}}
					
				case 2:
					for (int i = 0; i < hs.length; i++) {
						if (hs[i].getNo() == searchNo) {
							index = i;
					System.out.println("국어점수:");
					hs[i].setKor(inputNumber(sc,0,100 ));
					break;}}
				case 3:
					for (int i = 0; i < hs.length; i++) {
						if (hs[i].getNo() == searchNo) {
							index = i;
					System.out.println("영어점수:");
					hs[i].setEng(inputNumber(sc,0,100));
					break;}}
				case 4:
					for (int i = 0; i < hs.length; i++) {
						if (hs[i].getNo() == searchNo) {
							index = i;
					System.out.println("수학점수:");
					hs[i].setMath(inputNumber(sc,0,100));
					break;}}
					return;
				}
									//수정할 목록을 입력받기				
			}

		int getIndex(Scanner sc, Student2[] hs){
			int searchNo = inputNumber(sc,1,sujung.length);
			int index = -1;
			for (int i = 0; i < hs.length; i++) {
				if (hs[i].getNo() == searchNo) {
					index = i;
		}


	private static Student2[] delete(Scanner sc, Student2[] hs) {
		
		System.out.println("삭제");
		return null;
	}

	private static int selectMenu(Scanner sc, Student2[] hs) {
		String[] menus = new String[] { "입력", "수정", "삭제", "조회", "출력", "종료" };
		int end = 1;
		if (hs != null && hs.length > 0) { // 경우에 따라 end값이 가변적이라서 변수로 만듬. hs의 초기값은 null = lenth사용 불가/ 널인지 아닌지!로 확인
			end = menus.length; // hs를 어떻게 사용해야 하는지 몰랐음..
		}
		printCharacter('*', 53); // 구분 줄 메서드로 만든것(이전시간에 했던것임)

		for (int i = 0; i < end; i++) {
			System.out.println((i + 1) + "." + menus[i]); // 메뉴 앞에 숫자를 붙여줌
		}

		printCharacter('*', 53);

		System.out.print("메뉴를 선택하세요>");

		return inputNumber(sc, 1, end); // 사용하기 위해 호출
	}

	private static void select(Scanner sc, Student2[] hs) {// 이안에 번호가 있는지 없는지 확인하고 없으면 없다. 있으면 삭제할거냐, 삭제;
		System.out.print("조회할 번호를 입력하세요>");
		int searchNo = inputNumber(sc, 1, number); // number을 조회나 삭제할때 사용 맨위 main 아래에 위치하였다.
		int index = -1;
		for (int i = 0; i < hs.length; i++) {
			if (hs[i].getNo() == searchNo) {
				index = i;
				break;

			}
		}
		if (index != -1) {
			printCharacter('=', 53);
			System.out.println("\t번호\t이름\t국어\t영어\t수학\t총점\t평균");
			System.out.println(hs[index].toString());
			printCharacter('=', 53);
		} else {
			System.out.println("조회할 번호가 존재하지 않습니다.");
		}

	}

	private static void printCharacter(char c, int count) {
		for (int i = 0; i < count; i++) {
			System.out.print(c);
		}
		System.out.println();
	}

	// 메서드에서 , ( 등 오류 날때는 메인 메소드 괄호밖으로 잘 나와있는지 확인
	private static int inputNumber(Scanner sc, int start, int end) { // 여기서 start숫자와end숫자는 누가어디서 지정해주나,
		int input = 0;

		while (true) { // 무한루프로 돌린것
			try {
				input = Integer.parseInt(sc.nextLine()); // 숫자를 인풋에 저장
				if (start <= end && input >= start) {
					break;
				} else {
					System.out.println(start + "~" + end + "사이의 숫자를 입력하세요>");
				}
			} catch (java.lang.NumberFormatException e) {
				System.out.println("숫자로 입력하세요>");
			}
 
		}

		return input;
	}
}
