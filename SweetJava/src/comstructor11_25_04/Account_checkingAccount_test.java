package comstructor11_25_04;

public class Account_checkingAccount_test {
	public static void main(String args[]) {
		/* �����߻� 
		 * CheckingAccount obj = new CheckingAccount();
		 */
		CheckingAccount obj= new CheckingAccount("111-22-3333333","ȫ�浿",0,"5555-6666-7777-8888");//������ ȣ��
		

		obj.deposit(1000000);// ��� ���� �޼ҵ�
		try {
			int paidAmount = obj.pay("5555-6666-7777-8888", 47000);
			System.out.println("���Ҿ�:" + paidAmount);
			System.out.println("�ܾ�" + obj.balance);
		} catch (Exception e) {
			String msg = e.getMessage(); //������ �߻��ϸ� ���� �ۼ��� �޼����� ������
			System.out.println(msg);
		}
	}
}
