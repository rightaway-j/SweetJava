package object_Account11_24;

public class Account {
	String accountNo; //계좌 번호 //클래스 구성요소
	String ownerName; //예금주 이름
	int balance; // 잔액
	
	Account(String accountNo, String ownerName, int balance){ //매개변수 3개짜리. 들어온것을 초기화해라
this.accountNo = accountNo;//지역변수 = 스택영역에 들어감
this.ownerName = ownerName;
this.balance = balance;
	}
	
	 void deposit(int amount) { //int a 매개변수 넣어준것
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
