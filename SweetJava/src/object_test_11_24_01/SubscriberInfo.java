package object_test_11_24_01;

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
this.name = name;
this.id = id;
this.password = password;
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
