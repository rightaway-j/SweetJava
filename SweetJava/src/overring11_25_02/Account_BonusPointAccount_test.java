package overring11_25_02;

public class Account_BonusPointAccount_test {
	public static void main(String args[]) {
		/*
		 * 오류발생 CheckingAccount obj = new CheckingAccount();
		 */
		BonusPointAccount obj = new BonusPointAccount("111-22-3333333", "김미영", 0, 0);// 생성자 호출

		obj.deposit(10000000);// 상속 받은 메소드
		System.out.println("잔액" + obj.balance);
		System.out.println("누적 포인트:" + obj.bonusPoint);

	}
}
