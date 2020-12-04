package object_Account11_24;

public class Account_test {
	public static void main(String args[]) {
		Account2 obj1 = new Account2("111-222-33333", "홍길동", 200);
		printAccount(obj1);

		obj1.deposit(1000);
		printAccount(obj1);

		obj1.withdraw(500);
		printAccount(obj1);//같은 자료형이라 배열로 만들 수 있다.
		
	}

	 static void printAccount(Account2 obj1) {
		System.out.println("계좌 번호:" + obj1.getAccountNo());
		System.out.println("예금주 이름:" + obj1.getOwnerName());
		System.out.println("잔액:" + obj1.getBalance());

	}
}
