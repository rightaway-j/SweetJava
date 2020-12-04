package Array;

import java.util.Scanner;

public class test_array_string02solve {
	public static void main(String args[]) {
		String names[] = { "홍길동", "이순신", "홍길동 ", "세종대왕", "김길동" };

		Scanner sc = new Scanner(System.in); // Scanner위에 ctrl shift o
		int index = -1;// 몇번방에 들어있는지 확인하는 변수로 초기값-1은 인덱스와 겹치지 않는 수를 사용합니다.

		System.out.println("검색할 이름을 입력하세요>");
		System.out.println("이름:");
		String inputname = sc.next();

		for (int i = names.length - 1; i >= 0; --i) { //인덱스는 0부터 세니까 i=4,3,2,1,0까지 가라는/뒤에서부터 찾는걸 생각하자.
			if (inputname.equals(names[i])) {
				index = i;// 마지막 인덱스 위치에서 부터 입력한 이름과 같은 이름을 찾는다
				break;// 입력한 이름과같은 이름을 찾으면 반복문 벗어난다.
			}
		}
		// 입력한 이름과 배열의 이름을 찾았을때
		if (index != -1) {
			System.out.println(inputname + "은 배열의 index=" + index + "방에서 찾았습니다.");
		} else//찾지못했을때
			
			System.out.println(inputname + "은 배열에서 찾지 못했습니다.");

		sc.close();
	}
}
