package inheritance11_25;

class CheckingAccount extends Account1 {
	String cardNo; //���� ī�� ��ȣ
	/*
	 
	 */
	//����ī�� ������ �����Ѵٿ� �ش��ϴ� �޼ҵ�
	int pay(String cardNo, int amount)throws Exception{
		if(!cardNo.equals (this.cardNo)|| (balance < amount))
			throw new Exception(" ������ �Ұ����մϴ�."); //getMessage�� �޾���
		return withdraw(amount);
	}
	

	

}
