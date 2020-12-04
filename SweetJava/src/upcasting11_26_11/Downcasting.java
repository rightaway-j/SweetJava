package upcasting11_26_11;
//obj 변수의 타입이 account이기 때문에
	//account에 없는pqy메서드나cardNo필드는컴파일 에러발생
	//에러발생 = 슈퍼 클래스 참조 변수의 값을 서브 클래스 참조 변수에 대입하는 잘못된 프로그램
	public class Downcasting {
		public static void main(String args[]) {
			/* 오류발생 
			 * CheckingAccount obj = new CheckingAccount();
			 */
			Account1 obj1= new CheckingAccount("111-22-3333333","홍길동",10,"5555-6666-7777-8888");//생성자 호출
			
			CheckingAccount obj2 = (CheckingAccount)obj1 ; //컴파일러는 변수의 타입만 보고 대입 가능성을 겁사하기 때문에 에러발생
//(체킹어카운드) = 형변환이 안들어가서 그럼
			
			try {
				int amount = obj2.pay("5555-6666-7777-8888", 47000);
				System.out.println("인출액:" + amount);
				System.out.println("카드번호" + obj2.cardNo);
				System.out.println("잔액" + obj2.balance);
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}
}
