package object_test11_24_02;

public class SubscriberInfo {
String name, id, password;//�ʵ�
String phoneNo, address;



//3���� stringŸ�� �Ķ���͸� ���� ������ ����//overloading���
SubscriberInfo(String name,String id, String password){
	this.name = name;//���� �ʵ���̶� ���Ƽ� this���� �ּҰ��� �Ű�����  name���� �ٲ�޶�
	this.id = id;
	this.password = password;
}
SubscriberInfo(String name,String id, String password, String phoneNo, String address){
//this(): �����ڷ� ���� Ŭ������ �ٸ� �����ڸ� ȣ�� �� �� ����Ѵ�.
	//String Ÿ���� �Ķ���� 3���� ���� �����ڸ� ȣ��
	this(name, id, password); // ���� ��ġ�°� �̷��� ���� �� �ִ�.�ݵ�� ������ ��ġ�ؾ���
this.phoneNo = phoneNo;
this.address = address;
}

void changePassword(String password) {
 this.password = password;
}

void setAddress(String address) {
	 this.address = address;

}
void setPhoneNo(String phoneNo) {
	this.phoneNo =phoneNo;
}
}
