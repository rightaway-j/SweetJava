package object_Account11_24;

public class Account2 {
	private String accountNo; //���� ��ȣ //Ŭ���� �������
	private String ownerName; //������ �̸�
	private int balance; // �ܾ�
	
	Account2(String accountNo, String ownerName, int balance){ //�Ű����� 3��¥��. ���°��� �ʱ�ȭ�ض�
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
	 public void setAccountNo(String accountNo) {
		 this.accountNo = accountNo;
	 }
	 public String getAccountNo() {
		 return accountNo;
	 }
	 public String getOwnerName() {
		 return ownerName;
	 }
	 public void setOwnerName(String ownerName) {
		 this.ownerName = ownerName;
	 }
	 public int getBalance() {
		 return balance;
	 }
	 public void setBalance(int balance) {
		 this.balance = balance;
		
	 }
	 
}
