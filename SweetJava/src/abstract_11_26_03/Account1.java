package abstract_11_26_03;
//�ν��Ͻ�ȭ�� �����ϴ�  abstractŰ����
//abstractŰ���尡 ���� Ŭ������ �߻� Ŭ����(abstract class)����Ѵ�.
//// ��� Ŭ������ ������ objectŬ�����̴�.
//// �ٸ� Ŭ������ ���� ��� ���� �ʴ� ��� Ŭ�������� �ڵ������� objectŬ������ ���� ��� �޴���.
 abstract class Account1 {// �����Ϸ��� extends object�� �߰��Ѵ�.
 
	String accountNo; // ���� ��ȣ //Ŭ���� �������
	String ownerName; // ������ �̸�
	int balance; // �ܾ�
//�⺻ �����ڸ������Ϸ��� �˾Ƽ� �߰�����
	Account1 (String accountNo,String ownerName ,int balance){
	this.accountNo = accountNo;
	this.ownerName = ownerName;
	this.balance = balance;
	}
	void deposit(int amount) { // int a �Ű����� �־��ذ�//�����Ѵ�.
		balance += amount; // balance = balance + a;
	}

 int withdraw(int amount) throws Exception {// �����Ѵ�.//final�� �޼ҵ� �������̵� ����(�̰͸��� �ȵ�!-���� �ǵ��ʹ� �޸�ȸ���ұ��)
		if (balance < amount) {
			throw new Exception("�ܾ��� �����մϴ�.");
		}
		balance -= amount;
		return amount;
	}

}
