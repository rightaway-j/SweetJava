package polymorphism11_26_04;

abstract class MessageSender {//Ŭ���� �߻� Ŭ������ ����
//	String returnPhoneNo, 
	String title;//����
	String senderName;//�߼��� �̸�
	
	MessageSender(String title, String senderName){ //��� (�޼���)
		this.title = title;
		this.senderName = senderName;
	}
		//�߻� �޼ҵ�- �޼����� �۽��Ѵ�
	abstract void sendMessage(String recipient); //���⸦ �ּ��޸� main������ �̰ɷ� �޼ҵ� ȣ�� �ϴ� ô (�����Ϸ��� ����ϱ�����)�ϸ鼭 ��������δ� ���� Ŭ������ �޼ҵ带 ȣ������
}//�������ΰ��� �̾Ƴ��� �̺κ��� ����� ���� �ϱ� ���ؼ� abstract�� �����

