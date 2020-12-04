package inheritance11_25;

// ��� Ŭ������ ������ objectŬ�����̴�.
// �ٸ� Ŭ������ ���� ��� ���� �ʴ� ��� Ŭ�������� �ڵ������� objectŬ������ ���� ��� �޴���.
public class Account1 {// �����Ϸ��� extends object�� �߰��Ѵ�.
	String accountNo; // ���� ��ȣ //Ŭ���� �������
	String ownerName; // ������ �̸�
	int balance; // �ܾ�

	void deposit(int amount) { // int a �Ű����� �־��ذ�//�����Ѵ�.
		balance += amount; // balance = balance + a;
	}

	int withdraw(int amount) throws Exception {// �����Ѵ�.
		if (balance < amount) {
			throw new Exception("�ܾ��� �����մϴ�.");
		}
		balance -= amount;
		return amount;
	}

}