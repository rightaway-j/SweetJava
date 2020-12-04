package overriding11_25;
/*
 * 생성자 매개변수: 
 * 
 */
class CreditLineAccount extends Account1 {
int creditline; // 마이넛 한도 필드
CreditLineAccount(String accountNo, String ownerName, int valance, int creditLine){
	super(accountNo, ownerName, valance);
	this.creditline = creditLine;
}
//메소드 오버라이딩= 인출한다 기능 다시 구현
// 상속관계,부모 크래스의 선언부와 일치(리턴값 타입,메서드 이름, 매개변수 목록)
//접근 제어자의 범위는 같거나 넓어야 한다

//
int withdraw(int amount) throws Exception {// 인출한다.
	if ((balance + creditline) < amount) {
		throw new Exception("인출이 불가능 합니다.");
	}
	balance -= amount;
	return amount;
}

}
