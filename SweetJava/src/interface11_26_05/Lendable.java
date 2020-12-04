package interface11_26_05;

 abstract interface Lendable {
	//대출한다
	public abstract void checkOut(String borrower,String date);//메서드의 변수로 사용됨= 메서드에 선언된 변수이다 =매개변수
	
	//반납한다
	public abstract void checkIn();
}
