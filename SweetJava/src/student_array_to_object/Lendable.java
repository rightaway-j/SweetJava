package student_array_to_object;

public interface Lendable {
	final static byte STATE_BORROWED =1;//������
	final static byte STATE_VORMAL = 0;//������� �ʴ� ����
	void checkOut(String borrower, String date);
	void checkIn(); // public �����Ǿ��ֵ�
	

}
