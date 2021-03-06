package inheritance11_25;

// 모든 클래스의 조상은 object클래스이다.
// 다른 클래스로 부터 상속 받지 않는 모든 클래스들은 자동적으로 object클래스로 부터 상속 받느다.
public class Account1 {// 컴파일러가 extends object를 추가한다.
	String accountNo; // 계좌 번호 //클래스 구성요소
	String ownerName; // 예금주 이름
	int balance; // 잔액

	void deposit(int amount) { // int a 매개변수 넣어준것//예금한다.
		balance += amount; // balance = balance + a;
	}

	int withdraw(int amount) throws Exception {// 인출한다.
		if (balance < amount) {
			throw new Exception("잔액이 부족합니다.");
		}
		balance -= amount;
		return amount;
	}

}
