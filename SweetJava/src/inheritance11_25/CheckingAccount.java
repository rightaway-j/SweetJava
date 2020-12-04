package inheritance11_25;

class CheckingAccount extends Account1 {
	String cardNo; //직불 카드 번호
	/*
	 
	 */
	//직불카드 사용액을 지불한다에 해당하는 메소드
	int pay(String cardNo, int amount)throws Exception{
		if(!cardNo.equals (this.cardNo)|| (balance < amount))
			throw new Exception(" 지불이 불가능합니다."); //getMessage로 받아줌
		return withdraw(amount);
	}
	

	

}
