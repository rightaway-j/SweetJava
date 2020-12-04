package method11_23Mon;

public class method03 {
	// 접근제어자     객체생성하지 않고 사용하기위한/method이름(매개변수 목록)
	public static void main(String args[]) {
		 
	}	
	//method정의 //저장해두고 main에서 실행해준다.-실행문은 main에 넣어줘야함
	public static void printCharacter(char ch, int num) {	//매개변수에는 내가 필요한 것을 넣어줌
		for(int cnt = 0; cnt<num; cnt++)
			System.out.print(ch);
		System.out.println();
		return;//반환형이 void 인 경우 생략 가능하다.
		
		
	}
}
