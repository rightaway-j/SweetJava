package object_Account11_24;

public class Account_test {
	public static void main(String args[]) {
		Account2 obj1 = new Account2("111-222-33333", "ȫ�浿", 200);
		printAccount(obj1);

		obj1.deposit(1000);
		printAccount(obj1);

		obj1.withdraw(500);
		printAccount(obj1);//���� �ڷ����̶� �迭�� ���� �� �ִ�.
		
	}

	 static void printAccount(Account2 obj1) {
		System.out.println("���� ��ȣ:" + obj1.getAccountNo());
		System.out.println("������ �̸�:" + obj1.getOwnerName());
		System.out.println("�ܾ�:" + obj1.getBalance());

	}
}
