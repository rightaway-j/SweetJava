package interface11_26_05;
//대출 가능 인터페이스를 구현하는 단행본 클래스
//SeparateVolume클래스는 Lendavle인터페이스를 구현한 클래스이다
class SeparateVolume implements Lendable {
	String requestNo; // 청구번호
	String bookTitle; // 제목
	String writer; // 저자
	String borrower; // 대출인
	String checkOutDate; // 대출일
	byte state; // 대출상태

	SeparateVolume(String requestNo, String bookTitle, String writer) {//생성자 : 필드 초기화 //자료형 확인 필수
		this.requestNo = requestNo;
		this.bookTitle = bookTitle;
		this.writer = writer;

	}

	@Override
	public void checkOut(String borrower, String date) {
		// TODO Auto-generated method stub1
		
		 
		if (state != 0) //처음 state값은 =0
			return; //종료를 하기위한 return;

		this.borrower = borrower;//두 개의 매개변수를이용해 필드로 초기화
		this.checkOutDate = date;
		state = 1;	//대출상태:state-1
		System.out.println("*" + bookTitle + " 이(가) 대출되었습니다.");
		System.out.println("대출인:" + borrower);
		System.out.println("대출일:" + date + "\n");
	}

	@Override
	public void checkIn() { //반납한다
		this.borrower = null;
		this.checkOutDate = null;
		this.state = 0; //반납 상태 state =0
		// TODO Auto-generated method stub
		System.out.println("*" + bookTitle + " 이(가) 반납되었습니다.\n");
	}

}
