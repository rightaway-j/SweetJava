package instanceof11_26_12;
//
public class Account_checkingAccount_test2 {
	public static void main(String args[]) {
		Account1 obj = new Account1("1112-22-333333", "ȫ�浿", 100000);
		// obj�� checkingAccount�� ĳ��Ʈ ������ ���� Ȯ��((CheckingAccount)obj)
		if (obj instanceof CheckingAccount) {
			// obj�� checkingAccount�� ĳ��Ʈ�� �� �������� pay�޼��� ȣ��
			pay((CheckingAccount) obj);

		} else {
			// obj�� CheckintAcckount�� ĳ��Ʈ�� �� ���� ���
			System.out.println("ĳ��Ʈ�Ҽ� ���� Ÿ���̴�");
		}
	}

	static void pay(CheckingAccount obj) {
		try {
			int paidAmount = obj.pay("5555-6666-7777-8888", 47000);
			System.out.println("���Ҿ�:" + paidAmount);
			System.out.println("�ܾ�" + obj.balance);
		} catch (Exception e) {
			String msg = e.getMessage(); // ������ �߻��ϸ� ���� �ۼ��� �޼����� ������
			System.out.println(msg);
		}
	}
}
