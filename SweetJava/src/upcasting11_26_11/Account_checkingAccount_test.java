package upcasting11_26_11;
//obj ������ Ÿ���� account�̱� ������
//account�� ����pqy�޼��峪cardNo�ʵ�������� �����߻�

public class Account_checkingAccount_test {
	public static void main(String args[]) {
		/* �����߻� 
		 * CheckingAccount obj = new CheckingAccount();
		 */
		Account1 obj= new CheckingAccount("111-22-3333333","ȫ�浿",10,"5555-6666-7777-8888");//������ ȣ��
		

		
		try {
			int amount = obj.pay("5555-6666-7777-8888", 47000);
			System.out.println("�����:" + amount);
			System.out.println("ī���ȣ" + obj.cardNo);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
