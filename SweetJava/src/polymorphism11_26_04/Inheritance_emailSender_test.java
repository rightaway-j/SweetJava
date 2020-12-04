package polymorphism11_26_04;

public class Inheritance_emailSender_test {
	public static void main(String args[]) {
		EMailSender obj1 = new EMailSender("생일을 축하합니다", "고객센터", "admin@khshop.co.kr", "10%할인쿠폰이 발생되었습니다");

		// 추상 메서드를 구현한 메소드를 호출
		//obj1.sendMessage("hoho@naver.com");

		SMSSender obj2 = new SMSSender("생일을 축하합니다", "고객센터", "02-12-1212", "10%할인쿠폰이 발생되었습니다");

		//obj2.sendMessage("02-1253-456"); //부모에도 있지만 오버라이드해서 자식거를 가져온 거다!!!!!!
		
		//서브 클래스 객체 obj1,obj2를 가지고 메소드를 호출
		send(obj1, "hatman@yeyeye.com");
		send(obj1, "stickman@hahaha.com");
		send(obj2, "010-0000-0000");
		

	}

	//MessageSender obj:슈퍼 클래스 타입의 파라미터
 static void send(MessageSender obj, String recipient) {
	obj.sendMessage(recipient);
	//어느 클래스의 sendmessage메소드가 호출될까요?
	//EMailSender 또는 SMSSender
	
	}
	
	
}
