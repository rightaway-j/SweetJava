package overriding11_25;

public class Account_CreditLinegAccount_test {
	public static void main(String args[]) {
		/* �����߻� 
		 * CheckingAccount obj = new CheckingAccount();
		 */
		CreditLineAccount obj= new CreditLineAccount("111-22-3333333","�輱��",10000,200000000);//������ ȣ��
		

		obj.deposit(1000000);// ��� ���� �޼ҵ�
		try {
			int amount = obj.withdraw(50000);
			//int amount = obj.withdraw(500000000);
			
			System.out.println("�����:" + amount);
			System.out.println("�ܾ�" + obj.balance);
			System.out.println("���̳ʽ� �ѵ�:" + obj.creditline);
		} catch (Exception e) {
			String msg = e.getMessage(); //������ �߻��ϸ� ���� �ۼ��� �޼����� ������
			System.out.println(msg);
		}
	}
}
