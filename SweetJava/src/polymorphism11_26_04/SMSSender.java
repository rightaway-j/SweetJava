package polymorphism11_26_04;

class SMSSender extends MessageSender {
	String returnPhoneNo;
	String message;

	SMSSender(String title, String senderName, String returnPhoneNo, String message) {

		super(title, senderName);//�θ� �ʱ�ȭ
		this.returnPhoneNo = returnPhoneNo;//�ʱ�ȭ
		this.message = message;
	}
//imprlement = �����ϴ�. sendMessage�� �����ϴ�
	//���� Ŭ������ �޼ҵ带 �������̵� �ϴ� �޼ҵ�

	@Override
	void sendMessage(String recipient) {
		// TODO Auto-generated method stub
		System.out.println("------------------------------");
		System.out.println("����: " + title);
		System.out.println("������ ���: " + senderName);
		System.out.println("��ȭ��ȣ: " + recipient);
		System.out.println("ȸ�� ��ȭ��ȣ: " + returnPhoneNo);
		System.out.println("�޽��� ����: " + message);
	}

}
