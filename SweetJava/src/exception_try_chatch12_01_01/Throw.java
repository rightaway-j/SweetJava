package exception_try_chatch12_01_01;

public class Throw {
	public static void main(String args[]) {
		int result = add(1, -2);
		System.out.println(result);

	}
									//예외 선언=자신이 해결 안하고 호출할 곳으로 떠넘김
	static int add(int a, int b) throws Exception { //main 에서 add()메서드 사용에 에러발생하는 것을 사용하면 Exception이라는 에러 발생할거다
													//이렇듯 선언하고 자신을 호출한  main에게 떠넘기기
													//돌아온 에러는 그 main이  try/catch혹은 (String args[]) throws Exception
													//선언하여 조상에게 떠넘기기(jvm이 처리)
		int result = a + b;
		if (result < 0)
			throw new Exception("에러발생"); //이 에러에는 이렇게 내용 전달해라.
		return result;
	}
}
