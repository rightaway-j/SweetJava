package polymorphism11_26_04;

public class Inheritance_emailSender_test {
	public static void main(String args[]) {
		EMailSender obj1 = new EMailSender("������ �����մϴ�", "������", "admin@khshop.co.kr", "10%���������� �߻��Ǿ����ϴ�");

		// �߻� �޼��带 ������ �޼ҵ带 ȣ��
		//obj1.sendMessage("hoho@naver.com");

		SMSSender obj2 = new SMSSender("������ �����մϴ�", "������", "02-12-1212", "10%���������� �߻��Ǿ����ϴ�");

		//obj2.sendMessage("02-1253-456"); //�θ𿡵� ������ �������̵��ؼ� �ڽİŸ� ������ �Ŵ�!!!!!!
		
		//���� Ŭ���� ��ü obj1,obj2�� ������ �޼ҵ带 ȣ��
		send(obj1, "hatman@yeyeye.com");
		send(obj1, "stickman@hahaha.com");
		send(obj2, "010-0000-0000");
		

	}

	//MessageSender obj:���� Ŭ���� Ÿ���� �Ķ����
 static void send(MessageSender obj, String recipient) {
	obj.sendMessage(recipient);
	//��� Ŭ������ sendmessage�޼ҵ尡 ȣ��ɱ��?
	//EMailSender �Ǵ� SMSSender
	
	}
	
	
}
