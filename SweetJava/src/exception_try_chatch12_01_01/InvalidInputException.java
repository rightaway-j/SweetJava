package exception_try_chatch12_01_01;
//사용자 정의 Exception 클래스의 선언 예
public class InvalidInputException extends Exception {
	InvalidInputException(){
		//슈퍼 클래스의 생성자를 호출하여 에러 메시지를 저장한다.
		super("잘못 된 입력입니다."); //상속을 받으면 부모의 것들을 가져와야 하므로 이렇게 작성
	} 
	
}
