package downcasting11_26_12;
//obj ������ Ÿ���� account�̱� ������
	//account�� ����pqy�޼��峪cardNo�ʵ�������� �����߻�
	//�����߻� = ���� Ŭ���� ���� ������ ���� ���� Ŭ���� ���� ������ �����ϴ� �߸��� ���α׷�
//������ ������ ������ ���� ���� �߻� ->��ĳ�����Ѱ͸� �ٿ�ĳ������ �����ϱ� ������ (üŷ ��ī��Ʈ) �����߻� *��ĳ������ �͸� �ٿ�ĳ������ �����ϴٰ� ��� (newAccount�� Ȯ���غ���)
	public class Downcasting {
		public static void main(String args[]) {
			/* �����߻� 
			 * CheckingAccount obj = new CheckingAccount();
			 */
			Account1 obj1= new Account1("111-22-3333333","ȫ�浿",10,"5555-6666-7777-8888");//������ ȣ��
			// new CheckingAccount ���� Account1�� �ٲ� = ����
			CheckingAccount obj2 = (CheckingAccount)obj1 ; //�����Ϸ��� ������ Ÿ�Ը� ���� ���� ���ɼ��� �̻��ϱ� ������ �����߻�
//(üŷ��ī���) = ����ȯ�� �ȵ��� �׷�
			
			try {
				int amount = obj2.pay("5555-6666-7777-8888", 47000);
				System.out.println("�����:" + amount);
				System.out.println("ī���ȣ" + obj2.cardNo);
				System.out.println("�ܾ�" + obj2.balance);
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}

