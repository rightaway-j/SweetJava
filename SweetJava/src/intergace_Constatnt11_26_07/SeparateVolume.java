package intergace_Constatnt11_26_07;
//���� ���� �������̽��� �����ϴ� ���ົ Ŭ����
//SeparateVolumeŬ������ Lendavle�������̽��� ������ Ŭ�����̴�
class SeparateVolume implements Lendable {
	private static final byte STATE_NORMAL = 0;
	String requestNo; // û����ȣ
	String bookTitle; // ����
	String writer; // ����
	String borrower; // ������
	String checkOutDate; // ������
	byte state; // �������

	SeparateVolume(String requestNo, String bookTitle, String writer) {//������ : �ʵ� �ʱ�ȭ //�ڷ��� Ȯ�� �ʼ�
		this.requestNo = requestNo;
		this.bookTitle = bookTitle;
		this.writer = writer;

	}

	@Override
	public void checkOut(String borrower, String date) {
		// TODO Auto-generated method stub1
		
		 
		if (state != 0) //ó�� state���� =0
			return; //���Ḧ �ϱ����� return;

		this.borrower = borrower;//�� ���� �Ű��������̿��� �ʵ�� �ʱ�ȭ
		this.checkOutDate = date;
		this.state = STATE_BORROWED;	//�������:state-1 STATE_BORROWED =1 ������
		System.out.println("*" + bookTitle + " ��(��) ����Ǿ����ϴ�.");
		System.out.println("������:" + borrower);
		System.out.println("������:" + date + "\n");
	}

	@Override
	public void checkIn() { //�ݳ��Ѵ�
		this.borrower = null;
		this.checkOutDate = null;
		this.state = STATE_NORMAL; //�ݳ� ���� state =0
		// TODO Auto-generated method stub
		System.out.println("*" + bookTitle + " ��(��) �ݳ��Ǿ����ϴ�.\n");
	}

}
