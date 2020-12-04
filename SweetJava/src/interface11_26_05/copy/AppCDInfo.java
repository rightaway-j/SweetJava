package interface11_26_05.copy;

class AppCDInfo extends CDInfo implements Lendable {
	String borrower; // ������
	String checkOutDate; // ������
	byte state; // �������

	AppCDInfo(String registerNo,String title){
	    	super(registerNo, title);
	    }
	// public: �������̽��� �޼ҵ带 ������ �� �ݵ�� ����ؾ� �ϴ� Ű����
	// �������Ѵ�

	@Override
	public void checkOut(String borrower, String date) {
		if (state != 0)
			return;
		this.borrower = borrower;
		this.checkOutDate = checkOutDate;
		this.state = 1;
		// TODO Auto-generated method stub
		System.out.println("*" + title + " CD�� ����Ǿ����ϴ�.");
		System.out.println("������:" + borrower);
		System.out.println("������:" + date + "\n");
	}

	@Override
	public void checkIn() {
		this.borrower = null;
		this.checkOutDate = checkOutDate;
		this.state = 1;
		// TODO Auto-generated method stub
		System.out.println("*" + title + " CD�� �ݳ��Ǿ����ϴ�.\n");
	}

}
