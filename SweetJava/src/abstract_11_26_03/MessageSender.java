package abstract_11_26_03;

abstract class MessageSender {//Ŭ���� �߻� Ŭ������ ����
//	String returnPhoneNo, 
	String title;//����
	String senderName;//�߼��� �̸�
	
	MessageSender(String title, String senderName){ //��� (�޼���)
		this.title = title;
		this.senderName = senderName;
	}
		//�߻� �޼ҵ�- �޼����� �۽��Ѵ�
	abstract void sendMessage(String recipient);
}//�������ΰ��� �̾Ƴ��� �̺κ��� ����� ���� �ϱ� ���ؼ� abstract�� �����

