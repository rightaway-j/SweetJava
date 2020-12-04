package interface11_26_05.copy;

public class Interface_Ex {
	public static void main(String args[]) {
		Lendable arr0, arr1, arr2;
		// arr0 - new Lendable(); // 오류 발생
		arr0 = new SeparateVolume("445o", "푸코의 진자", "에코");
		arr1 = new SeparateVolume(" 349.3", "서양미술사", "곰브리치");
		arr2 = new AppCDInfo(" 02-17", "xml을 위한 자바 프로그래밍");

		// 같은 사람이 같은 날짜에 단행본 2권과 부록 cd를 빌리는 경우
		checkOut(arr0, "수지", "2020-11-26");
		checkOut(arr1, "수지", "2020-11-26");
		checkOut(arr2, "수지", "2020-11-26");

	}
	
	//자바 컴파일러는 컴파일 할 때 변수의 타입만 보고 메소드나  
	// 필드의 존재 여부를 체크하기 떄문에
	// Lendable인터페이스에 checkOut메소드가 잇어야 컴파일 에러가 없습니다.
	static void checkOut(Lendable arr, String borrower, String date) {
		arr.checkOut(borrower, date);
	}
}
