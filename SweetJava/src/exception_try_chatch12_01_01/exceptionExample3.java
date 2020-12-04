package exception_try_chatch12_01_01;

public class exceptionExample3 {
	public static void main(String args[]) {
		int num1 = 3, num2 = 0;
		try {
			
			int result = num1 / num2;
			System.out.println(result);
		}catch (java.lang.ArithmeticException e) { //오류나는 문장 붙여놓고 변수 아무꺼나(e) 입력해준다
			System.out.println("0으로 나누지 마세요~");
			//ArithmeticException객체에 있는 에러 메시지를 가져온다.
			String message = e.getMessage();
			System.out.println(message);
		}
	}
}
