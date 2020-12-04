package polymorphism11_26_04;

// 모든 클래스의 조상은 object클래스이다.
// 다른 클래스로 부터 상속 받지 않는 모든 클래스들은 자동적으로 object클래스로 부터 상속 받느다.
public class Account1 {// 컴파일러가 extends object를 추가한다.
	String accountNo; // 계좌 번호 //클래스 구성요소							//변수 선언(iv)
	String ownerName; // 예금주 이름
	int balance; // 잔액
//기본 생성자를컴파일러가 알아서 추가해줌
	Account1 (String accountNo,String ownerName , int balance){ 	//생성자
	this.accountNo = accountNo;
	this.ownerName = ownerName;
	this.balance = balance;
	}
	void deposit(int amount) { // int a 매개변수 넣어준것//예금한다.			//메서드
		balance += amount; // balance = balance + a;
	}

	int withdraw(int amount) throws Exception {// 인출한다.			//메서드
		if (balance < amount) {
			throw new Exception("잔액이 부족합니다.");
		}
		balance -= amount;
		return amount;
	}

}
