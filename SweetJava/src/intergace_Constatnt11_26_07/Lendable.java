package intergace_Constatnt11_26_07;

public interface Lendable {
	final static byte STATE_BORROWED =1;//대출중
	final static byte STATE_NORMAL = 0;//대출되지 않는 상태
	void checkOut(String borrower, String date);
	void checkIn(); // public 생략되어있따
	

}
