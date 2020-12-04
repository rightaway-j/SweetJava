package student_array_to_object;

public interface Lendable {
	final static byte STATE_BORROWED =1;//대출중
	final static byte STATE_VORMAL = 0;//대출되지 않는 상태
	void checkOut(String borrower, String date);
	void checkIn(); // public 생략되어있따
	

}
