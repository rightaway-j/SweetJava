package polymorphism11_26_04;

/*
 * 생성자 매개변수: 
 * 
 */
class BonusPointAccount extends Account1 {
	int bonusPoint; // 필드 bonusPoint 매개변수의 값으로 초기화

	BonusPointAccount(String accountNo, String ownerName, int balance, int bonusPoint) {
		super(accountNo, ownerName, balance); // 슈퍼 클래스 (Account)의 매개변수 3개를 가진 생성자 호출하기
		this.bonusPoint = bonusPoint;
	}
//메소드 오버라이딩= 인출한다 기능 다시 구현
// 상속관계,부모 크래스의 선언부와 일치(리턴값 타입,메서드 이름, 매개변수 목록)
//접근 제어자의 범위는 같거나 넓어야 한다

//메서드 오버라이딩 하기
//메서드명: deposit
//기능:잔액을 매개 변수값(입금액)으로 합하고 bonusPoint를 매개 변수값(입금엑)의0.1% 적립한다.
	void deposit(int amount)  {// 인출한다.
		balance += amount;//super.balance += amount;
		bonusPoint = (int) (amount * 0.001);//0.1%이지만 %인식을 못하므로 소수점 두개 더 뒤로 가서 넣어준다.
	}

}
