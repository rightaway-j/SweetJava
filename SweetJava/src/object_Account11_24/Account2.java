package object_Account11_24;

public class Account2 {
	private String accountNo; //계좌 번호 //클래스 구성요소
	private String ownerName; //예금주 이름
	private int balance; // 잔액
	
	Account2(String accountNo, String ownerName, int balance){ //매개변수 3개짜리. 들어온것을 초기화해라
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
