package polymorphism11_26_04;

//�ڹٴ� �� Ÿ���� ���������� ���� Ÿ���� ���Ը� ������ �� �ֵ��� �ߴµ�
//
public class inheritanceEx {
	public static void main(String args[]) {
		Account1 obj1 = new Account1("111-22-3333333", "�Ӳ���", 10000);
		CheckingAccount obj2 = new CheckingAccount("44-55-666666", "ȫ�浿", 20000, "5555-6666-7777-8888");
		CreditLineAccount obj3 = new CreditLineAccount("777-88-999999", " �輱��", 30000, 200000000);
		BonusPointAccount obj4 = new BonusPointAccount("000-00-000000", "��̿�", 0, 0);
		//�پ��� Ÿ���� ��ü�� ������ ���� �޼ҵ带 ȣ���մϴ�.
		printAccountInfo(obj1);
		printAccountInfo(obj2);
		printAccountInfo(obj3);
		printAccountInfo(obj4);
	}
//�پ��� Ÿ���� ��ü�� �� Ÿ���� �Ķ���ͷ� �޴´�//�θ����� �޾Ƽ� 4�� �ݺ��Ұ��� �ٿ���
static void printAccountInfo(Account1 obj) {
		System.out.println("���¹�ȣ:"+ obj.accountNo);
		System.out.println("������ �̸�:"+obj.ownerName);
		System.out.println("�ܾ�:"+ obj.balance);
		System.out.println();
		
	}

}
