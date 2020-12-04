package abstract_11_26_03;

abstract class MessageSender {//클래스 추상 클래스로 선언
//	String returnPhoneNo, 
	String title;//제목
	String senderName;//발송자 이름
	
	MessageSender(String title, String senderName){ //기능 (메세드)
		this.title = title;
		this.senderName = senderName;
	}
		//추상 메소드- 메세지를 송신한다
	abstract void sendMessage(String recipient);
}//공통적인것은 뽑아내고 이부분의 기능은 각자 하기 위해서 abstract을 사용함

