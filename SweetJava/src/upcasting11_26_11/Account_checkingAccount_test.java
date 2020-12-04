package upcasting11_26_11;
//obj 변수의 타입이 account이기 때문에
//account에 없는pqy메서드나cardNo필드는컴파일 에러발생

public class Account_checkingAccount_test {
	public static void main(String args[]) {
		/* 오류발생 
		 * CheckingAccount obj = new CheckingAccount();
		 */
		Account1 obj= new CheckingAccount("111-22-3333333","홍길동",10,"5555-6666-7777-8888");//생성자 호출
		

		
		try {
			int amount = obj.pay("5555-6666-7777-8888", 47000);
			System.out.println("인출액:" + amount);
			System.out.println("카드번호" + obj.cardNo);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
