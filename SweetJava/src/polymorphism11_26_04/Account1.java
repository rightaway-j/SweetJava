package polymorphism11_26_04;

// ��� Ŭ������ ������ objectŬ�����̴�.
// �ٸ� Ŭ������ ���� ��� ���� �ʴ� ��� Ŭ�������� �ڵ������� objectŬ������ ���� ��� �޴���.
public class Account1 {// �����Ϸ��� extends object�� �߰��Ѵ�.
	String accountNo; // ���� ��ȣ //Ŭ���� �������							//���� ����(iv)
	String ownerName; // ������ �̸�
	int balance; // �ܾ�
//�⺻ �����ڸ������Ϸ��� �˾Ƽ� �߰�����
	Account1 (String accountNo,String ownerName , int balance){ 	//������
	this.accountNo = accountNo;
	this.ownerName = ownerName;
	this.balance = balance;
	}
	void deposit(int amount) { // int a �Ű����� �־��ذ�//�����Ѵ�.			//�޼���
		balance += amount; // balance = balance + a;
	}

	int withdraw(int amount) throws Exception {// �����Ѵ�.			//�޼���
		if (balance < amount) {
			throw new Exception("�ܾ��� �����մϴ�.");
		}
		balance -= amount;
		return amount;
	}

}
