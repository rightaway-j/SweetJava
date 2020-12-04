package abstract_11_26_03;

public class Inheritance_emailSender_test {
	public static void main(String args[]) {
		EMailSender obj1 = new EMailSender("생일을 축하합니다", "고객센터", "admin@khshop.co.kr", "10%할인쿠폰이 발생되었습니다");//객체생성

		// 추상 메서드를 구현한 메소드를 호출
		obj1.sendMessage("hoho@naver.com");

		SMSSender obj2 = new SMSSender("생일을 축하합니다", "고객센터", "02-12-1212", "10%할인쿠폰이 발생되었습니다");

		obj2.sendMessage("02-1253-456"); //부모에도 있지만 오버라이드해서 자식거를 가져온 거다!!!!!!

	}
}
