package abstract_11_26_03;

public class Inheritance_emailSender_test {
	public static void main(String args[]) {
		EMailSender obj1 = new EMailSender("������ �����մϴ�", "������", "admin@khshop.co.kr", "10%���������� �߻��Ǿ����ϴ�");//��ü����

		// �߻� �޼��带 ������ �޼ҵ带 ȣ��
		obj1.sendMessage("hoho@naver.com");

		SMSSender obj2 = new SMSSender("������ �����մϴ�", "������", "02-12-1212", "10%���������� �߻��Ǿ����ϴ�");

		obj2.sendMessage("02-1253-456"); //�θ𿡵� ������ �������̵��ؼ� �ڽİŸ� ������ �Ŵ�!!!!!!

	}
}
