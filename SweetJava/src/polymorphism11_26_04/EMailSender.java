package polymorphism11_26_04;

class EMailSender extends MessageSender {
	String senderAddr;//�߼��� �̸��� �ּ�
	String emailBody;//�̸��� �ּ�

	EMailSender(String title, String senderName, String senderAddr, String emailBody) {

		super(title, senderName);
		this.senderAddr = senderAddr;
		this.emailBody = emailBody;
	}

	@Override//���� Ŭ������ �޼ҵ带�������̵� �ϴ� �޼ҵ�
	//Ǫ�� �޼ҵ带 ����(implement )
	void sendMessage(String recipient) {//�θ𿡵� ������ �������̵��ؼ� �ڽİŸ� ������ �Ŵ�!!!!!!
		System.out.println("------------------------------");
		System.out.println("����: " + title);
		System.out.println("������ ���: " + senderName + "\n" + "���� �ּ� : " + senderAddr);
		System.out.println("�޴� ���: " + recipient);
		System.out.println("����: " + emailBody);

	}

}
