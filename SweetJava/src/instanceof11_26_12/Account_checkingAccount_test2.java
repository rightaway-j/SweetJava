package instanceof11_26_12;
//
public class Account_checkingAccount_test2 {
	public static void main(String args[]) {
		Account1 obj = new Account1("1112-22-333333", "홍길동", 100000);
		// obj를 checkingAccount로 캐스트 가능한 여부 확인((CheckingAccount)obj)
		if (obj instanceof CheckingAccount) {
			// obj를 checkingAccount로 캐스트할 수 있을때만 pay메서드 호출
			pay((CheckingAccount) obj);

		} else {
			// obj를 CheckintAcckount로 캐스트할 수 없을 경우
			System.out.println("캐스트할수 없는 타입이다");
		}
	}

	static void pay(CheckingAccount obj) {
		try {
			int paidAmount = obj.pay("5555-6666-7777-8888", 47000);
			System.out.println("지불액:" + paidAmount);
			System.out.println("잔액" + obj.balance);
		} catch (Exception e) {
			String msg = e.getMessage(); // 오류가 발생하면 내가 작성한 메세지를 보여라
			System.out.println(msg);
		}
	}
}
