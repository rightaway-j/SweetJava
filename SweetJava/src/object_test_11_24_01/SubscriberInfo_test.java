package object_test_11_24_01;
//�����س��� Ŭ������ ���� �����ϰ� ����� �� �ְ� ���ִ� �ܰ�
public class SubscriberInfo_test {
	public static void main(String args[]) {
		SubscriberInfo obj1
		 	= new SubscriberInfo("�����", "poorman", "zebi");
		
		print (obj1);
		System.out.println("==================:");
		
		obj1.setAddress("����� ���α�");//���� �ٲ۴�
		obj1.setPhoneNo("010-1234-5678"); //�޼��忡 void setPhone(String�����),this.���� �����س��� ���氡��
		print (obj1);
		
		SubscriberInfo obj2
	 	= new SubscriberInfo ("�����", "richman", "money", "02-123-4567", "����");
	
	print(obj2);
	}
	private static void print(SubscriberInfo obj) {
	
	System.out.println("�̸�:" + obj.name);
	System.out.println("���̵�:" + obj.id);
	System.out.println("�н�����:" + obj.password);
	System.out.println("��ȭ��ȣ:" + obj.phoneNo);
	System.out.println("�ּ�:" + obj.address);
		
	}
}
	
