package object_Account11_24;

public class Account {
	String accountNo; //���� ��ȣ //Ŭ���� �������
	String ownerName; //������ �̸�
	int balance; // �ܾ�
	
	Account(String accountNo, String ownerName, int balance){ //�Ű����� 3��¥��. ���°��� �ʱ�ȭ�ض�
this.accountNo = accountNo;//�������� = ���ÿ����� ��
this.ownerName = ownerName;
this.balance = balance;
	}
	
	 void deposit(int amount) { //int a �Ű����� �־��ذ�
		 balance += amount ; //balance = balance + a;
	}
	 int withdraw(int amount) {
		if(balance < amount) {
			return 0;
		}else {
			balance -= amount;
		}
		return balance;
	}
}
