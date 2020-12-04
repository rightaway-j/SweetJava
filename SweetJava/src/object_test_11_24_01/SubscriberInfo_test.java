package object_test_11_24_01;
//설계해놓은 클래스를 변수 설정하고 출력할 수 있게 해주는 단계
public class SubscriberInfo_test {
	public static void main(String args[]) {
		SubscriberInfo obj1
		 	= new SubscriberInfo("연흥부", "poorman", "zebi");
		
		print (obj1);
		System.out.println("==================:");
		
		obj1.setAddress("서울시 종로구");//값을 바꾼다
		obj1.setPhoneNo("010-1234-5678"); //메서드에 void setPhone(String블라블라),this.까지 저장해놔야 변경가능
		print (obj1);
		
		SubscriberInfo obj2
	 	= new SubscriberInfo ("연놀부", "richman", "money", "02-123-4567", "강남");
	
	print(obj2);
	}
	private static void print(SubscriberInfo obj) {
	
	System.out.println("이름:" + obj.name);
	System.out.println("아이디:" + obj.id);
	System.out.println("패스워드:" + obj.password);
	System.out.println("전화번호:" + obj.phoneNo);
	System.out.println("주소:" + obj.address);
		
	}
}
	
