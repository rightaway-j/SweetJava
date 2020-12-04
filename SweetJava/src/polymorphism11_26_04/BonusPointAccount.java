package polymorphism11_26_04;

/*
 * ������ �Ű�����: 
 * 
 */
class BonusPointAccount extends Account1 {
	int bonusPoint; // �ʵ� bonusPoint �Ű������� ������ �ʱ�ȭ

	BonusPointAccount(String accountNo, String ownerName, int balance, int bonusPoint) {
		super(accountNo, ownerName, balance); // ���� Ŭ���� (Account)�� �Ű����� 3���� ���� ������ ȣ���ϱ�
		this.bonusPoint = bonusPoint;
	}
//�޼ҵ� �������̵�= �����Ѵ� ��� �ٽ� ����
// ��Ӱ���,�θ� ũ������ ����ο� ��ġ(���ϰ� Ÿ��,�޼��� �̸�, �Ű����� ���)
//���� �������� ������ ���ų� �о�� �Ѵ�

//�޼��� �������̵� �ϱ�
//�޼����: deposit
//���:�ܾ��� �Ű� ������(�Աݾ�)���� ���ϰ� bonusPoint�� �Ű� ������(�Աݿ�)��0.1% �����Ѵ�.
	void deposit(int amount)  {// �����Ѵ�.
		balance += amount;//super.balance += amount;
		bonusPoint = (int) (amount * 0.001);//0.1%������ %�ν��� ���ϹǷ� �Ҽ��� �ΰ� �� �ڷ� ���� �־��ش�.
	}

}
