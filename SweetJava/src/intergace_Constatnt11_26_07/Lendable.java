package intergace_Constatnt11_26_07;

public interface Lendable {
	final static byte STATE_BORROWED =1;//������
	final static byte STATE_NORMAL = 0;//������� �ʴ� ����
	void checkOut(String borrower, String date);
	void checkIn(); // public �����Ǿ��ֵ�
	

}
