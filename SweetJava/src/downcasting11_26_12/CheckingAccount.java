package downcasting11_26_12;

class CheckingAccount extends Account1 {
	String cardNo; //직불 카드 번호
	
	/*
	 
	 */
	//직불카드 사용액을 지불한다에 해당하는 메소드
	//생성자의 첫 줄에서 조상 클래스의 생성자를 호출하느데 자손 클래스의 멤버가 부모 클래스의멤버를 사용할 수 있으므로 부모의 멤버들리 먼저 초기화되어 있어야 합니다.
	CheckingAccount(String accountNo, String ownerName, int balance, String cardNo){
		//생성자 첫 줄에서 부모 생성자를 호출하지 않았기 때문에 컴파일러가 부모의 생성자를 호출하는 문장인 super();를 여기에 삽입한다.
		//super.
		this.accountNo = accountNo; //상속 받은 필드 초기화
		this.ownerName  = ownerName; //상속받은 필드 초기화
		this.balance = balance;//상속받은 필드 초기화
		this.cardNo = cardNo; //클래스 안에 선언됨 필드 초기화
	}
	
	
	int pay(String cardNo, int amount)throws Exception{
		if(!cardNo.equals (this.cardNo)|| (balance < amount))
			throw new Exception(" 지불이 불가능합니다."); //getMessage로 받아줌
		return withdraw(amount);
	}
	

	

}
