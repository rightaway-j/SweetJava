package polymorphism11_26_04;

abstract class MessageSender {//클래스 추상 클래스로 선언
//	String returnPhoneNo, 
	String title;//제목
	String senderName;//발송자 이름
	
	MessageSender(String title, String senderName){ //기능 (메세드)
		this.title = title;
		this.senderName = senderName;
	}
		//추상 메소드- 메세지를 송신한다
	abstract void sendMessage(String recipient); //여기를 주석달면 main오류뜸 이걸로 메소드 호출 하는 척 (컴파일러를 통과하기위해)하면서 결과적으로는 서브 클래스의 메소드를 호출해줌
}//공통적인것은 뽑아내고 이부분의 기능은 각자 하기 위해서 abstract을 사용함

