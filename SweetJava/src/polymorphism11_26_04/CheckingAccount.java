package polymorphism11_26_04;

class CheckingAccount extends Account1 {
	String cardNo; //직불 카드 번호
	
	/*
	 
	 */
	//직불카드 사용액을 지불한다에 해당하는 메소드
	//생성자의 첫 줄에서 조상 클래스의 생성자를 호출하느데 자손 클래스의 멤버가 부모 클래스의멤버를 사용할 수 있으므로 부모의 멤버들리 먼저 초기화되어 있어야 합니다.
	CheckingAccount(String accountNo, String ownerName, int balance, String cardNo){
		//파라미터 3개의 슈퍼 클래스 생성자 호출문
		// 반드시 생성자의 첫번째 명령문이어야 한다.
		super(accountNo, ownerName, balance);
		this.cardNo = cardNo; //클래스 안에 선언됨 필드 초기화
	}
	
	
	int pay(String cardNo, int amount)throws Exception{
		if(!cardNo.equals (this.cardNo)|| (balance < amount))
			throw new Exception(" 지불이 불가능합니다."); //getMessage로 받아줌
		return withdraw(amount);
	}
	

	

}
