package interface11_26_05.copy;

class AppCDInfo extends CDInfo implements Lendable {
	String borrower; // 대출인
	String checkOutDate; // 대출일
	byte state; // 대출상태

	AppCDInfo(String registerNo,String title){
	    	super(registerNo, title);
	    }
	// public: 인터페이스의 메소드를 구현할 때 반드시 사용해야 하는 키워드
	// ㄷ대출한다

	@Override
	public void checkOut(String borrower, String date) {
		if (state != 0)
			return;
		this.borrower = borrower;
		this.checkOutDate = checkOutDate;
		this.state = 1;
		// TODO Auto-generated method stub
		System.out.println("*" + title + " CD가 대출되었습니다.");
		System.out.println("대출인:" + borrower);
		System.out.println("대출일:" + date + "\n");
	}

	@Override
	public void checkIn() {
		this.borrower = null;
		this.checkOutDate = checkOutDate;
		this.state = 1;
		// TODO Auto-generated method stub
		System.out.println("*" + title + " CD가 반납되었습니다.\n");
	}

}
