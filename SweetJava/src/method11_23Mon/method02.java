package method11_23Mon;

public class method02 {
	// 접근제어자     객체생성하지 않고 사용하기위한/method이름(매개변수 목록)
	public static void main(String args[]) { //여기도 method중 하나이다. jvm이 호출해줌.
		//메서드 호출 방법1 - 크래스명, 정적메서드(static이 있으면 정적)
		method02.printCharacter('*', 30);//메서드 호출(매개변수에 넣어준 값과 타입,개수 맞춰준다)//인자 argument
		
		return;//반환형이 void인경우 생략가능.끝내주는 기능, 나를 호출해준 곳으로 가라 - jvm
		
		
		
	}	
	//method정의 //저장해두고 main에서 실행해준다.-실행문은 main에 넣어줘야함
	public static void printCharacter(char ch, int num) {	//매개변수에는 내가 필요한 것을 넣어줌
		for(int cnt = 0; cnt<num; cnt++)
			System.out.print(ch);
		System.out.println();
		return;//반환형이 void 인 경우 생략 가능하다.
		
		
	}
}
