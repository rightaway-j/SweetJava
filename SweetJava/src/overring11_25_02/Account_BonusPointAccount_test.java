package overring11_25_02;

public class Account_BonusPointAccount_test {
	public static void main(String args[]) {
		/*
		 * �����߻� CheckingAccount obj = new CheckingAccount();
		 */
		BonusPointAccount obj = new BonusPointAccount("111-22-3333333", "��̿�", 0, 0);// ������ ȣ��

		obj.deposit(10000000);// ��� ���� �޼ҵ�
		System.out.println("�ܾ�" + obj.balance);
		System.out.println("���� ����Ʈ:" + obj.bonusPoint);

	}
}
