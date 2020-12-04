package comstructor11_25_04;

public class Account_checkingAccount_test {
	public static void main(String args[]) {
		/* 오류발생 
		 * CheckingAccount obj = new CheckingAccount();
		 */
		CheckingAccount obj= new CheckingAccount("111-22-3333333","홍길동",0,"5555-6666-7777-8888");//생성자 호출
		

		obj.deposit(1000000);// 상속 받은 메소드
		try {
			int paidAmount = obj.pay("5555-6666-7777-8888", 47000);
			System.out.println("지불액:" + paidAmount);
			System.out.println("잔액" + obj.balance);
		} catch (Exception e) {
			String msg = e.getMessage(); //오류가 발생하면 내가 작성한 메세지를 보여라
			System.out.println(msg);
		}
	}
}
