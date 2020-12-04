package polymorphism11_26_04;

//자바는 한 타입의 참조변수로 여러 타입의 개게를 참조할 수 있도록 했는데
//
public class inheritanceEx {
	public static void main(String args[]) {
		Account1 obj1 = new Account1("111-22-3333333", "임꺽정", 10000);
		CheckingAccount obj2 = new CheckingAccount("44-55-666666", "홍길동", 20000, "5555-6666-7777-8888");
		CreditLineAccount obj3 = new CreditLineAccount("777-88-999999", " 김선달", 30000, 200000000);
		BonusPointAccount obj4 = new BonusPointAccount("000-00-000000", "김미영", 0, 0);
		//다양한 타입의 객체를 가지고 같은 메소드를 호출합니다.
		printAccountInfo(obj1);
		printAccountInfo(obj2);
		printAccountInfo(obj3);
		printAccountInfo(obj4);
	}
//다양한 타입의 객체를 한 타입의 파라미터로 받는다//부모형을 받아서 4번 반복할것을 줄여줌
static void printAccountInfo(Account1 obj) {
		System.out.println("계좌번호:"+ obj.accountNo);
		System.out.println("에금주 이름:"+obj.ownerName);
		System.out.println("잔액:"+ obj.balance);
		System.out.println();
		
	}

}
