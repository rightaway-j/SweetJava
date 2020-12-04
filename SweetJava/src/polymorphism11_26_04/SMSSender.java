package polymorphism11_26_04;

class SMSSender extends MessageSender {
	String returnPhoneNo;
	String message;

	SMSSender(String title, String senderName, String returnPhoneNo, String message) {

		super(title, senderName);//부모꺼 초기화
		this.returnPhoneNo = returnPhoneNo;//초기화
		this.message = message;
	}
//imprlement = 구현하다. sendMessage를 구현하다
	//슈퍼 클레스의 메소드를 오버라이드 하는 메소드

	@Override
	void sendMessage(String recipient) {
		// TODO Auto-generated method stub
		System.out.println("------------------------------");
		System.out.println("제목: " + title);
		System.out.println("보내는 사람: " + senderName);
		System.out.println("전화번호: " + recipient);
		System.out.println("회신 전화번호: " + returnPhoneNo);
		System.out.println("메시지 내용: " + message);
	}

}
