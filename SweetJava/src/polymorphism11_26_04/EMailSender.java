package polymorphism11_26_04;

class EMailSender extends MessageSender {
	String senderAddr;//발송자 이메일 주소
	String emailBody;//이메일 주소

	EMailSender(String title, String senderName, String senderAddr, String emailBody) {

		super(title, senderName);
		this.senderAddr = senderAddr;
		this.emailBody = emailBody;
	}

	@Override//슈퍼 클래스의 메소드를오버라이드 하는 메소드
	//푸상 메소드를 구현(implement )
	void sendMessage(String recipient) {//부모에도 있지만 오버라이드해서 자식거를 가져온 거다!!!!!!
		System.out.println("------------------------------");
		System.out.println("제목: " + title);
		System.out.println("보내는 사람: " + senderName + "\n" + "보낸 주소 : " + senderAddr);
		System.out.println("받는 사람: " + recipient);
		System.out.println("내용: " + emailBody);

	}

}
