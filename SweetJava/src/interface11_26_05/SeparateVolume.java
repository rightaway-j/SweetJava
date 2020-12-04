package interface11_26_05;
//���� ���� �������̽��� �����ϴ� ���ົ Ŭ����
//SeparateVolumeŬ������ Lendavle�������̽��� ������ Ŭ�����̴�
class SeparateVolume implements Lendable {
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
		state = 1;	//�������:state-1
		System.out.println("*" + bookTitle + " ��(��) ����Ǿ����ϴ�.");
		System.out.println("������:" + borrower);
		System.out.println("������:" + date + "\n");
	}

	@Override
	public void checkIn() { //�ݳ��Ѵ�
		this.borrower = null;
		this.checkOutDate = null;
		this.state = 0; //�ݳ� ���� state =0
		// TODO Auto-generated method stub
		System.out.println("*" + bookTitle + " ��(��) �ݳ��Ǿ����ϴ�.\n");
	}

}
