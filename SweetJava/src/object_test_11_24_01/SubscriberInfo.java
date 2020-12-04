package object_test_11_24_01;

public class SubscriberInfo {
String name, id, password;//필드
String phoneNo, address;



//3개의 string타입 파라미터를 갖는 생성자 선언//overloading사용
SubscriberInfo(String name,String id, String password){
	this.name = name;//위의 필드명이랑 같아서 this붙임 주소값을 매개변수  name으로 바꿔달라
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
