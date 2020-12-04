package overriding11_25;

public class Account_CreditLinegAccount_test {
	public static void main(String args[]) {
		/* 오류발생 
		 * CheckingAccount obj = new CheckingAccount();
		 */
		CreditLineAccount obj= new CreditLineAccount("111-22-3333333","김선달",10000,200000000);//생성자 호출
		

		obj.deposit(1000000);// 상속 받은 메소드
		try {
			int amount = obj.withdraw(50000);
			//int amount = obj.withdraw(500000000);
			
			System.out.println("인출액:" + amount);
			System.out.println("잔액" + obj.balance);
			System.out.println("마이너스 한도:" + obj.creditline);
		} catch (Exception e) {
			String msg = e.getMessage(); //오류가 발생하면 내가 작성한 메세지를 보여라
			System.out.println(msg);
		}
	}
}
