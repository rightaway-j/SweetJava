package method11_23Mon;

public class method06 {
	public static void main(String[] args) {
		method04.printCharacter('=', 20); //아까 만들어뒀던 method04 class의 method가저옴./static객체생성없이 사용가능하기에 가져다가 바로 쓸 수 있다.
		System.out.println("합(1~10):" + sum(10));// 호출 방법1
		method04.printCharacter('=', 20);
		System.out.println("합(1~100):" + sum(100));
		method04.printCharacter('=', 20);
		int result = sum(100);//sum이라는 아니는 반환형이 int이고 인자값이 정수라면 매개변수는int형이다.
		System.out.println("합(1~100):" + result);
		method04.printCharacter('=', 20);
		result = sum(1000);// 호출방법2 //위에서 int로 변수 설정해줘서 여기는 안해줘도 됨.
		System.out.println("합(1~1000):" + result);// 메서드 호출(메서드 실행), 10:인자
	}

	public static int sum(int end) { // main 에 있던 구현을 sum에 저장, -반복 되기 때문에, 변하는 숫자 i<=10이부분을 end로 변경후 main에서 구현함
		int sum = 0;// sum을 넘겨줄거기때문에 void 에서 int로 변경
		for (int i = 1; i <= end; i++)
			sum += i;
//		System.out.println("합(1~" + end + "):" + sum); //이문장을 주석처리하면 아무런 출력이 없음.
		return sum;// 돌려주고 싶은게 i 이면 변경 가능

		// return; //여기서는 필수,돌아가야지 다음 문 구현가능하기 때문
	}

}
