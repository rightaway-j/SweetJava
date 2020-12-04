package exception_try_chatch12_01_01;
//unchecked exception을 던지는 메소드 	unchecked = 예외 처리 선택
//throws 절이 없어도  try~catch 문으로 예외 처리 가능
// 정수는 0으로 나누는 것이 금지되어 ArithmeticException 발생
public class exception {
	public static void main(String args[]) {
		try {
		int result = devide(3,0);
		System.out.println(result);
		}catch(Exception e) {
			System.out.println("에러발생");
		}
		
	}
	static int devide(int a, int b) {
		int result = a/b ;
		return result;
	}
}
