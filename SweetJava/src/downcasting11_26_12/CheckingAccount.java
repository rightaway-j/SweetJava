package downcasting11_26_12;

class CheckingAccount extends Account1 {
	String cardNo; //���� ī�� ��ȣ
	
	/*
	 
	 */
	//����ī�� ������ �����Ѵٿ� �ش��ϴ� �޼ҵ�
	//�������� ù �ٿ��� ���� Ŭ������ �����ڸ� ȣ���ϴ��� �ڼ� Ŭ������ ����� �θ� Ŭ�����Ǹ���� ����� �� �����Ƿ� �θ��� ����鸮 ���� �ʱ�ȭ�Ǿ� �־�� �մϴ�.
	CheckingAccount(String accountNo, String ownerName, int balance, String cardNo){
		//������ ù �ٿ��� �θ� �����ڸ� ȣ������ �ʾұ� ������ �����Ϸ��� �θ��� �����ڸ� ȣ���ϴ� ������ super();�� ���⿡ �����Ѵ�.
		//super.
		this.accountNo = accountNo; //��� ���� �ʵ� �ʱ�ȭ
		this.ownerName  = ownerName; //��ӹ��� �ʵ� �ʱ�ȭ
		this.balance = balance;//��ӹ��� �ʵ� �ʱ�ȭ
		this.cardNo = cardNo; //Ŭ���� �ȿ� ����� �ʵ� �ʱ�ȭ
	}
	
	
	int pay(String cardNo, int amount)throws Exception{
		if(!cardNo.equals (this.cardNo)|| (balance < amount))
			throw new Exception(" ������ �Ұ����մϴ�."); //getMessage�� �޾���
		return withdraw(amount);
	}
	

	

}
