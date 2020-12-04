package polymorphism11_26_04;

class CheckingAccount extends Account1 {
	String cardNo; //���� ī�� ��ȣ
	
	/*
	 
	 */
	//����ī�� ������ �����Ѵٿ� �ش��ϴ� �޼ҵ�
	//�������� ù �ٿ��� ���� Ŭ������ �����ڸ� ȣ���ϴ��� �ڼ� Ŭ������ ����� �θ� Ŭ�����Ǹ���� ����� �� �����Ƿ� �θ��� ����鸮 ���� �ʱ�ȭ�Ǿ� �־�� �մϴ�.
	CheckingAccount(String accountNo, String ownerName, int balance, String cardNo){
		//�Ķ���� 3���� ���� Ŭ���� ������ ȣ�⹮
		// �ݵ�� �������� ù��° ��ɹ��̾�� �Ѵ�.
		super(accountNo, ownerName, balance);
		this.cardNo = cardNo; //Ŭ���� �ȿ� ����� �ʵ� �ʱ�ȭ
	}
	
	
	int pay(String cardNo, int amount)throws Exception{
		if(!cardNo.equals (this.cardNo)|| (balance < amount))
			throw new Exception(" ������ �Ұ����մϴ�."); //getMessage�� �޾���
		return withdraw(amount);
	}
	

	

}
