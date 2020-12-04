package reference11_26_09;
//레퍼런스 변수를 null참조값과 비교해서 처리하는 프로그램
public class RefTypeEx2 {
	public static void main(String args[]) {
		//Point obj = null;//지역변수 초기화작업 해야함.
		Point obj = new Point(3,4);
		//the local variable obj may not have been initialized
		if (obj == null) {
			System.out.println("obj 변수가 가리키는 객체가 없습니다"); //heap 영역에 가리키는값이 없는데 뭘뽑아내라는 건지 묻는다.
		return;
		}else {
			System.out.println("x = " + obj.x);
			System.out.println("y = " + obj.y);
		}
	}

}
