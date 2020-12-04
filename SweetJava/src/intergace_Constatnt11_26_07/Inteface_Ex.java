package intergace_Constatnt11_26_07;

public class Inteface_Ex {
	public static void main(String args[]) {
		SeparateVolume obj = new SeparateVolume("864ㅂ","나무","베르베르");
		//대출 가능을 확인하고 대출상태가 가능하면"대출가능"을 출려가고
		//대출중이면 대출중과 대출인, 대출일을 출력한다.
		printState(obj);
		obj.checkOut("수지", "2020-11-26");
		printState(obj);
	}

	private static void printState(SeparateVolume obj) {
		if (obj.state == Lendable.STATE_BORROWED) {
			System.out.println("대출상태: 대출가능");
		}else if(obj.state == Lendable.STATE_NORMAL){
			System.out.println("대출상태: 대출중");
			System.out.println("대출인"+ obj.borrower);
			System.out.println("대출일"+ obj.checkOutDate);
		}
		
	}
	
	
}
