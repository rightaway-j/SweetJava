package interface11_26_05.copy;

public class Interface_Ex_array {
	public static void main(String args[]) {
		//int[] a = new int [3];
		//String[] a = newSring [3]; 처럼 쓰듯이 
		Lendable arr[]= new Lendable[3];// 인터페이스 타입의 배열
		
		//베열에 여러 타입의 객체 주소 저장
		
		arr[0] = new SeparateVolume("445o", "푸코의 진자", "에코");
		arr[1] = new SeparateVolume(" 349.3", "서양미술사", "곰브리치");
		arr[2] = new AppCDInfo(" 02-17", "xml을 위한 자바 프로그래밍");

		checkOutAll(arr, "수지", "2020-11-26");
		
	}
	//자바 컴파일러는 컴파일 할 때 변수의 타입만 보고 메소드나
	//필드의 존재 여부를 체크하기 때문에
	//lendable 인터페이스에 체트아웃 메소드가 있어야 컴파일 에러가 없다
	
	//lendable 에 checkOut이 있는 지 확인하고,
	private static void checkOutAll(Lendable[] arr, String borrower, String date) {
		// TODO Auto-generated method stub
		//arr[0].checkOut(borrower,date);
		//arr[1].checkOut(borrower,date);
		//arr[2].checkOut(borrower,date);
		/*또는
		 * for(int cnt = 0; cnt < arr.length; cnt++)
		 * arr[cnt].checkOut (borrower,date);
		 또는*/
		for(Lendable a: arr) {
			a.checkOut(borrower, date);//실행은 객체꺼
			
		}
	}


//	//자바 컴파일러는 컴파일 할 때 변수의 타입만 보고 메소드나  
//	// 필드의 존재 여부를 체크하기 떄문에
//	// Lendable인터페이스에 checkOut메소드가 잇어야 컴파일 에러가 없습니다.
//	static void checkOut(Lendable arr, String borrower, String date) {
//		arr.checkOut(borrower, date);
	}

