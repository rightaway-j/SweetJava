package Wrapper12_01_07;

import java.util.ArrayList;
import java.util.Scanner;
//값을 저장해줘도 실행이 꺼지면 사라짐 , 그걸 보안하기 위해 data base사용한다.
public class student2_main_solve4_arraylist12_03 {
	public static int number; //

	public static void main(String args[]) {
		ArrayList<Student2_ArrayList> hs = new ArrayList<Student2_ArrayList>();// 초기값을 주지않아도 된다 null은 배열선언을 한뒤 사용하는 초기화
		Scanner sc = new Scanner(System.in);
		 // 받어온 객체를 넣어야하니 각 케이스별로 바뀐것을 저장할수 있도록 만들어짐
		do {
			int menu = selectMenu(sc, hs);//1
			switch (menu) {
			case 1:
				 input(sc, hs);//반환형이 없으니 hs.= 은 사라짐
				break;
			case 2:
				update(sc, hs);
				break;
			case 3:
				 delete(sc, hs);
				break;
			case 4:
				select(sc, hs);
				break;
			case 5:
				Student2_ArrayList.sort(hs);
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

	private static void print(ArrayList<Student2_ArrayList> hs) {
		System.out.println("=================학생별/      과목별       총점구하기==============");
		System.out.println("번호\t이름\t국어\t영어\t수학\t총점\t평균");
		for (int i = 0; i < hs.size() ; i++) { //ArrayList에서 size를 어떻게 쓰지?
			System.out.println(hs.get(i).toString());
		}

	}

	private static void input(Scanner sc, ArrayList<Student2_ArrayList> hs) {
		// 인원수 만큼 배열을 만들고 각 정보를 그곳에 저장할거다 //for문으로 인덱스 처리 가능

		System.out.println("입력할 인원수를 입력하세요(1~10)>");
		int inwon = inputNumber(sc, 1, 10);
		int index = 0;

		do {
			System.out.println("이름을 입력하세요>");
			String name = inputName(sc);

			System.out.println("국어점수를 입력하세요>");
			int kor = inputNumber(sc, 0, 100);

			System.out.println("영어점수를 입력하세요>");
			int eng = inputNumber(sc, 0, 100);

			System.out.println("수학점수를 입력하세요>");
			int math = inputNumber(sc, 0, 100);

			hs.add(new Student2_ArrayList(name, kor, eng, math, ++number)); //만들어준 것들을 add에 넣어서 사용
			
		} while (++index < inwon);
	
	}

	private static String inputName(Scanner sc) {
		String name = "";
		while (true) {
			name = sc.nextLine().trim();
			if (name.length() > 0) {
				break;
			} else {
				System.out.print("이름을 입력하세요>");

			}
		}
		return name;
	}

	private static int getIndex(Scanner sc, ArrayList<Student2_ArrayList> hs){ 
		int searchNo = inputNumber(sc,1, number);
		
		for (int i = 0; i < hs.size(); i++) {
			if (searchNo == hs.get(i).getNo()) { //i => 몇번째 있는지 확인
				
				return i;//원하는 i 값 찾으면 종료  //if (index == -1) { System.out.println("수정할 번호가 존재하지 않습니다.");}	
			}
		}
		return -1;//위에서 원하는 값이 없으면 내려와서 -1리턴//indexOf에서 원하는 값 없을때 -1retrun하는 것과 같음
	}
	private static void update(Scanner sc, ArrayList<Student2_ArrayList> hs) {
		
		System.out.println("수정할 번호를 입력하세요>");	
		int index = getIndex(sc, hs);
		
		if (index == -1) { 
			System.out.println("수정할 번호가 존재하지 않습니다.");	
		}else {
			while (true) {
				int updateItem = getUpdateItem(sc);
				switch(updateItem) {
				case 1:
					System.out.print("이름을 입력하세요>");
					hs.get(index).setName(inputName(sc));
					break;
					
				case 2:
				System.out.print("국어 점수를 입력하세요>");
					int kor = inputNumber(sc, 0, 100);
					hs.get(index).setKor(kor);
					break;
					
				case 3:
					System.out.print("영어 점수를 입력하세요>");
					int eng = inputNumber(sc, 0, 100);
					hs.get(index).setEng(eng);
					break;
					
				case 4:
					System.out.print("수학 점수를 입력하세요>");
					int math = inputNumber(sc, 0, 100);
					hs.get(index).setMath(math);
					break;
					
				case 5:
					return;
				}
			}
			
			
		}
		
	}

	private static int getUpdateItem(Scanner sc) {
		String[] items = {"이름", "국어", " 영어", "수학", "종료"};
		int count=1; // items앞에 숫자 순서대로 입력하는 중
		for(String item: items) {
			System.out.println(count++ +"."+ item);
		}
		System.out.print("수정할 항목을 선택하세요>");
		return inputNumber(sc, 1, items.length);
	}

	private static void delete(Scanner sc, ArrayList<Student2_ArrayList> hs) {

		System.out.println("삭제할 번호를 입력하세요>");
		int index = getIndex(sc, hs);
		
		if (index != -1) {
		Student2_ArrayList.korTotal -= hs.get(index).getKor(); //삭제전 과목별 토탈값을 빼줘야 함
		Student2_ArrayList.engTotal -= hs.get(index).getEng();
		Student2_ArrayList.mathTotal -= hs.get(index).getMath();
		}else {
			System.out.println("삭제할 번호가 존재하지 않습니다.");
		}
	}

	private static int selectMenu(Scanner sc, ArrayList<Student2_ArrayList> hs) {
		String[] menus = new String[] { "입력", "수정", "삭제", "조회", "출력", "종료" };
		int end = 1;
		if (hs != null && hs.size() > 0) { // 경우에 따라 end값이 가변적이라서 변수로 만듬. hs의 초기값은 null = lenth사용 불가/ 널인지 아닌지!로 확인
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

	private static void select(Scanner sc, ArrayList<Student2_ArrayList> hs) {// 이안에 번호가 있는지 없는지 확인하고 없으면 없다. 있으면 삭제할거냐, 삭제;
		System.out.print("조회할 번호를 입력하세요>");
		int index = getIndex(sc,hs);
		
		
		if (index != -1) {
			printCharacter('=', 53);
			System.out.println("\t번호\t이름\t국어\t영어\t수학\t총점\t평균");
			System.out.println(hs.get(index).toString());
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
