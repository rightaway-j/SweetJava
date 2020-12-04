package object_test11_24_02;

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
//this(): 생성자로 같은 클래스의 다른 생성자를 호출 할 때 사용한다.
	//String 타입의 파라미터 3개를 갖는 생성자를 호출
	this(name, id, password); // 위와 겹치는건 이렇게 줄일 수 있다.반드시 맨위에 위치해야함
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
